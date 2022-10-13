package com.touchey_pouley.game;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.touchey_pouley.game.poulets.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
public class Game {
    @JsonIgnore
    private boolean started;
    @JsonIgnore
    private static Game instance;
    private  List<Coordonnees> playedCoordinates;
    @JsonIgnore
    private List<Coordonnees> pouletPositions;
    private List<Poulet> pouletList;

    public void startGame(){
        started=true;
        pouletPositions =new ArrayList<>();
        pouletList=new ArrayList<>();
        playedCoordinates=new ArrayList<>();
        pouletList.add(PouleTony.getInstance());
        pouletList.add(PouleThierry.getInstance());
        pouletList.add(PouleThibault.getInstance());
        pouletList.add(Poulexis.getInstance());
        pouletList.add(Poulexandre.getInstance());
        pouletList.forEach(Poulet::init);

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
}
