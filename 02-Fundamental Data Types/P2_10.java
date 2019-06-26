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
public class P2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double newCarPrice;
        double milesPerYear;
        double gasPrice;
        double efficiency;
        double resaleValue;

        System.out.println("Please enter cost of a new car:");
        newCarPrice = sc.nextDouble();
        System.out.println("Please enter estimate miles per year:");
        milesPerYear = sc.nextDouble();
        System.out.println("Please enter estimate gas price:");
        gasPrice = sc.nextDouble();
        System.out.println("Please enter the efficiency in miles per gallon:");
        efficiency = sc.nextDouble();
        System.out.println("Please enter the estimate resale vaue after 5 years:");
        resaleValue = sc.nextDouble();
        sc.close();

        double totalCost = newCarPrice + (milesPerYear / efficiency) * gasPrice;
        double costAfterResale = totalCost - resaleValue;

        if (totalCost > resaleValue) {
            System.out.println("Loss");
        } else {
            System.out.println("profit");
        }
        System.out.println("Total cost of the car after 5 years is: " + totalCost);
        System.out.println("Cost for car after resale is: " + costAfterResale);
    }
}
