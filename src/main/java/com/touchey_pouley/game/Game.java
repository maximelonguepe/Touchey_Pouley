package com.touchey_pouley.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.touchey_pouley.game.poulets.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Game {
    private String status;
    @JsonIgnore
    private boolean started;
    @JsonIgnore
    private static Game instance;
    private  List<Coordonnees> playedCoordinates;
    @JsonIgnore
    private List<Coordonnees> pouletPositions;
    private List<Poulet> pouletList;

    private List<Poulet> remainingChikens;

    public void startGame(){
        started=true;
        pouletPositions =new ArrayList<>();
        pouletList=new ArrayList<>();
        playedCoordinates=new ArrayList<>();
        remainingChikens=new ArrayList<>();
        pouletList.add(PouleTony.getInstance());
        pouletList.add(PouleThierry.getInstance());
        pouletList.add(PouleThibault.getInstance());
        pouletList.add(Poulexis.getInstance());
        pouletList.add(Poulexandre.getInstance());

        pouletList.forEach(Poulet::init);
        remainingChikens.addAll(pouletList);
        System.out.println(pouletList);

    }

    public void addPouletPositions(List<Coordonnees> coordonnees ){
        this.pouletPositions.addAll(coordonnees);
    }
    public static Game getInstance() {
        if(instance==null){
            instance=new Game();
        }
        return instance;
    }

    public void supprimeCoordonnee(Coordonnees coordonnees){
        pouletPositions.remove(coordonnees);
    }

    public void ajouterCoordonneeJouee(Coordonnees coordonnees){
        playedCoordinates.add(coordonnees);
    }

    public void deleteRemainingPoulet(Poulet poulet){
        remainingChikens.remove(poulet);
    }
}
