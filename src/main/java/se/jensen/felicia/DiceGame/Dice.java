package se.jensen.felicia.DiceGame;

import java.util.Random;

public class Dice {
    Random random = new Random();

    public void playerScore(Player player) {
        int sum = 0;
        for(int i = 0; i < 2 ; i++) ;
        {
            int roll = random.nextInt(1, 7);
            player.addToScore(roll);
        }

    }
}


