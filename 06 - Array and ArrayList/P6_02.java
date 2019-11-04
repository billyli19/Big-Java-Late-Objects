
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
public class P6_02 {

    public static void swapFirstAndLastElement(int[] values) {
        int lastElement = values[values.length - 1];
        values[values.length - 1] = values[0];
        values[0] = lastElement;
        System.out.println("Swapped first and last element after input: " + Arrays.toString(values));
    }

    public static void shiftAllElement(int[] values) {
        int lastElement = values[values.length - 1];

        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;
        System.out.println("Shift all element after input: " + Arrays.toString(values));
    }

    public static void replaceAllWithZero(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
        System.out.println("Replaced all even element to zero after input: " + Arrays.toString(values));
    }

    public static void replaceElementToLarger(int[] values) {
        for (int i = 1; i < values.length - 1; i++) {
            int larger = values[i - 1];

            if (larger < values[i + 1]) {
                larger = values[i + 1];
            }
            values[i] = larger;
        }
        System.out.println("Replaced the neighour element with the larger: " + Arrays.toString(values));
    }

    public static int[] removeElement(int[] values) {
        int middleIndex = (values.length / 2) - 1;

        if (values.length % 2 == 0) {
            int[] array = new int[values.length - 2];

            for (int i = 0; i < middleIndex; i++) {
                array[i] = values[i];
            }
            for (int i = middleIndex; i < array.length; i++) {
                array[i] = values[i + 2];
            }
            return array;
        } else {
            int[] array = new int[values.length - 1];

            for (int i = 0; i <= middleIndex; i++) {
                array[i] = values[i];
            }
            for (int i = middleIndex + 1; i < array.length; i++) {
                array[i] = values[i + 1];
            }
            return array;
        }
    }

    public static void moveAllEvenElementToFront(int[] values) {
        int evenElementIndex = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                int temp = values[i];
                values[i] = values[evenElementIndex];
                values[evenElementIndex] = temp;
                evenElementIndex++;
            }
        }
        System.out.println("Moved all even element to the front: " + Arrays.toString(values));
    }

    public static void secondLargest(int[] values) {
        int firstLargestElement = values[0];
        int secondLargestElement = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > firstLargestElement) {
                secondLargestElement = firstLargestElement;
                firstLargestElement = values[i];
            }
        }
        System.out.println("Second largest element is: " + secondLargestElement);
    }

    public static void increasing(int[] values) {
        boolean isIncreasing = true;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        System.out.println("Is increasing: " + isIncreasing);
    }

    public static void duplicateAdjacent(int[] values) {
        boolean duplicateAdjacent = false;
        int length = values.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (values[i] == values[j]) {
                    duplicateAdjacent = true;
                }
            }
        }
        System.out.println("Duplicate adjacent: " + duplicateAdjacent);
    }

    public static void duplicate(int[] values) {
        boolean duplicate = false;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (i != j) {
                    if (values[i] == values[j]) {
                        duplicate = true;
                    }
                }
            }
        }
        System.out.println("Duplicate found: " + duplicate);
    }
    
    public static int[] array(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Pleae enter value for");
        
        int[] values = new int[LENGTH];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Please enter value for index " + i + " : ");
            values[i] = sc.nextInt();
        }
        sc.close();
        return values;
    }

    public static void main(String args[]) {
        
        int[] values = array();

        System.out.println("Array after input: " + Arrays.toString(values));
        swapFirstAndLastElement(values);
        shiftAllElement(values);
        replaceAllWithZero(values);
        replaceElementToLarger(values);
        int[] array = removeElement(values);
        System.out.println("Removed middle element: " + Arrays.toString(array));
        moveAllEvenElementToFront(values);
        secondLargest(values);
        increasing(values);
        duplicateAdjacent(values);
        duplicate(values);
    }
}
