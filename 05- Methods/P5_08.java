
import java.util.Random;
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
public class P5_08 {
    public static String scramble(String word){
        Scanner sc = new Scanner(System.in);
        System.out.print(word);
        word = sc.next();
        sc.close();
        
        if(word.length() > 3){
            int i = (int) (Math.random() * (word.length() - 3)) + 1;
            int j = (int) (Math.random() * (word.length() - i -2 ) + i + 1);
            return word.substring(0, i) + word.charAt(j) + word.substring(i + 1, j) + word.charAt(i) + word.substring(j + 1);
        } else {
            return word;
        }
    }
    
    public static void main(String args[]){

        
        System.out.print(scramble("Enter a word: "));
        
    }
}
