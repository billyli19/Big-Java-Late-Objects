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
public class P2_04 {

    public static void main(String[] args) {
        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Please enter second number: ");
        int y = sc.nextInt();
        sc.close();

        int sum = (x + y);
        int difference = (x - y);
        int product = (x * y);
        int average = (x + y) / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(x, y);
        int minimum = Math.min(x, y);

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);
        System.out.println("The absolute value of the difference is: " + distance);
        System.out.println("The larger number is: " + maximum);
        System.out.println("The smallest number is: " + minimum);
    }
}
