/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P3_29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String feminine = "la ";
        String masculine = "le ";
        String vowel = "l'";
        String plural = "les ";
        String country;
        String letterEnd;
        String letterBegin;

        System.out.println("Please enter country: ");
        country = sc.nextLine();

        letterEnd = Character.toString(country.charAt(country.length() - 1));

        if (country.equals("Etats-Unis")) {
            country = plural + country;
        } else if (country.equals("Pays-Bas")) {
            country = plural + country;
        } else if (country.charAt(0) == 'A' || country.charAt(0) == 'E' || country.charAt(0) == 'O'
                || country.charAt(0) == 'U' || country.charAt(0) == 'I') {
            country = vowel + country;
        } else if (country.equals("Belize")) {
            country = masculine + country;
        } else if (country.equals("Cambodge")) {
            country = masculine + country;
        } else if (country.equals("Mexique")) {
            country = masculine + country;
        } else if (country.equals("Mozambique")) {
            country = masculine + country;
        } else if (country.equals("Zaïre")) {
            country = masculine + country;
        } else if (country.equals("Zimbabwe")) {
            country = masculine + country;
        } else if (letterEnd.equals("e")) {
            country = feminine + country;
        } else {
            country = masculine + country;
        }

        System.out.println(country);

    }
}
