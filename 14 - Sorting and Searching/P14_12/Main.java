/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_12;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        int[] a = ArrayUtil.randomIntArray(10, 1000);
        //int[] a = {0, -123, 764, 170, -55, 45, 75, 90, 802, 24, 2, 66};
        int n = a.length;

        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));

        P14_11.RadixSorter.radixSort(a, n);

        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(a));
    }
}
