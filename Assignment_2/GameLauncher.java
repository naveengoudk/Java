package Assignment_2;

import java.util.Scanner;

class Player {
    Scanner sc = new Scanner(System.in);

    int Takeinput(String s) {
        System.out.println(s + " Please enter your guess");
        int num = sc.nextInt();
        return num;
    }
}

class GuessGame {
    void startGame() {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * (10));

        Player p1 = new Player();
        int p1Input = p1.Takeinput("player-1 :");
        Player p2 = new Player();
        int p2Input = p2.Takeinput("player-2 :");
        Player p3 = new Player();
        int p3Input = p3.Takeinput("player-3 :");

        if (randomNum == p1Input) {
            System.out.println("congrats player-1 , you have won the game");
        }
        if (randomNum == p2Input) {
            System.out.println("congrats player-2 , you have won the game");
        }
        if (randomNum == p3Input) {
            System.out.println("congrats player-3 , you have won the game");
        } else {
            System.out.printf("sorry no one has guessed correctly. The number is %d, try again", randomNum);
        }
    }
}


public class GameLauncher {
    public static void main(String[] args) {
        GuessGame gg = new GuessGame();
        gg.startGame();
    }
}
