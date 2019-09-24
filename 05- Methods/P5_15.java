
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
public class P5_15 {
    public static String reverse(String str){
        if(str.length() > 1){
            return reverse(str.substring(1)) + str.charAt(0);
        }
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        System.out.println(reverse(word));
        sc.close();   
    }
}
