
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
public class P5_17 {
    public static boolean find(String str, String match){
        if(str.length() < match.length()){
            return false;
        }
        else if(str.substring(0, match.length()).equals(match)){
            return true;
        } else {
            return find(str.substring(1), match);
        }    
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        System.out.println("Please enter a match: ");
        String match = sc.next();
        
        System.out.println(find(word, match));
    }
}
