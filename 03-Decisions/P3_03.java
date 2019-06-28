
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
public class P3_03 {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        
        int numberOfDigits = 0;
        
        if(a < 0){
            a = a * -1;
        }
        
        if (a > 0 && a < 10) {
            numberOfDigits = 1;
        } else if (a > 9 && a < 100) {
            numberOfDigits = 2;
        } else if (a > 99 && a < 1000) {
            numberOfDigits = 3;
        } else if (a > 999 && a < 10000) {
            numberOfDigits = 4;
        } else if (a > 9999 && a < 100000) {
            numberOfDigits = 5;
        } else if (a > 99999 && a < 1000000) {
            numberOfDigits = 6;
        } else if (a > 999999 && a < 10000000) {
            numberOfDigits = 7;
        } else if (a > 9999999 && a < 100000000) {
            numberOfDigits = 8;
        } else if (a > 99999999 && a < 1000000000) {
            numberOfDigits = 9;
        } else if (a >= 999999999 && a < 10000000000l) {
            numberOfDigits = 10;
        } else {
            System.out.println("number is greater than 10 billion");
        }
        System.out.println("number has " + numberOfDigits + " digits");
        sc.close();
    }
}
