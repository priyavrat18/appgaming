package com.priyavrat.learnspringframework;

import com.priyavrat.learnspringframework.game.GameRunner;
import com.priyavrat.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }
}
