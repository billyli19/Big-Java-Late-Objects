
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
public class P4_05 {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter values: ");
         
         int smallest = Integer.MAX_VALUE;
         int largest = Integer.MIN_VALUE;
         int average = 0;
         int currentSum = 0;
         int countNumbers = 0;
         int range = 0;
         
         while(sc.hasNextInt()){
             int newInt = sc.nextInt();
             
             if(newInt > largest){
                 largest = newInt;
             }
             if(newInt < smallest){
                 smallest = newInt;
             }
             
             currentSum += newInt;
             countNumbers++;
             average = currentSum / countNumbers;
             range = Math.abs(smallest - largest);
         }
         
         System.out.println("Average: " + average);
         System.out.println("Smallest value: " + smallest);
         System.out.println("Largest value: " + largest);
         System.out.println("Range: " + range);
         
         sc.close();
         
     }
}
