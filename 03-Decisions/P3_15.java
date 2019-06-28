
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
public class P3_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        
        System.out.println("Please enter 3 numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if(a > b && a > c ){
            d = a;
        } else if(b > a && b > c){
            d = a;
        } else {
            d = c;
        }
        System.out.println("The largest number is: " + d);
        sc.close();
    }
}
