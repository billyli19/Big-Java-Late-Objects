
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author billy
 */
public class P6_24 {

    public static int[][] seatingChartByPrice() {
        int[][] seats = {
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30},};
        return seats;
    }

    public static void printArray(int[][] A) {
        for (int[] subA : A) {
            for (int el : subA) {
                System.out.printf("%5d", el);
            }
            System.out.println();
        }
    }

    public static String userChoice() {
        System.out.println("Please type 'seat' or 'price' to buy ticket (Q, to quit): ");
        Scanner sc = new Scanner(System.in);
        return sc.next().toLowerCase();
    }

    public static boolean isSeat(String s) {
        return s.equalsIgnoreCase("seat");
    }

    public static int[][] bookSeat(int[][] A, int n) {
        int row = (n - 1) / 10;
        int col = (n - 1) % 10;
        A[row][col] = 0;
        printArray(A);

        for (int i = 1; i < A.length * A[0].length; i++) {
            if (nextTicket("Next ticket? (y/n): ")) {
                n = seatIsAvailable(A, seatIsCorrect(inputNumber("Enter another seat number: ")));

                row = (n - 1) / 10;
                col = (n - 1) % 10;

                A[row][col] = 0;

                printArray(A);
            } else {
                return A;
            }
        }
        return A;
    }

    public static int[][] bookPrice(int[][] A, int n) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == n) {
                    A[i][j] = 0;

                    if (nextTicket("Next ticket? (y/n): ")) {
                        n = seatIsCorrect(inputNumber("Enter price:"));
                        i = 0;
                        j = 0;
                    } else {
                        return A;
                    }
                }
            }
        }
        return A;
    }

    public static int seatIsCorrect(int n) {
        while (n < 1 || n > 90) {
            n = inputNumber("Re-enter seat number (1 to 90): ");
        }
        return n;
    }

    public static int priceIsCorrect(int n) {
        while (n != 10 && n != 20 && n != 30 && n != 40 && n != 50) {
            n = inputNumber("Re-enter price: ");
        }
        return n;
    }

    public static int inputNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static boolean nextTicket(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.next().equalsIgnoreCase("y");
    }

    public static int seatIsAvailable(int[][] A, int n) {
        int row = (n - 1) / 10;
        int col = (n - 1) % 10;

        while (A[row][col] == 0) {
            n = seatIsCorrect(inputNumber("Sorry, this seat has been booked! Try another one: "));
            row = (n - 1) / 10;
            col = (n - 1) % 10;
        }
        return n;
    }

    public static boolean isPrice(String s) {
        return s.equalsIgnoreCase("price");
    }

    public static boolean endProgram(String s){
        return s.equalsIgnoreCase("Q");
    }
    public static void main(String args[]) {
        boolean done = false;
        while (!done) {
            int[][] seatChart = seatingChartByPrice();

            String userChoice = userChoice();

            if (isSeat(userChoice)) {
                seatChart = bookSeat(seatChart, seatIsCorrect(inputNumber("Enter seat number (1 - 90): ")));
                printArray(seatChart);
            } else if (isPrice(userChoice)) {
                seatChart = bookPrice(seatChart, priceIsCorrect(inputNumber("Enter price (10, 20, 30, 40, 50): ")));
                printArray(seatChart);
            } else if(endProgram(userChoice)){
                System.exit(0);
            } else {
                System.out.println("Error, please type 'seat' or 'price");
            }
        }
    }
}
