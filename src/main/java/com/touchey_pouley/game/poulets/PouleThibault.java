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


    public PouleThibault() {
    }

    public static PouleThibault getInstance() {
        if(instance==null){
            instance=new PouleThibault();
        }
        return instance;
    }
}
