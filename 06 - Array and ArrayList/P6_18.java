
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class P6_18 {

    public static int[][] arrayInput() {
        Scanner sc = new Scanner(System.in);
        final int ROW = 4;
        final int COLUMN = 4;
        int[][] square = new int[ROW][COLUMN];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.println("[row: " + i + "]" + "[column: " + j + "]");
                square[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.printf("%3d", square[i][j]);
            }
            System.out.println();
        }
        return square;
    }

    public static boolean checkArrayValue(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }

        int[] oneDArray = new int[list.size()];
        for (int i = 0; i < oneDArray.length; i++) {
            oneDArray[i] = list.get(i);
        }

        Arrays.sort(oneDArray);

        for (int i = 0; i < 17; i++) {
            if (oneDArray[i] == i) {
                return true;
            } else {
                return false;
            }
        }
        System.out.println("Converted: " + Arrays.toString(oneDArray));
        return true;
    }

    public static boolean sumOfSquare(int[][] array) {
        int rowSum = 0;
        int columnSum = 0;
        int decendingDiagonalSum = 0;
        int acendingDiagonalSum = 0;

        for (int i = 0; i < array.length; i++) {
            rowSum += array[0][i];
            columnSum += array[i][0];
            decendingDiagonalSum += array[i][i];
            acendingDiagonalSum += array[array.length - i - 1][i];
        }

        if (rowSum == columnSum && rowSum == decendingDiagonalSum && rowSum == acendingDiagonalSum) {
            for (int i = 1; i < array.length; i++) {
                int nextRowSum = 0;
                int nextColumnSum = 0;

                for (int j = 0; j < array.length; j++) {
                    nextRowSum += array[j][i];
                    nextColumnSum += array[i][j];
                }
                if (nextRowSum == rowSum || nextColumnSum == columnSum) {

                    return true;
                }
            }
        }
        return false;
    }
//checkArrayValue(array) &&
    public static void main(String[] args) {
        int[][] array = arrayInput();
        System.out.println(checkArrayValue(array));
        if (sumOfSquare(array)) {
            System.out.println("This square is a magic square!");
        } else {
            System.out.println("This square is not a magic square");
        }
    }
}
