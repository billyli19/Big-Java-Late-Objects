/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_16;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String input = sc.nextLine();
        Evaluator e = new Evaluator(input);
        int value = e.getExpressionValue();
        System.out.println(input + "=" + value);
    }
}
