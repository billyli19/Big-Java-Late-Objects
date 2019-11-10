/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_18;

/**
 *
 * @author billy
 */
public class BinarySearch {
    private int[] N;
    
    public BinarySearch(int[] a){
        N = a;
    }
    
    public int search(int value, int high){
        int low = 0;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int diff = N[mid] - value;
            
            if(diff == 0){
                return mid;
            } else if(diff < 0){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -(low + 1);
    }
}
