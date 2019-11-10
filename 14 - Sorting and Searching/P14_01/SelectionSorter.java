/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_01;

/**
 *
 * @author billy
 */
public class SelectionSorter {
    public static void sort(int[] a){
        for(int i = 0; i < a.length -1; i++){
            int maxPos = maxPosition(a, i);
            ArrayUtil.swap(a, maxPos, i);
        }
    }
    
    private static int maxPosition(int[] a, int from){
        int maxPos = from;
        for(int i = from + 1; i < a.length; i++){
            if(a[i] > a[maxPos]){
                maxPos = i;
            }
        }
        return maxPos;
    }

}
