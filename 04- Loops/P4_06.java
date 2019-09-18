
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
public class P4_06 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers: ");

        boolean first = true;
        int minimum = Integer.MAX_VALUE;
        while (sc.hasNextInt()) {
            int newInteger = sc.nextInt();
            if (first) {
                minimum = newInteger;
                first = false;
            } else if (newInteger < minimum) {
                minimum = newInteger;
            }
        }

        System.out.println("minimum: " + minimum);
        sc.close();
    }
}
