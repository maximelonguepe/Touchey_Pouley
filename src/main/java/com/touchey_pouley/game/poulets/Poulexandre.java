package com.touchey_pouley.game.poulets;
import com.touchey_pouley.utils.Init;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
public class Poulexandre extends Poulet {
    private static Poulexandre instance;

    public void init() {

        Init.init(this,1,3);

    }

    public static Poulexandre getInstance() {
        if(instance==null){
            instance=new Poulexandre();
        }
        return instance;
    }
}
