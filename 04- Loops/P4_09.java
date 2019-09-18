
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
public class P4_09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        sc.close();
        
        for(int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
