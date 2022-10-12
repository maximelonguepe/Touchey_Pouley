package com.touchey_pouley.game;

import com.touchey_pouley.game.poulets.*;

import java.util.List;

public class Game {
    private static List<Coordonnees> coordonnees;


    public static void startGame(){
        PouleTony.init();
        PouleThierry.init();
        PouleThibault.init();
        Poulexis.init();
    }
}
