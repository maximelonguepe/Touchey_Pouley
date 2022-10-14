package com.touchey_pouley.controllers;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.game.poulets.Poulet;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("play")
public class PlayController {

    @GetMapping(path = "")
    public ResponseEntity getAgencyByIdOrName(@PathParam("x") Integer x, @PathParam("y") Integer y) {
        Game game= Game.getInstance();
        Coordonnees coordonnee=new Coordonnees(x,y);
        if(!game.isStarted()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Les poulets n'ont pas encore trouvé leur place");
        }
        if(game.getPouletPositions().contains(coordonnee)){
            for(Poulet poulet : game.getPouletList()) {
                if (poulet.getCoordonnees().contains(coordonnee)){
                    poulet.incrementeHit();
                    poulet.supprimeCoordonnee(coordonnee);
                    game.supprimeCoordonnee(coordonnee);
                    game.setStatus("hit");
                    if(poulet.isPouletDown()){
                        game.deleteRemainingPoulet(poulet);
                        if(game.getRemainingChikens().size()==0){
                            game.setStarted(false);
                            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Vous avez gagnéééééééé");

                        }
                    }
                }
            };
        }
        else {
            game.setStatus("missed");
        }
        game.ajouterCoordonneeJouee(coordonnee);
        return new ResponseEntity(game,HttpStatus.ACCEPTED);
    }
}
