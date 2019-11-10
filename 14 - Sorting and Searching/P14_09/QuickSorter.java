/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_09;

import java.util.*;

/**
 *
 * @author billy
 */
public class QuickSorter {

    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
    
    private static int getMedian(int m1, int m2, int m3){
        int median = 0;
        if((m1 <= m2 && m2 <= m3) || (m3 <= m2 && m2 <= m1)){
            median = m2;
        }
        if((m2 <= m1 && m1 <= m3) || (m3 <= m1 && m1 <= m2)){
            median = m1;
        }
        if((m1 <= m3 && m3 <= m2) || (m2 <= m3 && m3 <= m2)){
            median = m3;
        }
        return median;
    }

    private static int partition(int[] a, int from, int to) {
        int pivot = 0;
        int n = to - from + 1;
        if (n <= 7) {
            pivot = a[(from + to) / 2];
        } else if(n <= 40){
            pivot = getMedian(a[from], a[(from + to) / 2], a[to]);
        } else {
            int[] medianE = new int[9];
            for(int i = 0; i < 9; ++i){
                medianE [i] = a[(from + (i * (n-1)/8))];
            }
            
            pivot = getMedian(getMedian(medianE[0], medianE[1], medianE[2]),
                    getMedian(medianE[3], medianE[4], medianE[5]),
                    getMedian(medianE[6], medianE[7], medianE[8]));
        }
        int i = from - 1;
        int j = to + 1;
        
        while(a[i] < pivot){
            i++;
        }
        j--;
        while(a[j] > pivot){
            j--;
        }
        if(i < j){
            ArrayUtil.swap(a, i, j);
        }
        return j;
    }

    public static void sort(int[] a, int from, int to) {
        if (from >= to) {
            return;
        }
        
        int p = partition(a, from, to);
        sort(a, from, p);
        sort(a, p + 1, to);
    }

}
