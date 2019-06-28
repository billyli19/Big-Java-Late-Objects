
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
public class P3_08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        
        System.out.println("Please enter first number: ");
        a = sc.nextInt();
        System.out.println("Please enter second number: ");
        b = sc.nextInt();
        System.out.println("Please enter third number: ");
        c = sc.nextInt();
        System.out.println("Please enter fourth number: ");
        d = sc.nextInt();
        
        if((a == b || a == c || a == d) && (b == c || b == d)){
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
        sc.close();
    }
}
