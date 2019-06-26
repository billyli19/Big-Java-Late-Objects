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
public class P2_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gasInTank;
        double efficiency;
        double gasPrice;
        double cost;
        double miles;
        final double MILES = 100;

        System.out.println("Please enter the remaining amount of gas in the tank:");
        gasInTank = sc.nextDouble();
        System.out.println("Please enter the efficiency in miles per gallon:");
        efficiency = sc.nextDouble();
        System.out.println("Please enter price of gas per gallon:");
        gasPrice = sc.nextDouble();
        sc.close();

        cost = (MILES / efficiency) * gasPrice;
        System.out.println("The cost per 100 miles is: " + cost);

        miles = gasInTank * efficiency;
        System.out.println("The car can go " + miles + " miles");

    }
}
