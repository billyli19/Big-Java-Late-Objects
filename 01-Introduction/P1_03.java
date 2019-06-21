/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P1_03 {
    public static void main(String[] args){
        int num = 10;
        int y = 1;
        
        for(int i = 1; i <= num; i++){
            y *= i;
        }
        System.out.println("The product of the first ten positive integers: " + y);
    }
}
