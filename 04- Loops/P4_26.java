/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P4_26 {

    public static final int THROWS = 1000;

    public static boolean inCircle(double x, double y) {
        if ((x * x + y * y < 1) && !(x == 0 && y == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkCross() {
        double x1, y1, x2, y2;
        double dist;

        x1 = Math.random();
        y1 = Math.random();

        do {
            x2 = Math.random();
            y2 = Math.random();
        } while (!inCircle(x2, y2));

        dist = Math.sqrt(x2 * x2 + y2 * y2);
        x2 /= dist;
        y2 /= dist;

        x2 += x1;
        y2 += y1;

        if (Math.round(x1) != Math.round(x2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int count = 0;

        for (int i = 0; i < THROWS; i++) {
            if (checkCross()) {
                count++;
            }
        }

        System.out.println("Pi is: " + Math.PI);
        System.out.println("Our estimate: ");
        System.out.println(THROWS * 2.0 / count);

    }
}
