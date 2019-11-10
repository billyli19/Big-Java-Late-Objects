/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_03;

/**
 *
 * @author billy
 */
public class SelectionSorter {
    public static void sort(int[] a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[minPos]){
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }
}
