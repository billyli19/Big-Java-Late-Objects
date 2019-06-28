
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
public class P3_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final double TAX_ONE = 0.01;
        final double TAX_TWO = 0.02;
        final double TAX_THREE = 0.03;
        final double TAX_FOUR = 0.04;
        final double TAX_FIVE = 0.05;
        final double TAX_SIX = 0.06;
        double income;
        double tax = 0;
        
        System.out.println("Please enter income: ");
        income = sc.nextDouble();
        
        if(income > 1 && income <= 50000){
            tax = income * TAX_ONE;
        } else if (income > 50000 && income <= 75000){
            tax = income * TAX_TWO;
        } else if(income > 75000 && income <= 100000){
            tax = income * TAX_THREE;
        } else if(income > 100000 && income <= 250000){
            tax  = income * TAX_FOUR;
        } else if(income > 250000 && income <= 500000){
            tax = income * TAX_FIVE;
        } else if(income > 500000){
            tax = income * TAX_SIX;
        } else {
            System.out.println("NO TAX PAID");
        }
        System.out.println("For $:" + income + " , you paid : $" + tax + " tax");
        sc.close();
    }
}
