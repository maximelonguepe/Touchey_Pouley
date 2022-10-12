package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.utils.GenerateCoord;

import java.util.List;

public class PouleThierry extends Poulet {
    private static List<Coordonnees> coordonnees;
    private static int tailleX;
    private static int tailleY;

    private static int hit;


    public static void init() {
        tailleX = 4;
        tailleY = 4;
        hit = 0;
        generateCoords();
    }

    private static void generateCoords() {
        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        coordonnees = GenerateCoord.generateOtherCoords(premiereCoordonnee, tailleX, tailleY);
    }
}


