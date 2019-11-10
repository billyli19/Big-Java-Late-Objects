/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_21;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        ArrayList str = new ArrayList();
        str.add("John");
        str.add("James");
        str.add("Kristen");
        str.add("George");
        str.add("Tom");
        str.add("Nick");
        str.add("Harry");
        str.add("Johnson");
        
        System.out.println("Before sort: " + str.toString());
        Collections.sort(str, new StringComparator());
        System.out.println("After sort: " + str.toString());
    }
}
