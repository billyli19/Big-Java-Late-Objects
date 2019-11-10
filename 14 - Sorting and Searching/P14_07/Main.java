/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_07;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {
    public static void bubblesort(int[] A){
        for(int i = 0; i < A.length; i++){
            boolean swapped = false;
            
            for(int j = 0; j < A.length - i - 1; j++){
                if(A[j] > A[j + 1]){
                    ArrayUtil.swap(A, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
    public static void main(String args[]){
        int[] array = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(array));
        
        bubblesort(array);
        
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(array));
    }
}
