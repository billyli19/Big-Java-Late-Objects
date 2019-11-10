/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_04;

/**
 *
 * @author billy
 */
public class MergeSorter {
    public static void sort(String[] a){
        if(a.length <= 1){
            return;
        }
        String[] first = new String[a.length / 2];
        String[] second = new String[a.length - first.length];
        
        for(int i = 0; i < first.length; i++){
            first[i] = a[i];
        }
        for(int i = 0; i < second.length; i++){
            second[i] = a[first.length + i];
        }
        
        sort(first);
        sort(second);
        merge(first, second, a);
    }
    
    public static void merge(String[] first, String[] second, String[] a){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        
        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst].compareTo(second[iSecond]) < 0){
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        
        while(iFirst < first.length){
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }
        
        while(iSecond < second.length){
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
