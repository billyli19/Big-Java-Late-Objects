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
public class P2_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int y = sc.nextInt(); //year
        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (((8 * b) + 13) / (25));
        int h = (((19 * a) + b - d - g + 15) % (30));
        int j = c / 4;
        int k = c % 4;
        int m = (((a + (11 * h)) / (319)));
        int r = (((2 * e) + (2 * j) - k - h - m + 32) % (7));
        int n = ((h - m + r + 90) / (25)); //month
        int p = ((h - m + r + n + 19) % (32)); //day

        final String MONTH_ONE = "January";
        final String MONTH_TWO = "February";
        final String MONTH_THREE = "March";
        final String MONTH_FOUR = "April";
        final String MONTH_FIVE = "May";
        final String MONTH_SIX = "June";
        final String MONTH_SEVEN = "July";
        final String MONTH_EIGHT = "Augusts";
        final String MONTH_NINE = "September";
        final String MONTH_TEN = "October";
        final String MONTH_ELEVEN = "November";
        final String MONTH_TWELF = "December";

        int month = n;

        switch (month) {
            case 1:
                System.out.println("Easter Sunday fell on " + MONTH_ONE + " " + p + " " + y);
                break;
            case 2:
                System.out.println("Easter Sunday fell on " + MONTH_TWO + " " + p + " " + y);
                break;
            case 3:
                System.out.println("Easter Sunday fell on " + MONTH_THREE + " " + p + " " + y);
                break;
            case 4:
                System.out.println("Easter Sunday fell on " + MONTH_FOUR + " " + p + " " + y);
                break;
            case 5:
                System.out.println("Easter Sunday fell on " + MONTH_FIVE + " " + p + " " + y);
                break;
            case 6:
                System.out.println("Easter Sunday fell on " + MONTH_SIX + " " + p + " " + y);
                break;
            case 7:
                System.out.println("Easter Sunday fell on " + MONTH_SEVEN + " " + p + " " + y);
                break;
            case 8:
                System.out.println("Easter Sunday fell on " + MONTH_EIGHT + " " + p + " " + y);
                break;
            case 9:
                System.out.println("Easter Sunday fell on " + MONTH_NINE + " " + p + " " + y);
                break;
            case 10:
                System.out.println("Easter Sunday fell on " + MONTH_TEN + " " + p + " " + y);
                break;
            case 11:
                System.out.println("Easter Sunday fell on " + MONTH_ELEVEN + " " + p + " " + y);
                break;
            case 12:
                System.out.println("Easter Sunday fell on " + MONTH_TWELF + " " + p + " " + y);
                break;
            default:
                System.out.println("Month does not exist");
        }
    }
}
