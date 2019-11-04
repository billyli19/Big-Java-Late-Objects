
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
public class P6_06 {

    public static int alternateSum(int[] values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                sum += values[i];
            } else if (i % 2 != 0) {
                sum += -values[i];
            }
        }

        return sum;
    }

    public static int[] array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");
        
        int[] values = new int[LENGTH];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Element at index " + i + " : ");
            values[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array after input: " + Arrays.toString(values));
        return values;
    }

    public static void main(String args[]) {

        int[] values = array();

        int sum = alternateSum(values);
        System.out.println("The sum is: " + sum);
    }
}
