/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P4_13 {

    public static void main(String args[]) {
        final int n = 2;
        int power = 0;
        for (int i = 0; i <= 20; i++) {
            power = i;
            System.out.println(n + " to the power of " + power + " = " + Math.pow(n, power));
        }
    }
}
