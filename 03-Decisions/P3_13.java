
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
public class P3_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = null;
        double grade;
        System.out.println("Please enter grade value: ");
        grade = sc.nextDouble();

        if (grade < 0 || grade > 4) {
            System.out.println("ERROR: please enter grade between 0 and 4");
        } else if (grade >= 3.85) {
            result = "A";
        } else if (grade >= 3.7) {
            result = "A-";
        } else if (grade >= 3.0) {
            result = "B+";
        } else if (grade >= 2.85) {
            result = "B";
        } else if (grade >= 2.7) {
            result = "B-";
        } else if (grade >= 2.0) {
            result = "C+";
        } else if (grade >= 1.85) {
            result = "C";
        } else if (grade >= 1.7) {
            result = "C-";
        } else if (grade >= 1.0) {
            result = "D+";
        } else if (grade > 0.85) {
            result = "D";
        } else if (grade > 0.7) {
            result = "D-";
        } else {
            result = "F";
        }

        sc.close();

        System.out.println("Result: " + result);
    }
}
