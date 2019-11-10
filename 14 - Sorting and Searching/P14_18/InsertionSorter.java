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
public class InsertionSorter {
    private int[] A;
    private BinarySearch bs;
    
    public InsertionSorter(int[] a){
        A = a;
    }
    
    public void sort(){
        int[] b = new int[A.length];
        bs = new BinarySearch(b);
        int j;
        
        for(int i = 0; i < A.length; i++){
            int index = bs.search(A[i], i - 1);
            if(index < 0){
                index = -index - 1;
            }
            for(j = i; j > index; j--){
                b[j] = b[j - 1];
            }
            b[j] = A[i];
        }
        System.arraycopy(b, 0, A, 0, A.length);
    }
}
