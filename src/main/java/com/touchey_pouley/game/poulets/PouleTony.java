package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.game.Game;
import com.touchey_pouley.utils.GenerateCoord;
import com.touchey_pouley.utils.Init;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor

public class PouleTony extends Poulet {
    private static PouleTony pouleTony;
    public void init() {
        Init.init(this,2,2);

    }

    public static PouleTony getInstance() {
        if (pouleTony==null){
            pouleTony=new PouleTony();
        }
        return pouleTony;
    }
}

