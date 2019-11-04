
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P6_25 {

    public static int row, col;
    public static Scanner sc = new Scanner(System.in);
    public static char[][] board = new char[3][3];
    public static char playerTurn = 'O';
    public static int playerChance = 8;

    public static void play() {
        boolean playing = true;
        printBoard();
        System.out.println("Player " + playerTurn + "'s turn to play! ");

        while (playing) {
            System.out.println("\nEnter row and column ");
            row = sc.nextInt() - 1;
            col = sc.nextInt() - 1;
            board[row][col] = playerTurn;

            printBoard();
            if (gameOver(row, col)) {
                playing = false;
                System.out.println("Game over! Player " + playerTurn + " wins!");
            }
            if (playerChance == 1) {
                playing = false;
                System.out.println("Game over! It's a tie!");
            }

            if (playerTurn == 'X') {
                playerTurn = 'O';
            } else {
                playerTurn = 'X';
            }

            if (playerTurn == 'X') {
                System.out.println("Player " + playerTurn + "'s turn to play");
                playerChance--;
            } else if (playerTurn == 'O') {
                System.out.println("Player " + playerTurn + "'s turn to play");
                playerChance--;
            }
        }
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j] + "|");
            }
        }
        System.out.println();
    }

    public static boolean gameOver(int move1, int move2) {
        if (board[0][move2] == board[1][move2] && board[0][move2] == board[2][move2]) {
            return true;
        }
        if (board[move1][0] == board[move1][1] && board[move1][0] == board[move1][2]) {
            return true;
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_') {
            return true;
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_') {
            return true;
        }
        return false;
    }

    public static String userChoice() {
        System.out.println("Please type 'P' to play. ('Q' to quit): ");
        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase();
    }

    public static boolean isPlay(String s) {
        return s.equalsIgnoreCase("P");
    }

    public static boolean isQuit(String s) {
        return s.equalsIgnoreCase("Q");
    }

    public static void main(String args[]) {
        boolean done = false;
        while (!done) {
            String userChoice = userChoice();
            if (isPlay(userChoice)) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        board[i][j] = '_';
                    }
                }
                play();
            } else if (isQuit(userChoice)) {
                System.exit(0);
            } else {
                System.out.println("Error, please type 'P' or 'Q'");
            }
        }
    }
}
