package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.Init;

import java.util.List;

public class PouleThibault extends Poulet {
    private static PouleThibault instance;

    public void init() {
        Init.init(this,5,5);
    }

    private void generateCoords() {
        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, this.getTailleX(), this.getTailleY()));
        Game.getInstance().addPouletPositions(this.getCoordonnees());
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
