
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
public class P6_07 {

    public static void reverse(int[] tempArray) {
        int middle = (tempArray.length / 2);

        for (int i = 0; i < middle; i++) {
            int temp = tempArray[i];
            tempArray[i] = tempArray[tempArray.length - i - 1];
            tempArray[tempArray.length - i - 1] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(tempArray));
    }

    public static int[] array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values.");
        System.out.println("Please enter value for");
        
        int[] values = new int[LENGTH];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Element at index " + i + " : ");
            values[i] = sc.nextInt();
        }
        System.out.println("");

        sc.close();

        System.out.println("Array after input: " + Arrays.toString(values));
        return values;
    }

    public static void main(String args[]) {

        int[] values = array();
        reverse(values);
    }
}
