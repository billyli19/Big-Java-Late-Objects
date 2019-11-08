/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_15;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.next();
        PermutationGenerator perm = new PermutationGenerator(word);
        
        while(perm.hasMorePermutation()){
            System.out.println(perm.nextPermutation());
        }
    }
}
