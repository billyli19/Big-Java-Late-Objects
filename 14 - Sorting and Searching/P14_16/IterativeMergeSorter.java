/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_16;

/**
 *
 * @author billy
 */
public class IterativeMergeSorter {
    public static void sort(int[] a){
        int length = 1;
        while(length <= a.length){
            int start = 0;
            while(start + 2 * length <= a.length){
                merge(start, start + length -1 , start + 2 * length -1, a);
                start = start + 2 * length;
            }
            if(start + length <= a.length){
                merge(start, start + length - 1, a.length -1 , a);
            }
            length = length * 2;
            start = 0;
        }
    }
    
    private static void merge(int from, int mid, int to, int[] a){
        int n = to - from + 1;
        int[] b = new int[n];
        
        int i1 = from;
        int i2 = mid + 1;
        int j = 0;
        
        while(i1 <= mid && i2 <= to){
            if(a[i1] < a[i2]){
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }
        while(i1 <= mid){
            b[j] = a[i1];
            i1++;
            j++;
        }
        while(i2 <= to){
            b[j] = a[i2];
            i2++;
            j++;
        }
        for(j = 0; j < n; j++){
            a[from + j] = b[j];
        }
    }
}
