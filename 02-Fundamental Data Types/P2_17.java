/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P2_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MINUTES_PER_DAY = 1440;
        final int MINUTES_PER_HOUR = 60;

        String firstTime;
        int firstTimeHours;
        int firstTimeMinutes;
        int firstTimeAllMinutes;

        String secondTime;
        int secondTimeHours;
        int secondTimeMinutes;
        int secondTimeAllMinutes;

        int timeDifferenceInMinutes;
        int minute;
        int hour;

        System.out.println("Please enter first time: ");
        firstTime = sc.next();
        firstTimeHours = Integer.parseInt(firstTime.substring(0, 2));
        firstTimeMinutes = Integer.parseInt(firstTime.substring(2, 4));
        firstTimeAllMinutes = ((firstTimeHours * MINUTES_PER_HOUR) + firstTimeMinutes);

        System.out.println("Please enter second time: ");
        secondTime = sc.next();
        secondTimeHours = Integer.parseInt(secondTime.substring(0, 2));
        secondTimeMinutes = Integer.parseInt(secondTime.substring(2, 4));
        secondTimeAllMinutes = ((secondTimeHours * MINUTES_PER_HOUR) + secondTimeMinutes);

        sc.close();

        timeDifferenceInMinutes = (secondTimeAllMinutes - firstTimeAllMinutes);
        minute = (MINUTES_PER_DAY + timeDifferenceInMinutes) % MINUTES_PER_DAY;
        hour = minute / MINUTES_PER_HOUR;
        minute = minute % MINUTES_PER_HOUR;

        System.out.println(hour + " hours " + minute + " minutes");
    }
}
