
import java.util.Arrays;
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
public class P6_01 {

    public static void evenIndexElements(int[] values){
        System.out.print("Every elements at an even index: ");
        for(int i = 0; i < values.length; i++){
            if(i % 2 == 0){
                System.out.print("[" + values[i] + "]");
            }
        }
        System.out.println();
    }
    
    public static void evenElements(int[] values){
        System.out.print("Every even element: ");
        for(int i = 0; i < values.length; i++){
            if(values[i] % 2 == 0){
                System.out.print("[" + values[i] + "]");
            }
        }
        System.out.println();
    }
    
    public static void allElementsInReverseOrder(int[] values){
        System.out.print("All elements in reverse order: ");
        for(int i = values.length -1; i > 0; i--){
            System.out.print("[" + values[i] + "]");
        }
        System.out.println();
    }
    
    public static void firstAndLastElement(int[] values){
        System.out.println("First element: " + values[0] + " Last element: " + values[9]);
    }
    
    public static int[] array(){
        Scanner sc = new Scanner(System.in);
        
        final int LENGTH = 10;
        int[] values = new int[LENGTH];
        
        System.out.println("Please enter 10 values");
        for(int i = 0; i < values.length; i++){
            System.out.print("Please enter a value for index " + i + " : ");
            values[i] = sc.nextInt();
        }
        sc.close();
        return values;
    }
    
    public static void main(String args[]) {
     
     int[] values = array();
        
    evenIndexElements(values);
    evenElements(values);
    allElementsInReverseOrder(values);
    firstAndLastElement(values);
    }
}
