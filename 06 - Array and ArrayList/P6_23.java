/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P6_23 {

    public static void printArray(int LENGTH, String[] names, int[] numbers) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.printf("%10s ", names[i]);

            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter length: ");
        final int LENGTH = sc.nextInt();

        int[] numbers = new int[LENGTH];
        String[] captions = new String[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Please enter caption: ");
            captions[i] = sc.next();
            System.out.print("Please enter number: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] < 0) {
                numbers[i] = -numbers[i];
            }
        }
        sc.close();

        printArray(LENGTH, captions, numbers);

    }
}
