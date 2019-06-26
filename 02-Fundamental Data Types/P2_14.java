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
public class P2_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        String firstPart;
        String secondPart;

        System.out.println("Please enter an integer between 1000 and 999999: ");
        number = sc.next();
        sc.close();

        firstPart = number.substring(0, number.length() - 3);
        secondPart = number.substring(number.length() - 3, number.length());

        System.out.println(firstPart + "," + secondPart);

    }
}
