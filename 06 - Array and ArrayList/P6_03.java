
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
public class P6_03 {

    public static double[] valueFinder() {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;

        System.out.println("Please enter values, Q to quit: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;
        }

        double smallest = values[0];
        double largest = values[0];
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (values[i] == largest) {
                System.out.print("   <== largest value");
            }
            if (values[i] == smallest) {
                System.out.print("  <== smallest value");
            }
            System.out.println();
        }
        return values;
    }

    public static void main(String args[]) {

        double[] values = valueFinder();

    }
}
