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
public class P4_03 {

    public static void a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char upperCase = input.charAt(i);
            if (upperCase > 64 && upperCase < 91) {
                System.out.print(upperCase + " ");
            }
        }
        sc.close();
    }

    public static void b() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = sc.nextLine();

        for (int i = 1; i < input.length(); i += 2) {
            char secondLetter = input.charAt(i);
            System.out.print(secondLetter + " ");
        }
        sc.close();
    }

    public static void c() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;
            if ((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') || (ch == 'i') || (ch == 'A') || (ch == 'E') || (ch == 'O') || (ch == 'U') || (ch == 'I')) {
                ch = '_';
            }
            System.out.print(ch);
        }
        sc.close();
    }

    public static void d() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') || (ch == 'i') || (ch == 'A') || (ch == 'E') || (ch == 'O') || (ch == 'U') || (ch == 'I')) {
                vowels++;
            }
        }
        System.out.println("Amount of vowels found: " + vowels);
        sc.close();

    }

    public static void e() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'o') || (ch == 'u') || (ch == 'i') || (ch == 'A') || (ch == 'E') || (ch == 'O') || (ch == 'U') || (ch == 'I')) {
                System.out.println("Vowel position: " + i);
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
    }
}
