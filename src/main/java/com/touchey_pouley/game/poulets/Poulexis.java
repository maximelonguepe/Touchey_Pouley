package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.Init;
import com.touchey_pouley.utils.RandomGenerator;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Poulexis extends Poulet {

    private static Poulexis instance;

    public void init() {
        Init.init(this,1,4);

    }

    private void generateCoords() {

        Coordonnees premiereCoordonnee = GenerateCoord.generateCoords();
        int rand = RandomGenerator.randomWithZero(1);
        if (rand == 0) {
            this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleX(), getTailleY()));
        } else {
            this.setCoordonnees( GenerateCoord.generateOtherCoords(premiereCoordonnee, getTailleY(), getTailleX()));
        }
        Game.getInstance().addPouletPositions(this.getCoordonnees());

    }

    public static Poulexis getInstance() {
        if(instance==null){
            instance=new Poulexis();
        }
        return instance;
    }
}
