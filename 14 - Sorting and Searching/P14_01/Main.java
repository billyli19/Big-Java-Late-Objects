/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_01;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        int[] a = ArrayUtil.randomIntArray(20,100);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));

        SelectionSorter.sort(a);
  
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(a));
        
    }
}
