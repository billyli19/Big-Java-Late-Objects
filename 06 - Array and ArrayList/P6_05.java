
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
public class P6_05 {

    public static int[] removeMin(int[] values) {
        int minIndex = 0;
        int[] array = new int[values.length - 1];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }

        for (int i = 0; i < minIndex; i++) {
            array[i] = values[i];
        }

        for (int i = minIndex + 1; i < values.length; i++) {
            array[i - 1] = values[i];
        }

        return array;
    }

    public static int[] array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Enter value for");
        
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
        int[] array = removeMin(values);
        System.out.println("Array without smalles values is: " + Arrays.toString(array));
    }
}
