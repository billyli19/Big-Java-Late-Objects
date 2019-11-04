
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
public class P6_22 {

    public static int[] array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length: ");
        final int LENGTH = sc.nextInt();
        int[] array = new int[LENGTH];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element at index " + i + " : ");
            array[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array after input: " + Arrays.toString(array));
        return array;
    }

    public static void printArray(int[] array) {
        int min = -1;
        int numLen = 1;
        for (int val : array) {
            min = Math.min(min, val);
            numLen = Math.max(numLen, Integer.toString(val).length());
        }
        String fmt = "%" + -min + "s[%" + numLen + "d]%s%n";
        for (int val : array) {
            if (val >= 0) {
                System.out.printf(fmt, "", val, repeat('*', val));
            } else {
                System.out.printf(fmt, repeat('*', -val), val, "");
            }
        }
    }
    
    public static String repeat(char c, int len){
        char[] buf = new char[len];
        Arrays.fill(buf, c);
        return new String(buf);
    }

    public static void main(String args[]) {
        int[] array = array();
        printArray(array);
    }
}
