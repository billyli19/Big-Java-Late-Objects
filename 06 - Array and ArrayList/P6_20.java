
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
public class P6_20 {

    public static int[][] arrayInput(int size) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = size;
        int[][] square = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.println("[row: " + i + "]" + "[column: " + j + "]");
                square[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%3d", square[i][j]);
            }
            System.out.println();
        }
        return square;
    }
    
    public static double neighbourAverage(int[][] values, int row, int column){
        double total = 0;
        int count = 0;

        for(int i = Math.max(0, row -1); i <= Math.min(row + 1, values.length -1); i++){
            for(int j = Math.max(0, column - 1); j <= Math.min(column + 1, values[0].length - 1); j++){
                if(i != row || j != column){
                    total += values[i][j];
                    count++;
                }
            }
        }
        return total / count;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        final int SIZE = sc.nextInt();

        System.out.println("Please enter posX: ");
        final int POSX = sc.nextInt();
        System.out.println("Please enter posY: ");
        final int POSY = sc.nextInt();
        
        double sum = neighbourAverage(arrayInput(SIZE), POSX, POSY);
        System.out.println("Sum: " + sum);
    }
}
