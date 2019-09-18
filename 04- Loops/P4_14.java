
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
public class P4_14 {

    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        String x = "";
        sc.close();

        while (number > 0) {
            int a = number % 2;
            x = a + "\n" + x;
            number = number / 2;
        }
        
        System.out.println(x);


    }
}
