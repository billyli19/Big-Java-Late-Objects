/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_15;

/**
 *
 * @author billy
 */
public class BinarySearch {

    public static int search(int[] a, int low, int high, int value) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                return search(a, mid + 1, high, value);
            } else {
                return search(a, low, mid - 1, value);
            }
        } else {
            return -(low - 1);
        }
    }
}
