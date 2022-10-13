package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class PouleThierry extends Poulet {
    private static PouleThierry instance;


    public void init() {
        this.setTailleX(4);
        this.setTailleY(4);
        this.setHit(0);
        generateCoords();
    }

    private void generateCoords() {
        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        this.setCoordonnees(GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleX(), getTailleY()));
        Game.getInstance().addPouletPositions(this.getCoordonnees());

    }

    public static PouleThierry getInstance() {
        if(instance==null){
            instance=new PouleThierry();
        }
        return instance;
    }
}


