
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
public class P4_25 {
    public static void main(String args[]){
        
        final int a = 32310901;
        final int b = 1729;
        
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a value for seed: ");
        int rOld = sc.nextInt();
        System.out.println("Please enter a value for m: ");
        int m = sc.nextInt();
        sc.close();
        
        int formula = (a * rOld + b) % m;
        for(int i = 0; i < 100; i++){
            int rNew = formula;
            System.out.println(rNew);
            rOld = rNew;    
        }
    }
}
