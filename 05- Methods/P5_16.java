
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
public class P5_16 {
    public static boolean isPalindrome(String str){
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        } else if(str.length() <= 2){
            return true;
        } else {
            return isPalindrome(str.substring(1, str.length() -1));
        }
    }
    
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        System.out.println(isPalindrome(word));
        sc.close();
    }
}
