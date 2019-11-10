/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_17;

/**
 *
 * @author billy
 */
public class IterativeMergeSorterArbitrary {

    public static void sort(int[] a) {
        int currentSize;
        int first;
        for (currentSize = 1; currentSize < a.length; currentSize *= 2) {
            for (first = 0; first < a.length; first += 2 * currentSize) {
                int mid = first + currentSize - 1;
                int second = (first + 2 * currentSize - 1) < (a.length - 1) ? (first + 2 * currentSize - 1) : (a.length - 1);
                merge(first, mid, second, a);
            }
        }
    }

    private static void merge(int from, int mid, int to, int[] a) {
        int n = to - from + 1;
        int[] b = new int[n];

        int i1 = from;
        int i2 = mid + 1;
        int j = 0;

        while (i1 <= mid && i2 <= to) {
            if (a[i1] < a[i2]) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }
        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }
}
