
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
public class P6_08 {

    public static void swapElement(int[] array) {
        int i = 0;
        int j = array.length / 2;

        while (i < array.length / 2) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i += 1;
            j += 1;
        }
        System.out.println("Swapped element of array: " + Arrays.toString(array));
    }
    
    public static int[] array(){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element at index " + i + " : ");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array after input: " + Arrays.toString(array));
        return array;
    }
    
    public static void main(String args[]) {
        int[] array = array();
        swapElement(array);

    }
}
