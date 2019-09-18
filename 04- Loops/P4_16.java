
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
public class P4_16 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (number > 2) {
            int fold1 = 1;
            int fold2 = 1;
            int fnew = 0;

            for (int i = 0; i < number - 2 ; i++) {
                fnew = fold1 + fold2;
                fold1 = fold2;
                fold2 = fnew;
            }
            System.out.println(number + "th number is: " + fnew);
        } else {
            System.out.println(number + "th number is: 1");
        }
    }
}
