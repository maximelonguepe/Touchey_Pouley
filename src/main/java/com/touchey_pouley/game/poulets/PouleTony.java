package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import com.touchey_pouley.utils.GenerateCoord;
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
        this.setTailleX(2);
        this.setTailleY(2);
        this.setHit(0);
        generateCoords();
    }

    private void generateCoords() {
        Coordonnees premiereCoordonnee=GenerateCoord.generateCoords();
        this.setCoordonnees(GenerateCoord.generateOtherCoords(premiereCoordonnee,this.getTailleX(),this.getTailleY()));
    }
    public static PouleTony getInstance() {
        if (pouleTony==null){
            pouleTony=new PouleTony();
        }
        return pouleTony;
    }
}

