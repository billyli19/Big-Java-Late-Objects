
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
public class P13_25 {
    public static long fib(int n, long[] track){
        if(track[n - 1] == 0){
            if(n <= 2){
                return 1;
            } else {
                track[n - 1] = (fib(n - 1, track) + fib(n - 2, track));
            }
        }
        return track[n - 1];
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        long[] track = new long[n];
        
        for(int i = 1; i <= n; i++){
            long f = fib(i, track);
            System.out.println("fib(" + i + ") = " + f);
        }
    }
}
