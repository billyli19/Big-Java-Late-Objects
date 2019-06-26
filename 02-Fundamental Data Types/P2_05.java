
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
public class P2_05 {

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

        System.out.printf("The sum is:                              %3d \n", sum);
        System.out.printf("The difference is:                       %3d \n", difference);
        System.out.printf("The product is:                          %3d \n", product);
        System.out.printf("The average is:                          %3d \n", average);
        System.out.printf("The absolute value of the difference is: %3d \n", distance);
        System.out.printf("The larger number is:                    %3d \n", maximum);
        System.out.printf("The smallest number is:                  %3d \n", minimum);
    }
}
