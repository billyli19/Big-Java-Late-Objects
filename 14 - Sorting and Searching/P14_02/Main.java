/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_02;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        Coin[] a = {
            new Coin(0.10, "Dime"),
            new Coin(0.25, "Quarter"),
            new Coin(1.00, "Loonie"),
            new Coin(0.01, "Penny"),
            new Coin(0.05, "Nickel"),
            new Coin(1.00, "Loonie"),
            new Coin(2.00, "Toonie"),
            new Coin(0.10, "Dime"),
            new Coin(0.25, "Quarter"),
            new Coin(1.00, "Loonie"),
            new Coin(2.00, "Toonie"),
        };

        SelectionSorter selectionSorter = new SelectionSorter(a);

        selectionSorter.sort();

        System.out.println("Result: " + Arrays.toString(a));

    }
}
