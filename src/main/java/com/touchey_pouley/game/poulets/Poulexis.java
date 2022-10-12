package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.RandomGenerator;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Poulexis extends Poulet {

    private static Poulexis instance;

    public void init() {
        this.setTailleX(1);
        this.setTailleY(4);
        this.setHit(0);
        generateCoords();
    }

    private void generateCoords() {

        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        int rand = RandomGenerator.randomWithZero(1);
        if (rand == 0) {
            this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleX(), getTailleY()));
        } else {
            this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleY(), getTailleX()));

        }
    }

    public static Poulexis getInstance() {
        if(instance==null){
            instance=new Poulexis();
        }
        return instance;
    }
}
