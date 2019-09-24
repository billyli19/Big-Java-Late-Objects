
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
public class P5_18 {
    public static int findInteger(int n){
        if(n >= 10){
            return findInteger(n / 10) + 1;
        } else {
            return 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        System.out.println(findInteger(number));
        sc.close();
    }
}
