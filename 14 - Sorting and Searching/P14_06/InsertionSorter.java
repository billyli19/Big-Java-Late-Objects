/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_06;

/**
 *
 * @author billy
 */
public class InsertionSorter {
    public static void sort(int[] a){
        int n = a.length;
        for(int i  = 1; i < n; ++i){
            int next = a[i];
            int j = i - 1;
            
            while(j >= 0 && a[j] > next){
                a[j+1] = a[j];
                j--;
            }
            a[j +1] = next;
        }
    }
}
