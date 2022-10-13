package com.touchey_pouley.controllers;

import com.touchey_pouley.game.Game;
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
        if(!game.isStarted()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Les poulets n'ont pas encore trouvé leur place");
        }
        return new ResponseEntity(game,HttpStatus.ACCEPTED);
    }
}
