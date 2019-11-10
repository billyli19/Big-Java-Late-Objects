/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_21;

import java.util.Comparator;

/**
 *
 * @author billy
 */
public class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        if(s1.length() < s2.length()){
            return -1;
        } else if(s1.length() > s2.length()){
            return 1;
        } else {
            return s1.compareTo(s2);
        }
    }
}
