/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_05;

/**
 *
 * @author billy
 */
public class BinarySearch {
    private Name[] n;
    
    public BinarySearch(Name[] aName){
        n = aName;
    }
    
    public int binarySearch(int from, int to, String a){
        if(from > to){
            return -1;
        }
        int mid = (from + to) / 2;
        int diff = n[mid].getKey().compareTo(a);
        
        if(diff == 0){
            return mid;
        } else if(diff < 0){
            return binarySearch(mid + 1, to, a);
        } else {
            return binarySearch(from, mid - 1, a);
        }
    }
}
