/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_15;

/**
 *
 * @author billy
 */
public class NumberPermutationIterator {
    private int[] a;
    private boolean done;
    
    public NumberPermutationIterator(int n){
        a = new int[n];
        done = false;
        for(int i = 0; i < n; i++){
            a[i] = i;
        }
    }
    
    public int[] nextPermutation(){
        if(a.length <= 1){
            return a;
        }
        for(int i = a.length -1; i > 0; i--){
            if(a[i -1] < a[i]){
                int j = a.length - 1;
                while(a[i - 1] > a[j]){
                    j--;
                }
                swap(i - 1, j);
                reverse(i, a.length -1);
                return a;
            }
        }
        return a;
    }
    
    public boolean hasMorePermutation(){
        if(a.length <= 1){
            return false;
        }
        for(int i = a.length - 1; i > 0; i--){
            if(a[i -1] < a[i]){
                return true;
            }
        }
        return false;
    }
    
    public void swap(int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public void reverse(int i, int j){
        while(i < j){
            swap(i, j);
            i++;
            j--;
        }
    }
}
