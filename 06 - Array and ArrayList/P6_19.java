
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
public class P6_19 {

    public static int arrayInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print(prompt);
            input = sc.nextInt();
        } while (input % 2 == 0);
        return input;
    }
    
    public static int[][] createMagicSquare(int[][] array, int n){
        int row = n - 1;
        int column = n / 2;
        
        for(int i = 1; i <= (n * n); i++){
            array[row][column] = i;
            row = (row + 1) % n;
            column = (column + 1) % n;
            if(array[row][column] != 0){
                column = (column - 1 + n) % n;
                row = (row - 2 + n) % n;
            }
        }
        return array;
    }
    
    public static void printMagicSquare(int[][] array){
        for(int[] array1 : array){
            for(int value : array1){
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        int n = arrayInput("Enter odd number: ");
        int[][] square = new int[n][n];
        int[][] magicSquare = createMagicSquare(square, n);
        printMagicSquare(magicSquare);
    }
}
