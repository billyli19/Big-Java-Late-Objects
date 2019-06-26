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
public class P2_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        String one;
        String two;
        String three;
        String four;
        String five;
        String s;
        System.out.println("Please enter a 5 digit integer: ");
        number = sc.next();

        one = number.substring(0, 1);
        two = number.substring(1, 2);
        three = number.substring(2, 3);
        four = number.substring(3, 4);
        five = number.substring(4, 5);

        s = (one + " " + two + " " + three + " " + four + " " + five);
        System.out.println(s);

    }
}
