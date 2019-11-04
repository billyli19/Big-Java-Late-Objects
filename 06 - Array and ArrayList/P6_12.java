
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P6_12 {

    public static void runs(int[] dieTosses) {
        boolean inRun = false;
        int previousValue = dieTosses[0];

        for (int i = 0; i < dieTosses.length - 1; i++) {
            if (inRun) {
                if (dieTosses[i] != previousValue) {
                    System.out.print(") ");
                    inRun = false;
                }
            } else if (!inRun) {
                if (dieTosses[i] == dieTosses[i + 1]) {
                    System.out.print("(");
                    inRun = true;
                } else {
                    System.out.print(" ");
                }
            }

            previousValue = dieTosses[i];
            System.out.print(dieTosses[i] + " ");
        }

        if (inRun && dieTosses[dieTosses.length - 1] == previousValue) {
            System.out.print(" " + dieTosses[dieTosses.length - 1] + ") ");
        } else if (inRun && dieTosses[dieTosses.length - 1] != previousValue) {
            System.out.print(") " + dieTosses[dieTosses.length - 1]);
        } else {
            System.out.print(" " + dieTosses[dieTosses.length - 1]);
        }
    }

    public static void main(String args[]) {
        Random random = new Random();

        int[] dieTosses = new int[20];
        for (int i = 0; i < dieTosses.length; i++) {
            dieTosses[i] = random.nextInt(6) + 1;
        }

        System.out.println("Runs in die tosses: ");
        runs(dieTosses);
    }
}
