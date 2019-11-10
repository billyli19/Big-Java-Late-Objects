/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_08;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        int count = 0;
        int mostFrequent = 0;
        int highestFrequency = -1;

        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            count++;
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                if (count > highestFrequency) {
                    highestFrequency = count;
                    mostFrequent = a[i];
                }
                count = 0;
            }
        }

        System.out.println("After sort: ");
        System.out.println(Arrays.toString(a));
        System.out.println("Most frequent: " + mostFrequent);
        System.out.println("Highest Frequency: " + highestFrequency);
    }
}
