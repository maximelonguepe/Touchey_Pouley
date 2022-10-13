package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.RandomGenerator;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Poulexandre extends Poulet {
    private static Poulexandre instance;

    public void init() {

        this.setTailleX(1);
        this.setTailleY(3);
        this.setHit(0);
        generateCoords();
    }

    private void generateCoords() {

        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        int rand = RandomGenerator.randomWithZero(1);
        //permet de mettre le poulet verticalement ou horizontalement
        if (rand == 0) {
           this.setCoordonnees(GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleX(), getTailleY()));

        } else {
            this.setCoordonnees(GenerateCoord.generateOtherCoords(premiereCoordonnee, this.getTailleY(), this.getTailleX()));
        }
        Game.getInstance().addPouletPositions(this.getCoordonnees());

    }

    public static Poulexandre getInstance() {
        if(instance==null){
            instance=new Poulexandre();
        }
        return instance;
    }
}
