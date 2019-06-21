/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P1_04 {
    public static void main(String[] args){
        double initialBalance = 1000;
        double interest = 1.05;
        double newBalance = 0;
        int year = 3;
        
        for(int i = 1; i <= year; i++){
            newBalance = initialBalance * interest;
            initialBalance = newBalance;
            System.out.println(i + " year balance: " + initialBalance);
        }
        
    }
}
