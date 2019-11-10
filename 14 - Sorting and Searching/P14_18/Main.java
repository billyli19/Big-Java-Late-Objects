/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(a));

        StopWatch timer = new StopWatch();
        InsertionSorter sorter = new InsertionSorter(a);
        timer.start();
        sorter.sort();
        timer.stop();

        System.out.println("After sort: ");
        System.out.println(Arrays.toString(a));

        System.out.println(timer.toString());

        int[] b = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Before sort: ");
        System.out.println(Arrays.toString(b));
        timer.start();
        Arrays.sort(b);
        timer.stop();
        System.out.println("After sort: ");
        System.out.println(Arrays.toString(b));
        System.out.println(timer.toString());

        BinarySearch binarysearch = new BinarySearch(b);

        System.out.print("Enter search value: ");
        int value = sc.nextInt();

        int pos = binarysearch.search(value, b.length - 1);

        if (value > 0) {
            System.out.println("Value: " + value + " found on " + pos + " position");
        } else {
            System.out.println("Value: " + value + " is not found.");
            System.out.println("The method returned: " + pos);
        }
    }
}
