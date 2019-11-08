
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
public class P13_12 {
    public static void generateSubstring(String str, int n, int index, String curr){
        if(index == n){
            return;
        }
        System.out.println(curr);
        for(int i = index + 1; i < n; i++){
            curr += str.charAt(i);
            generateSubstring(str, n, i , curr);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
    
    public static void substring(String str){
        int index = -1;
        String curr = "";
        
        generateSubstring(str, str.length(), index, curr);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        substring(word);
    }
}
