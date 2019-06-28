
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
public class P3_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int day;
        String season = "";
        final String WINTER = "Winter";
        final String SPRING = "Spring";
        final String SUMMER = "Summer";
        final String FALL = "Fall";

        System.out.println("Please enter the month: ");
        month = sc.nextInt();
        System.out.println("Please enter the day: ");
        day = sc.nextInt();

        if (month == 1 || month == 2 || month == 3) {
            season = WINTER;
        } else if (month == 4 || month == 5 || month == 6) {
            season = SPRING;
        } else if (month == 7 || month == 8 || month == 9) {
            season = SUMMER;
        } else if (month == 10 || month == 11 || month == 12) {
            season = FALL;
        }

        if (month % 3 == 0 && day >= 21) {
            if (season.equals(WINTER)) {
                season = SPRING;
            } else if (season.equals(SPRING)) {
                season = SUMMER;
            } else if (season.equals(SUMMER)) {
                season = FALL;
            } else {
                season = WINTER;
            }

            System.out.println("The season of date is: " + season);
            sc.close();
        }
    }
}
