
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
public class P13_03 {
    public static String reverse(String s){
        if(s.length() <= 1){
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String text = sc.next();
        System.out.println("Reversed: " + reverse(text));
    }
}
