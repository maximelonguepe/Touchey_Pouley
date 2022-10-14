package com.touchey_pouley.utils;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.game.poulets.Poulet;

public class Init {

    public static void init(Poulet poulet, int tailleX, int tailleY) {
        poulet.setTailleX(tailleX);
        poulet.setTailleY(tailleY);
        poulet.setHit(0);
        poulet.initName();

        generateCoords(poulet);
    }

    private static void generateCoords(Poulet poulet) {


        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        if (poulet.getTailleX() == poulet.getTailleY())
            poulet.setCoordonnees(GenerateCoord.generateOtherCoords(premiereCoordonnee, poulet.getTailleX(), poulet.getTailleY()));
        else {
            int rand = RandomGenerator.randomWithZero(1);
            if (rand == 0) {
                poulet.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, poulet.getTailleX(), poulet.getTailleY()));
            } else {
                poulet.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, poulet.getTailleY(), poulet.getTailleX()));
            }
        }
        Game.getInstance().addPouletPositions(poulet.getCoordonnees());

    }
}
