
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
public class P4_20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        sc.close();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number * 2 + 1; j++) {
                if ((j == number) || (i > 0 && i < number - 1 && j > number + 1 && j < number * 2)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
