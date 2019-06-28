
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
public class P3_05 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a;
       int b;
       int c;
       
       System.out.println("Please enter first number: ");
       a = sc.nextInt();
       System.out.println("Please enter second number: ");
       b = sc.nextInt();
       System.out.println("Please enter third number: ");
       c = sc.nextInt();
       
       if(a < b && b < c){
           System.out.println("Increasing");
       } else if( a > b && b > c){
           System.out.println("Decreasing");
       } else {
           System.out.println("Neither");
       }
       sc.close();
   } 
}
