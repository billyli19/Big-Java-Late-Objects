
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
public class P5_03 {
    public static int firstDigit(int n){
        String number = Integer.toString(n);
        char firstDigit = number.charAt(0);
        System.out.println("First digit: " + firstDigit);
        return n;
    }
    
    public static int lastDigit(int n){
        String number = Integer.toString(n);
        char lastDigit = number.charAt(number.length() -1);
        System.out.println("Last digit: " + lastDigit);
        return n;
    }
    
    public static int digits(int n){
        String number = Integer.toString(n);
        int numberOfDigits = number.length();
        System.out.println("Number of digits: " + numberOfDigits);
        return n;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int number = sc.nextInt();
        sc.close();
        
        firstDigit(number);
        lastDigit(number);
        digits(number);
    }
}
