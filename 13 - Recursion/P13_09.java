
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
public class P13_09 {
    
    public static int sum(int[] array){
        return sum(array, array.length - 1);
    }
    
    public static int sum(int[] array, int n){
        if(n == 0){
            return array[0];
        } else {
            return array[n] + sum(array, n - 1);
        }
    }
    
    public static int[] array(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Pleae enter value for");
        
        int[] values = new int[LENGTH];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Please enter value for index " + i + " : ");
            values[i] = sc.nextInt();
        }
        sc.close();
        return values;
    }
    
    public static void main(String args[]){
        int[] array = array();
        System.out.println(sum(array));
    }
}
