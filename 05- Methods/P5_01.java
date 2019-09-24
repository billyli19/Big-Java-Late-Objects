
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
public class P5_01 {

    public static double smallest(double x, double y, double z) {
        double smallest = 0;
        if ((x < y) && (x < z)) {
            smallest = x;
        } else if ((y < x) && (y < z)) {
            smallest = y;
        } else {
            smallest = z;
        }
        System.out.println("Smalles: " + smallest);
        return smallest;
    }

    public static double average(double x, double y, double z) {
        double average = ((x + y + z) / 3);
        System.out.println("Average: " + average);
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value x: ");
        double x = sc.nextDouble();
        System.out.println("Please enter value y: ");
        double y = sc.nextDouble();
        System.out.println("Please enter value z: ");
        double z = sc.nextDouble();
        sc.close();

        smallest(x,y,z);
        average(x,y,z);
    }
}
