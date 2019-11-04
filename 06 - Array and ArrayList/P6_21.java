
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
public class P6_21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length: ");
        
        final int LENGHT = sc.nextInt();
        int[] array = new int[LENGHT];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Please enter number: ");
            array[i] = sc.nextInt();
        }
        
        for(int i = 0; i < array.length;i++){
            int number = array[i];
            for(int j = 0; j < number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
