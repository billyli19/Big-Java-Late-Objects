
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
public class P5_21 {

    public static String romanDigit(int n, String one, String five, String ten) {
        if (n != 0) {
            if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return ten + one;
            } else {
                return one;
            }
        }
        return "";
    }

    public static String numberToRoman(int n) {
        String romanOne = romanDigit(n % 10, "I", "V", "X");
        n = n / 10;
        String romanTens = romanDigit(n % 10, "X", "L", "C");
        n = n / 10;
        String romanHundreds = romanDigit(n % 10, "C", "D", "M");
        n = n / 10;
        String romanThousands = romanDigit(n % 10, "M", "M", "M");

        return romanThousands + romanHundreds + romanTens + romanOne;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        while ((number <= 0) || (number > 3999)) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(numberToRoman(number));
    }
}
