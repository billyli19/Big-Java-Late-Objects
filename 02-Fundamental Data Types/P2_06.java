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
public class P2_06 {

    public static void main(String[] args) {
        System.out.println("Please enter a value");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();

        double meterToMiles = (number / 1609.344);
        double meterToFeet = (number * 3.281);
        double meterToInches = (number * 39.37);

        System.out.println(number + " meter converted to miles is: " + meterToMiles);
        System.out.println(number + " meter converted to feet is: " + meterToFeet);
        System.out.println(number + " meter converted to inches is: " + meterToInches);

    }
}
