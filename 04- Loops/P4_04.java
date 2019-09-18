
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
public class P4_04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature: ");

        double highestTemp;
        highestTemp = sc.nextDouble();
        int highestMonth = 1;

        for (int currentMonth = 2; currentMonth <= 12; currentMonth++) {
            double nextTemp = sc.nextDouble();
            if (nextTemp > highestTemp) {
                highestTemp = nextTemp;
                highestMonth = currentMonth;
            }
        }
        System.out.println("Highest temperature recorded in month: " + highestMonth + " (" + highestTemp + "°C)");
    }
}
