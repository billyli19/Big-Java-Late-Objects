
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
public class P3_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numberOne;
        double numberTwo;
        final double TWO_DECIMALS = 0.01;
        
        System.out.println("Please enter first number: ");
        numberOne = sc.nextDouble();
        if(numberOne < 0){
            numberOne = numberOne * -1;
        }
        System.out.println("Please enter second number: ");
        numberTwo = sc.nextDouble();
        if (numberTwo < 0){
            numberTwo = numberTwo * -1;
        }
        
        if(numberOne == numberTwo){
            System.out.println("They are the same");
        } else if (Math.abs(numberTwo - numberOne) <= TWO_DECIMALS){
            System.out.println("They are the same up to two decimal places");
        } else if (Math.abs(numberOne - numberTwo) <= TWO_DECIMALS){
            System.out.println("They are the same up to two decimal places");
        } else {
            System.out.println("They are different");
        }
        sc.close();
    }
}
