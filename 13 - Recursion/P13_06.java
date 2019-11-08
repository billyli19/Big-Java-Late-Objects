
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
public class P13_06 {

    public static boolean find(String text, String txt) {
        boolean isFound = text.length() >= txt.length();
        return isFound && (txt.equals(text.substring(0, txt.length())) || find(text.substring(1), txt));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a text: ");
        String text = sc.nextLine();
        System.out.print("Please enter key-word: ");
        String txt = sc.nextLine();

        boolean result = find(text.toLowerCase(), txt.toLowerCase());

        if (result) {
            System.out.println("word found!");
        } else {
            System.out.println("Word not found!");
        }
    }
}
