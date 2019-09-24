
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
public class P5_14 {

    public static String printTime(int h, int m) {
        String past = " past ";
        String to = " to ";
        String quarter = "quarter ";
        String half = "half ";
        String time = printMinutes(m) + past + printHours(h);

        if (m > 30) {
            if (h == 12) {
                time = printMinutes(60 - m) + to + printHours(1);
            } else {
                time = printMinutes(60 - m) + to + printHours(h + 1);
            }
        }
        if (m == 45) {
            if (h == 12) {
                time = quarter + to + printHours(1);
            } else {
                time = quarter + to + printHours(h + 1);
            }
        }
        if (m == 30) {
            time = half + past + printHours(h);
        }
        if (m == 15) {
            time = quarter + past + printHours(h);
        }
        if (m == 0) {
            time = printHours(h) + " o'clock";
        }
        return removeLeadingSpace(time);
    }

    public static String removeLeadingSpace(String str) {
        String result;
        if (" ".equals(str.substring(0, 1))) {
            result = str.substring(1);
        } else {
            result = str;
        }
        return result;
    }

    public static String printHours(int h) {
        String hour;
        if (h < 10) {
            hour = digitName(h);
        } else {
            hour = teenName(h);
        }
        return hour;
    }

    public static String printMinutes(int m) {
        int input = m;
        String minutes = "";

        if (input >= 20) {
            minutes = minutes + " " + tensName(m);
            input = input % 10;
        } else if (input >= 10) {
            minutes = minutes + " " + teenName(input);
            input = 0;
        }
        if (input > 0) {
            minutes = minutes + " " + digitName(input);
        }
        return minutes;
    }

    public static String digitName(int digit) {
        if (digit == 0) {
            return "zero";
        }
        if (digit == 1) {
            return "one";
        }
        if (digit == 2) {
            return "two";
        }
        if (digit == 3) {
            return "three";
        }
        if (digit == 4) {
            return "four";
        }
        if (digit == 5) {
            return "five";
        }
        if (digit == 6) {
            return "six";
        }
        if (digit == 7) {
            return "seven";
        }
        if (digit == 8) {
            return "eight";
        }
        if (digit == 9) {
            return "nine";
        }
        return "";
    }

    public static String teenName(int number) {
        if (number == 10) {
            return "ten";
        }
        if (number == 11) {
            return "eleven";
        }
        if (number == 12) {
            return "twelve";
        }
        if (number == 13) {
            return "thirteen";
        }
        if (number == 14) {
            return "fourteen";
        }
        if (number == 15) {
            return "fifteen";
        }
        if (number == 16) {
            return "sixteen";
        }
        if (number == 17) {
            return "seventeen";
        }
        if (number == 18) {
            return "eighteen";
        }
        if (number == 19) {
            return "nineteen";
        }
        return "";
    }

    public static String tensName(int number) {
        if (number >= 50) {
            return "fifty";
        }
        if (number >= 40) {
            return "forty";
        }
        if (number >= 30) {
            return "thirty";
        }
        if (number >= 20) {
            return "twenty";
        }
        return "";
    }

    public static int readIntBetween(int x, int y) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please enter time between " + x + " and " + y + ": ");
            input = sc.nextInt();
        } while (input < x || input > y);
        return input;
    }

    public static void main(String args[]) {
        int hour = readIntBetween(1, 12);
        int minute = readIntBetween(0, 59);

        System.out.println("Time is: " + printTime(hour, minute));
    }
}
