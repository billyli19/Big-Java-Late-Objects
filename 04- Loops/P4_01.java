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
public class P4_01 {

    public static void a() {
        int a = 0;
        for (int i = 2; i <= 100; i = i + 2) {
            a = a + i;
        }
        System.out.println("a: " + a);
    }

    public static void b() {
        int b = 0;
        for (int i = 1; i <= 100; i++) {
            b = i * i + b;
        }
        System.out.println("b: " + b);
    }

    public static void c() {
        double result;
        int c = 2;
        for (int i = 0; i <= 20; i++) {
            result = Math.pow(c, i);
            System.out.println("2 to the power of " + i + " = " + result);
        }
    }

    public static void d() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        int a = sc.nextInt();
        System.out.println("Please enter second value: ");
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println("sum of all odd numbers between " + a + "-" + b + " : " + sum);
    }

    public static void e() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value");
        int a = sc.nextInt();
        int value = a;
        int sum = 0;
        while (a > 0) {
            int num = a % 10;
            if (num % 2 == 1) {
                sum = sum + num;
            }
            a = a / 10;
        }
        System.out.println("The sum of all odd digits of " + value + " is " + sum);
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
