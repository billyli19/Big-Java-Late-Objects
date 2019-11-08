
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
public class P13_05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a message: ");
        String message = sc.nextLine();
        
        System.out.print("Reversed: ");
        for(int i = message.length() - 1; i >= 0; i--){
            System.out.print(message.charAt(i));
        }
    }
}