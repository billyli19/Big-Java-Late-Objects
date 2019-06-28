
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
public class P3_02 {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a > 0) {
            System.out.println("positive");
            if (a < 1) {
                System.out.println("small");
            } else if (a > 1000000) {
                System.out.println("large");
            }
        } else if (a < 0) {
            System.out.println("negative");
            if (a > -1) {
                System.out.println("small");
            } else if (a < -1000000) {
                System.out.println("large");
            }
        } else {
            System.out.println("zero");
        }
        sc.close();
    }
}
