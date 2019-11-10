/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_09;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class Main {
    public static void main(String args[]){
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));
        
        StopWatch timer = new StopWatch();
        timer.start();
        
        QuickSorter.sort(a, 1, 2);
        
        timer.stop();
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(a));
        
        System.out.println(timer.toString());
        
    }
}
