
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
public class P5_20 {
    public static boolean isLeapYear(int year){
       boolean leapYear;
       if((year % 4 == 0 || year % 400 == 0) && !(year % 100 == 0)){
           return true;
       } else {
           return false;
       }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
        sc.close();
    }
}
