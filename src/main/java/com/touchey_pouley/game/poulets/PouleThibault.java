package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.utils.GenerateCoord;

import java.util.List;

public class PouleThibault extends Poulet {
    private static PouleThibault instance;

    public void init() {
        this.setTailleX(5);
        this.setTailleY(5);
        this.setHit(0);
        generateCoords();
    }

    private void generateCoords() {
        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, this.getTailleX(), this.getTailleY()));
    }

    public PouleThibault() {
    }

    public static PouleThibault getInstance() {
        if(instance==null){
            instance=new PouleThibault();
        }
        return instance;
    }
}
