package com.touchey_pouley.controllers;

import com.touchey_pouley.game.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("start")
public class StartController {

    @GetMapping()
    public void startGame(){
        Game.getInstance().startGame();
    }
}
