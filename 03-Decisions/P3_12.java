
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
public class P3_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        double value = 0.0;
        final double GRADE_A = 4.0;
        final double GRADE_B = 3.0;
        final double GRADE_C = 2.0;
        final double GRADE_D = 1.0;
        final double GRADE_F = 0.0;
        final double increase = 0.3;
        final double decrease = -0.3;

        System.out.println("Enter a letter grade: ");
        grade = sc.next();

        if (grade.contains("A")) {
            if (grade.contains("+")) {
                value = GRADE_A;
            } else if (grade.contains("-")) {
                value = GRADE_A + decrease;
            }
        } else if (grade.contains("B")) {
            if (grade.contains("+")) {
                value = GRADE_B + increase;
            } else if (grade.contains("-")) {
                value = GRADE_B + decrease;
            }
        } else if (grade.contains("C")) {
            if (grade.contains("+")) {
                value = GRADE_C + increase;
            } else if (grade.contains("-")) {
                value = GRADE_C + decrease;
            }
        } else if (grade.contains("D")) {
            if (grade.contains("+")) {
                value = GRADE_D + increase;
            } else if (grade.contains("-")) {
                value = GRADE_D + decrease;
            }
        } else if (grade.contains("F")) {
            value = GRADE_F;
        }
        System.out.println("The numeric value is: " + value);
    }
}
