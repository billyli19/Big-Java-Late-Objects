
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
public class P4_12 {

    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        sc.close();
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length() - i; j++) {
                System.out.println(word.substring(j, j + i + 1));
            }
        }
    }
}
