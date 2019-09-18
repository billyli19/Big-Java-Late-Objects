
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
public class P4_07 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        sc.close();

        Random r = new Random();
        for (int k = 0; k < word.length(); k++) {
            int i = r.nextInt(word.length() - 1);
            int j = r.nextInt(word.length() - i - 1) + i + 1;
            String first = word.substring(0, i);
            String middle = word.substring(i + 1, j);
            String last = word.substring(j + 1);
            
            word = first + word.charAt(j) + middle + word.charAt(i) + last;
        }
        System.out.println(word);
    }
}
