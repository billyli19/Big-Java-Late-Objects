/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_10;

/**
 *
 * @author billy
 */
public class QuickSortThreeWay {

    public static void sort(int[] input) {
        sort(input, 0, input.length - 1);
    }

    public static void sort(int[] input, int low, int high) {
        if (high <= low) {
            return;
        }
        int it = low;
        int gt = high;
        int i = low + 1;
        int pivot = low;
        int pivotValue = input[pivot];

        while (i <= gt) {
            if (less(input[i], pivotValue)) {
                exchange(input, i++, it++);
            } else if (less(pivotValue, input[i])) {
                exchange(input, i, gt--);
            } else {
                i++;
            }
        }
        sort(input, low, it - 1);
        sort(input, gt + 1, high);
    }

    public static void exchange(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static boolean less(int i, int j) {
        return i < j;
    }
}
