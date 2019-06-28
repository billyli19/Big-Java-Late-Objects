
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
public class P3_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstTime;
        int firstTimeHour;
        int firstTimeMinute;
        String secondTime;
        int secondTimeHour;
        int secondTimeMinute;

        System.out.println("Please enter first time");
        firstTime = sc.next();
        firstTimeHour = Integer.parseInt(firstTime.substring(0, 2));
        firstTimeMinute = Integer.parseInt(firstTime.substring(2, 4));

        System.out.println("Please enter second time");
        secondTime = sc.next();
        secondTimeHour = Integer.parseInt(secondTime.substring(0, 2));
        secondTimeMinute = Integer.parseInt(secondTime.substring(2, 4));

        sc.close();

        if (firstTimeHour < secondTimeHour) {
            System.out.println(firstTime);
            System.out.println(secondTime);
        } else if (firstTimeHour == secondTimeHour) {
            if (firstTimeMinute < secondTimeMinute) {
                System.out.println(firstTime);
                System.out.println(secondTime);
            } else if (firstTimeMinute > secondTimeMinute) {
                System.out.println(secondTime);
                System.out.println(firstTime);
            } else {
                System.out.println(firstTime);
                System.out.println(secondTime);
            }
        } else {
            System.out.println(firstTime);
            System.out.println(secondTime);
        }

    }
}
