/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter smallest array size: ");
        int smallest = sc.nextInt();
        
        System.out.print("Enter largest array size: ");
        int largest = sc.nextInt();
        
        System.out.print("Enter number of measurements (greater or equal to 2): ");
        int measurements = sc.nextInt();
        
        for(int i = 0; i < measurements; i++){
            int n = smallest + i * (largest - smallest) / (measurements - 1);
            int[] a = ArrayUtil.randomIntArray(n, 100);
            System.out.println("Before sort: ");
            System.out.println(Arrays.toString(a));
            
            StopWatch timer = new StopWatch();
            timer.start();
            InsertionSorter.sort(a);
            timer.stop();
            
            System.out.println("After sort: ");
            System.out.println(Arrays.toString(a));
            
            
            System.out.println(timer.toString());
        }

    }
}
