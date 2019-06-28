
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
public class P3_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        int number;
        System.out.println("Please enter year: ");
        year = sc.nextInt();
        number = year;

        if (year <= 0 || year >= 3999) {
            System.out.println("ERROR: year not valid");
        }

        String romanNumber = "";

        int digit = year / 1000;
        year = year % 1000;
        if (digit == 1) {
            romanNumber += "M";
        } else if (digit == 2) {
            romanNumber += "MM";
        } else if (digit == 3) {
            romanNumber += "MMM";
        }

        digit = year / 100;
        year = year % 100;
        if (digit == 1) {
            romanNumber += "C";
        } else if (digit == 2) {
            romanNumber += "CC";
        } else if (digit == 3) {
            romanNumber += "CCC";
        } else if (digit == 4) {
            romanNumber += "CD";
        } else if (digit == 5) {
            romanNumber += "D";
        } else if (digit == 6) {
            romanNumber += "DC";
        } else if (digit == 7) {
            romanNumber += "DCC";
        } else if (digit == 8) {
            romanNumber += "DCCC";
        } else if (digit == 9) {
            romanNumber += "CM";
        }

        digit = year / 10;
        year = year % 10;
        if (digit == 1) {
            romanNumber += "X";
        } else if (digit == 2) {
            romanNumber += "XX";
        } else if (digit == 3) {
            romanNumber += "XXX";
        } else if (digit == 4) {
            romanNumber += "XL";
        } else if (digit == 5) {
            romanNumber += "L";
        } else if (digit == 6) {
            romanNumber += "LX";
        } else if (digit == 7) {
            romanNumber += "LXX";
        } else if (digit == 8) {
            romanNumber += "LXXX";
        } else if (digit == 9) {
            romanNumber += "XC";
        }

        digit = year / 1;
        year = year % 1;
        if (digit == 1) {
            romanNumber += "I";
        } else if (digit == 2) {
            romanNumber += "II";
        } else if (digit == 3) {
            romanNumber += "III";
        } else if (digit == 4) {
            romanNumber += "IV";
        } else if (digit == 5) {
            romanNumber += "V";
        } else if (digit == 6) {
            romanNumber += "VI";
        } else if (digit == 7) {
            romanNumber += "VII";
        } else if (digit == 8) {
            romanNumber += "VIII";
        } else if (digit == 9) {
            romanNumber += "IX";
        }
        System.out.println("The year: " + number + " is in Roman number: " + romanNumber);
        sc.close();
    }

}
