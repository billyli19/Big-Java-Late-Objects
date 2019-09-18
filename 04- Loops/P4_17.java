
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
public class P4_17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int fact = 2;
        while (fact > 1) {
            if (number % fact == 0) {
                System.out.println(fact);
                number /= fact;
            } else {
                fact++;
            }
        }
    }
}
