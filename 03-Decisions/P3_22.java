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
public class P3_22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String status;
        double income;
        double taxable = 0;
        
        System.out.println("Please enter your status: (Single/Married) ");
        status = sc.next();
        System.out.println("Please enter your income: ");
        income = sc.nextDouble();
        
        if(status.equalsIgnoreCase("Single")){
            if(income > 0 && income <= 8000){
                taxable = income * 0.10;
            } else if(income > 8000 && income <= 32000){
                taxable = (((income - 8000) + (800)) * 0.15);
            } else if(income > 32000){
                taxable = (((income - 32000) + (4400)) * 0.25);
            } else {
                taxable = taxable;
            }
        } else if(status.equalsIgnoreCase("Married")){
            if(income > 0 && income <= 16000){
                taxable = income * 0.10;
            } else if(income > 16000 && income <= 64000){
                taxable = (((income - 16000) + (1600)) * 0.15);
            } else if(income > 64000){
                taxable = (((income - 64000) + (8800)) * 0.25);
            } else {
                taxable = taxable;
            }
        }
        System.out.println("Tax: " + taxable);
        sc.close();
    }
}
