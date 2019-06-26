/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P2_18 {

    public static void main(String[] args) {
        final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *";
        final String LETTER_E = "*****\n*\n*****\n*\n*****";
        final String LETTER_L = "*\n*\n*\n*\n*****";
        final String LETTER_O = " *** \n*   *\n*   *\n*   *\n *** ";
        final String HELLO = (LETTER_H + "\n\n" + LETTER_E + "\n\n" + LETTER_L + "\n\n" + LETTER_L + "\n\n" + LETTER_O);
        System.out.println(HELLO);
    }
}
