/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P4_19 {

    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int mult = i * j;
                System.out.printf("%4d", mult);
            }
            System.out.println();
        }
    }
}
