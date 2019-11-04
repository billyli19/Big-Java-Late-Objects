
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P6_09 {

    public static boolean equals(int[] a, int[] b) {
        if (a.length == b.length) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    count++;
                }
            }
            if (count == a.length) {
                System.out.println("Array match!");
                return true;
            }
        }
        System.out.println("Array doesn't match!");
        return false;
    }

    public static int[] array_A() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values for array A: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");

        int[] a = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Value at index " + i + " : ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static int[] array_B() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values for array B: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");
        
        int[] b = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Value at index " + i + " : ");
            b[i] = sc.nextInt();
        }
        return b;
    }

    public static void main(String args[]) {

        int[] a = array_A();
        int[] b = array_B();
        equals(a, b);
    }
}
