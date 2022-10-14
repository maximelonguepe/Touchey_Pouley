package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.Init;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class PouleThierry extends Poulet {
    private static PouleThierry instance;


    public void init() {

        Init.init(this,4,4);

    }


    public static PouleThierry getInstance() {
        if(instance==null){
            instance=new PouleThierry();
        }
        return instance;
    }
}


