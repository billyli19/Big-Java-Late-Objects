
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
public class P5_19 {
    public static int compute(int a, int n){
        if(n == 1){
            return a;
        }
        else if(n % 2 == 0){
            return compute(a, n/2) * compute(a, n/2);
        } else {
            return a * compute(a, n - 1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Please enter value for n: ");
        int n = sc.nextInt();
        System.out.println(compute(a, n));
        sc.close();
    }
    
}
