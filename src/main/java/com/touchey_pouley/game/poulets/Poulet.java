package com.touchey_pouley.game.poulets;

import com.touchey_pouley.game.Coordonnees;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Poulet {
    private List<Coordonnees> coordonnees;
    private int tailleX;
    private int tailleY;

    private int hit;
    private String name;
    public void init() {

    }
    public void initName(){
        this.name=this.getClass().getSimpleName();
    }

}
