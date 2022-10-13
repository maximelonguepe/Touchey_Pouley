package com.touchey_pouley.game;

import com.touchey_pouley.game.poulets.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Game {
    private static Game instance;
    private  List<Coordonnees> playedCoordinates;
    private List<Coordonnees> pouletPositions;
    private List<Poulet> pouletList;

    public void startGame(){
        pouletPositions =new ArrayList<>();
        pouletList=new ArrayList<>();
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
