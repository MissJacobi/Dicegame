package se.jensen.felicia.DiceGame;

import java.util.Scanner;

public class Game {

public void playGame(){

    Dice dice = new Dice();

    Scanner scanner = new Scanner(System.in);

    Player player1 = new Player();
    Player player2 = new Player();

    System.out.println("Player one enter your firstname :");
    String firstname1 = scanner.nextLine();
    player1.setFirstname(firstname1);
    System.out.println("Player one enter your lastname:");
    String lastname1 = scanner.nextLine();
    player1.setLastname(lastname1);


    System.out.println("Player two enter your firstname:");
    String firstname2 = scanner.nextLine();
    player2.setFirstname(firstname2);
    System.out.println("Player two enter your lastname:");
    String lastname2 = scanner.nextLine();
    player2.setLastname(lastname2);

    System.out.println("Write Play to start game or Quit to end.");
    String play = scanner.nextLine();
    if(play.equals("Play")) {
        dice.playerScore(player1);
        dice.playerScore(player2);

        if(player1.getScore() > player2.getScore()) {
            System.out.println("YOU WON PLAYER ONE: ");player1.getFullName();
        }
        if(player1.getScore() < player2.getScore()) {
            System.out.println("YOU WON PLAYER TWO: "); player2.getFullName();
        }
        if(player1.getScore() == player2.getScore()){
            System.out.println("IT IS TIE! ");
        }
        if(play.equals("Quit")){
        }

    }

    scanner.close();

}
}
