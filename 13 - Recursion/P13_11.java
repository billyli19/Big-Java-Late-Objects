
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
public class P13_11 {

    public static double squareRoot(double x) {
        return squareRootGuess(x, 1);
    }

    public static double squareRootGuess(double x, double g) {
        double epsilon = Math.pow(x, -12);

        if (Math.abs(g * g - x) < epsilon) {
            return g;
        } else {
            g = (g + x / g) / 2;
            return squareRootGuess(x, g);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double x = sc.nextDouble();

        double result = squareRoot(x);
        System.out.printf("%-12s%s%n", "Result: ", Double.toString(result));

        double expectedResult = Math.sqrt(x);
        System.out.printf("%-12s%s%n", "Result: ", Double.toString(expectedResult));
    }
}
