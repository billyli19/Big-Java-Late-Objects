/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_11;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class RadixSorter {

    public static int getMax(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void countSort(int[] a, int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[(a[i] / exp) % 10]++;
        }
        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    public static void radixSort(int[] a, int n) {
        int m = getMax(a, n);
        for (int exp = 1; (m / exp) > 0; exp *= 10) {
            countSort(a, n, exp);
        }
    }

}
