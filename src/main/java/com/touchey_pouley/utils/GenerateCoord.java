package com.touchey_pouley.utils;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.parameters.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateCoord {

    public static Coordonnees generateCoords() {
        int taille = Parameters.getTaille();

        Random r = new Random();
        int x = r.nextInt((taille) + 1);
        int y = r.nextInt((taille) + 1);
        return new Coordonnees(x, y);
    }

    public static List<Coordonnees> generateOtherCoords(Coordonnees coordonnees, int tailleX, int tailleY) {
        List<Coordonnees> coordonneesList = new ArrayList<>();
        int x = coordonnees.getX();
        int y = coordonnees.getY();
        int gauche = 0;
        int droite = 0;
        int haut = 0;
        int bas = 0;
        if (x + tailleX > 50) {
            gauche = 1;
        } else if (x - tailleX < 0) {
            droite = 1;
        }

        if (y + tailleY > 50) {
            haut = 1;
        } else if (y - tailleY < 0) {
            bas = 1;
        }

        if (gauche == 0 && droite == 0) {
            Random r = new Random();
            int randomDroiteOuGauche = r.nextInt((1) + 1);
            if(randomDroiteOuGauche==0){
                gauche=1;
            }
            else{
                droite=1;
            }
        }

        if (haut == 0 && bas == 0) {
            Random r = new Random();
            int randomHautBas = r.nextInt((1) + 1);
            if(randomHautBas==0){
                haut=1;
            }
            else{
                bas=1;
            }
        }

        if (gauche == 1) {

            for (int i = coordonnees.getX(); i > coordonnees.getX()-tailleX; i--) {
                if (haut==1){
                    for (int j=coordonnees.getY();j> coordonnees.getY()-tailleY;j--){
                        coordonneesList.add(new Coordonnees(i,j));
                    }
                }
                else{
                    for (int j=coordonnees.getY();j< coordonnees.getY()+tailleY;j++){
                        coordonneesList.add(new Coordonnees(i,j));
                    }
                }

            }

        }
        else{
            for (int i = coordonnees.getX(); i < coordonnees.getX()+tailleX; i++) {
                if (haut==1){
                    for (int j=coordonnees.getY();j> coordonnees.getY()-tailleY;j--){
                        coordonneesList.add(new Coordonnees(i,j));
                    }
                }
                else{
                    for (int j=coordonnees.getY();j< coordonnees.getY()+tailleY;j++){
                        coordonneesList.add(new Coordonnees(i,j));
                    }
                }

            }
        }
        return coordonneesList;

    }
}
