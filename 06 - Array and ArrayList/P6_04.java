
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
public class P6_04 {

    public static int sumWithoutSmallest(int[] values) {
        int smallestValue = values[0];
        int sum = smallestValue;

        for (int i = 1; i < values.length; i++) {
            if (values[i] < smallestValue) {
                smallestValue = values[i];
            }
            sum += values[i];
        }
        return sum - smallestValue;
    }

    public static int[] array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");
        
        int[] values = new int[LENGTH];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Element index " + i + " : ");
            values[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Array after input: " + Arrays.toString(values));

        int sum = sumWithoutSmallest(values);
        System.out.println("Sum without smallest one is: " + sum);
        return values;
    }

    public static void main(String args[]) {

        int[] values = array();
    }
}
