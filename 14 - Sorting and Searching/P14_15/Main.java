/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = ArrayUtil.randomIntArray(20, 100);
        
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));
        
        Arrays.sort(a);
        
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(a));
        
        System.out.println("Enter search value: ");
        int value = sc.nextInt();
        sc.close();
        
        int pos = BinarySearch.search(a, 0, a.length - 1, value);
        if(pos < 0){
            System.out.println("Value to be added to position pos: " + pos);
        } else {
            System.out.println("Value found in position: " + (pos + 1));
        }
        
    }
}
