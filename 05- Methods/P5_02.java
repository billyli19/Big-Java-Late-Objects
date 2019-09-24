
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
public class P5_02 {
    public static boolean allTheSame(double x, double y, double z){
        boolean allTheSame;
        if((x == y) && (y == z)){
            allTheSame = true;
        } else {
            allTheSame = false;
        }
        System.out.println("All the same: " + allTheSame);
        return allTheSame;
    }
    
    public static boolean allDifferent(double x, double y, double z){
        boolean allDifferent;
        if((x != y) || (y != z) || (x != z)){
            allDifferent = true;
        } else {
            allDifferent = false;
        }
        System.out.println("All different: " + allDifferent);
        return allDifferent;
    }
    
    public static boolean sorted(double x, double y, double z){
        boolean sorted;
        if((x < y) && (y < z)){
            sorted = true;
        } else {
            sorted = false;
        }
        System.out.println("All sorted: " + sorted);
        return sorted;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value x: ");
        double x = sc.nextDouble();
        System.out.println("Please enter value y: ");
        double y = sc.nextDouble();
        System.out.println("Please enter value z: ");
        double z = sc.nextDouble();
        sc.close();
        
        allTheSame(x,y,z);
        allDifferent(x,y,z);
        sorted(x,y,z);
    }
}
