
import java.util.Random;
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
public class P4_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random number = new Random();
        int numberLeft = number.nextInt(100 - 10) + 10;
        int computerMode = number.nextInt(2);
        int subtraction;
        boolean turn = number.nextBoolean();

        System.out.println("Number of marbles: " + numberLeft);

        if (computerMode == 0) {
            System.out.println("The computer is in smart-mode");
        }
        if (computerMode == 1) {
            System.out.println("The computer is in dumb-mode");
        }

        while (numberLeft > 1) {
            if (turn == true) {
                System.out.println("It is your turn...");
                System.out.println("Please enter the number you wish to take from the pile (Remember it has to be less or equal to " + numberLeft / 2 + "): ");
                subtraction = sc.nextInt();
                System.out.println("You took " + subtraction + " from the pile.");
                numberLeft = numberLeft - subtraction;
                System.out.println("The number left is " + numberLeft);
                turn = false;
               
            }
            if (turn == false) {
                System.out.println("It is the computer's turn...");
                if (computerMode == 0) {
                    numberLeft = smartComputer(numberLeft);
                    System.out.println("The number left is " + numberLeft);
                }

                if (computerMode == 1) {
                    int computerTake = number.nextInt(numberLeft /2);
                    numberLeft = numberLeft - computerTake;
                    System.out.println("The computer took: " + computerTake + " from the pile.");
                    System.out.println("The number left is " + numberLeft);
                }
                turn = true;
            }
        }

        if (numberLeft <= 1) {
            if (turn = false) {
                System.out.println("You Win!");
            } else {
                System.out.println("You lost...");
            }
            System.exit(0);
        }
    }

    public static int smartComputer(int num) {
        int power = 2;
        while (power < num) {
            power = power * 2;
        }
        power = power / 2;
        num = power - 1;
        System.out.println("The computer took: " + num + " from the pile.");
        return num;
    }
}
