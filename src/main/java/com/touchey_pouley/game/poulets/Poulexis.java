package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.RandomGenerator;

import java.util.List;

public class Poulexis extends Poulet {

    private static List<Coordonnees> coordonnees;
    private static int tailleX;
    private static int tailleY;

    private static int hit;

    public static void init() {
        tailleX = 1;
        tailleY = 4;
        hit = 0;
        generateCoords();
    }

    private static void generateCoords() {

        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        int rand = RandomGenerator.randomWithZero(1);
        if (rand == 0) {
            coordonnees = GenerateCoord.generateOtherCoords(premiereCoordonnee, tailleX, tailleY);
        } else {
            coordonnees = GenerateCoord.generateOtherCoords(premiereCoordonnee, tailleY, tailleX);
        }
    }
}
