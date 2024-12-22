package game;

import java.util.Scanner;

class Guesser {
    int GuesserNum;
    public int GuesserNumb() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser, guess the number");
        GuesserNum = scan.nextInt();
        return GuesserNum;
    }
}

class Player {
    int PlayerNum;
    public int PlayerNumb() {
        Scanner scan = new Scanner(System.in);
        PlayerNum = scan.nextInt();
        return PlayerNum;
    }
}

class Umpire {
    int guesserNum;
    int player1Num;
    int player2Num;
    int player3Num;
    int player4Num;
    boolean p1 = false;
    boolean p2 = false;
    boolean p3 = false;
    boolean p4 = false;

    public void CollectNumFromGuesser() {
        Guesser gu = new Guesser();
        guesserNum = gu.GuesserNumb();
    }

    public void CollectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();

        System.out.println("Player 1, guess the number");
        player1Num = p1.PlayerNumb();
        System.out.println("Player 2, guess the number");
        player2Num = p2.PlayerNumb();
        System.out.println("Player 3, guess the number");
        player3Num = p3.PlayerNumb();
        System.out.println("Player 4, guess the number");
        player4Num = p4.PlayerNumb();
    }

    public void compare() {
        if (guesserNum == player1Num) p1 = true;
        if (guesserNum == player2Num) p2 = true;
        if (guesserNum == player3Num) p3 = true;
        if (guesserNum == player4Num) p4 = true;

        if (p1) {
            if (p2){
                if (p3 && p4) System.out.println("All player won the game");
                else if (p3) System.out.println("Player 4 lost");
                else if (p4) System.out.println("Player 3 lost");
                else System.out.println("Player 1 & 2 won");
            } else if (p3) {
                if (p4) System.out.println("Player 2 lost");
                else System.out.println("Player 1 & 3 won");
            } else if (p4) {
                System.out.println("Player 1 & 4 won");
            } else System.out.println("Player 1 won");
        } else if (p2) {
            if (p3 && p4) System.out.println("Player 1 lost");
            else if (p3) System.out.println("Player 2 & 3 won");
            else if (p4) System.out.println("Player 2 & 4 won");
            else System.out.println("Player 2 won");
        } else if (p3) {
            if (p4) System.out.println("Player 3 & 4 won");
            else System.out.println("Player 3 won");
        } else System.out.println("Player 4 won");
    }
}

public class game {
    public static void main(String[] args) {

    }
}
