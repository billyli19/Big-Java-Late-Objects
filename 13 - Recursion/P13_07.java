
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
public class P13_07 {
    public static int indexOf(String text, String txt){
        text = text.toLowerCase();
        txt = txt.toLowerCase();
        
        return indexOf(text, txt, 0);
    }
    
    public static int indexOf(String text, String txt, int n){
        if(text.length() >= txt.length()){
            if(txt.equals(text.substring(0, txt.length()))){
                return n;
            } else {
                return indexOf(text.substring(1), txt, n + 1);
            }
        } else {
            return -1;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String text = sc.nextLine();
        System.out.print("Please enter key-word: ");
        String txt = sc.nextLine();
        

        int n  = indexOf(text, txt);
        
        System.out.println(n);
    }
}
