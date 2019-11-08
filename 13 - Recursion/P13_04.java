
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
public class P13_04 {

    public static String reverse(String s) {
        return reverse(s, 0, s.length() - 1);
    }

    public static String reverse(String text, int start, int end) throws IllegalArgumentException {
        if (start > end) {
            throw new IllegalArgumentException("Error, message length start must be smaller than length end");
        }
        if (start == end) {
            return text;
        } else {
            return reverse(text.substring(1), start + 1, end) + text.charAt(0);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a message: ");
        String s = sc.nextLine();
        
        System.out.println("Reversed: " + reverse(s));

    }
}
