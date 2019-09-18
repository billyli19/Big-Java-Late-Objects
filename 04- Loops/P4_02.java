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
public class P4_02 {

    public static void a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sequence of numbers: ");
        int largest = sc.nextInt();
        int smallest = largest;
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            largest = Math.max(largest, input);
            smallest = Math.min(smallest, input);
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();

    }

    public static void b() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sequence of numbers: ");
        int even = 0;
        int oneven = 0;
        while (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input % 2 == 0) {
                even++;
            } else {
                oneven++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Oneven numbers: " + oneven);
        sc.close();
    }

    public static void c() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sequence of numbers: ");
        int sum = 0;

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        for (String number : numbers) {
            sum = sum + Integer.parseInt(number);
            System.out.print(sum + " ");

        }
        sc.close();
    }

    public static void d() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sequence of numbers:");
        String adjacent = "";

        int previous = sc.nextInt();
        boolean isMarked = false;

        while (sc.hasNextInt()) {
            int newNumber = sc.nextInt();
            if (newNumber != previous) {
                isMarked = false;
            }

            if (previous == newNumber && !isMarked) {
                adjacent = adjacent + " " + newNumber;
                isMarked = true;
            }
            previous = newNumber;
        }

        if (adjacent != "") {
            System.out.println("Adjacent numbers are: " + adjacent);
        } else {
            System.out.println("No adjacent found");
        }
        sc.close();
    }

    public static void main(String[] args) {
        a();
//        b();
//        c();
//        d();
    }
}
