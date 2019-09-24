
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
public class P5_06 {

    public static int countVowels(String str) {
        int count = 0;
        boolean isVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'
                    || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                if (!isVowel) {
                    isVowel = true;
                    count++;
                }
            } else {
                isVowel = false;
            }
        }

        System.out.println("Count: " + count);
        return count;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        countVowels(word);
    }
}
