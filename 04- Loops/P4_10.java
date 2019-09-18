
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
public class P4_10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.nextLine();
        sc.close();

        int vowels = 0;
        if (word.contains("a")) {
            vowels++;
        }
        if (word.contains("e")) {
            vowels++;
        }
        if (word.contains("o")) {
            vowels++;
        }
        if (word.contains("u")) {
            vowels++;
        }
        if (word.contains("i")) {
            vowels++;
        }
        if (word.contains("y")) {
            vowels++;
        }

        System.out.println("Vowels: " + vowels);
    }
}
