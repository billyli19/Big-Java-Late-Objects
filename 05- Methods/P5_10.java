
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
public class P5_10 {
    
    public static double readDouble(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextDouble();

    }
    public static void main(String args[]){
        double salary = readDouble("Please enter your salary: ");
        double percentageRaise = readDouble("What percentage raise would you like?: ");
        double newSalary = ((salary)*(1 + (percentageRaise / 100)));
        System.out.println("Your new salary is: " + newSalary);
    }
}
