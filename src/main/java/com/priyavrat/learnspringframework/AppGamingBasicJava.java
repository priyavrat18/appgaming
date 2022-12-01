package com.priyavrat.learnspringframework;

import com.priyavrat.learnspringframework.game.GameRunner;
import com.priyavrat.learnspringframework.game.MarioGame;
import com.priyavrat.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();

    }
}
