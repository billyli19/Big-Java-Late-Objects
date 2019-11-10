/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_13;

import java.util.*;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
      int[] a = ArrayUtil.randomIntArray(10, 1000);
        
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));

        RadixSorter.sort(a);

        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(a));
    }
}
