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

    public static Poulexis getInstance() {
        if(instance==null){
            instance=new Poulexis();
        }
        return instance;
    }
}
