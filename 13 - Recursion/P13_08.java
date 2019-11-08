
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
public class P13_08 {
    
    public static int largest(int[] array){
        return largest(array, 0 , array.length - 1);
    }
    
    public static int largest(int[] array, int first, int last){
        int max;
        
        if(first == last){
            return array[first];
        } else {
            max = largest(array, first + 1, last);
            
            if(array[first] >= max){
                return array[first];
            } else {
                return max;
            }
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
        
        System.out.println("Largest value is: " + largest(array));
        
    }
}
