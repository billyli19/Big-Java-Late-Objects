
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
public class P4_15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count;
        double average;
        double sd = 0;
        double sum = 0;

        System.out.print("Enter numbers of elements: ");
        count = sc.nextInt();

        int[] numbers = new int[count];
        System.out.println("Enter all the elements: ");

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / count;

        for (int i = 0; i < numbers.length; i++) {
            sd += ((numbers[i] - average) * (numbers[i] - average)) / (numbers.length - 1);
        }
        double standardDeviation = Math.sqrt(sd);

        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        System.out.println("SD: " + standardDeviation);
        
    }
}
