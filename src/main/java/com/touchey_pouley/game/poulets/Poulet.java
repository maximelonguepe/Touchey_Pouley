package com.touchey_pouley.game.poulets;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.touchey_pouley.game.Coordonnees;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Poulet {
    @JsonIgnore
    private List<Coordonnees> coordonnees;
    @JsonIgnore
    private int tailleX;
    @JsonIgnore
    private int tailleY;
    @JsonIgnore
    private int hit;
    private String name;

    public void init() {

    }

    public void initName() {
        this.name = this.getClass().getSimpleName();
    }

    public void incrementeHit(){
        hit++;
    }

    public void supprimeCoordonnee(Coordonnees coordonnee){
        coordonnees.remove(coordonnee);
    }

    @JsonIgnore
    public boolean isPouletDown(){
        return tailleX*tailleY==hit;
    }



}
