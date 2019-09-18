
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
public class P4_11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();

        int count = 0;
        boolean isVowel = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                if (!isVowel) {
                    isVowel = true;
                    count++;
                }
            } else {
                isVowel = false;
            }
        }
        if (word.endsWith("e")) {
            count--;
        }
        if (count == 0) {
            count = 1;
        }
        System.out.println(word + " has " + count + " syllables");
    }
}
