
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
public class P5_05 {
    public static String repeat(String str, int n){
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
        System.out.println();
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        sc.close();
        repeat(str, 3);
    }
}
