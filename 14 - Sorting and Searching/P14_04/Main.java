/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_04;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        String[] strings = {
            "Tom", "tom", "Bob", "bob", "Anna", "anna",
            "Car", "car", "Boat", "boat", "Ship", "ship",
            "House", "house", "Table", "table", "Box", "box",
        };
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(strings));
        
        MergeSorter.sort(strings);
        
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(strings));
    }
}
