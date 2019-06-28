
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
public class P3_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Please enter year: ");
        year = sc.nextInt();

        if ((year % 4 == 0 || year % 400 == 0) && !(year % 100 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Normal year");
        }
        sc.close();
    }
}
