
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
public class P3_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter;
        String letterType;

        System.out.println("Please enter a single letter");
        letter = sc.nextLine();

        if (letter.length() > 1) {
            System.out.println("ERROR: not a single letter");
        }
        while (!letter.matches("[a-zA-Z]")) {
            System.out.println("ERROR: not a alphabet letter");
            System.out.println("Please enter a single letter");
            letter = sc.nextLine();
        }

        if (letter.matches("[A,E,O,U,I, a, e, o, u ,i]")) {
            letterType = "vowel";
        } else {
            letterType = "constant";
        }

        System.out.println("Letter: " + letter + " is a " + letterType);
    }
}
