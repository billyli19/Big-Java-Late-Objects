
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
public class P5_07 {

    public static int countVowels(String str) {
        int count = 1;
        boolean isSpace = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!isSpace) {
                    isSpace = true;
                    count++;
                }
            } else {
                isSpace = false;
            }
        }
        if (str.endsWith(" ")) {
            count--;
        }

        System.out.println("Amount of words: " + count);
        return count;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String word = sc.nextLine();
        sc.close();

        countVowels(word);
    }
}
