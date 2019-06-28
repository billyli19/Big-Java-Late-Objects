
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
public class P3_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status;
        double income;
        double taxable = 0;

        System.out.println("Please enter your status: (Single/Married) ");
        status = sc.next();
        System.out.println("Please enter your income: ");
        income = sc.nextDouble();

        if (status.equalsIgnoreCase("Single")) {
            if (income > 0 && income <= 9525) {
                taxable = income * 0.10;
            } else if (income > 9525 && income <= 38700) {
                taxable = income * 0.12;
            } else if (income > 38700 && income <= 82500) {
                taxable = income * 0.22;
            } else if (income > 82500 && income <= 157500) {
                taxable = income * 0.24;
            } else if (income > 157500 && income <= 200000) {
                taxable = income * 0.32;
            } else if (income > 200000 && income <= 500000) {
                taxable = income * 0.35;
            } else if (income > 500000) {
                taxable = income * 0.37;
            } else {
                taxable = taxable;
            }

        } else if (status.equalsIgnoreCase("Married")) {
            if (income > 0 && income <= 19050) {
                taxable = income * 0.10;
            } else if (income > 19050 && income <= 77400) {
                taxable = income * 0.12;
            } else if (income > 77400 && income <= 165000) {
                taxable = income * 0.22;
            } else if (income > 165000 && income <= 315000) {
                taxable = income * 0.24;
            } else if (income > 315000 && income <= 400000) {
                taxable = income * 0.32;
            } else if (income > 400000 && income <= 600000) {
                taxable = income * 0.35;
            } else if (income > 600000) {
                taxable = income * 0.37;
            } else {
                taxable = taxable;
            }
        }
        System.out.println("Tax: " + taxable);
        sc.close();
    }
}
