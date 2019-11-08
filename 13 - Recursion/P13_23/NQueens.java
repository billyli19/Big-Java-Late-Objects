/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_23;

import java.io.*;

/**
 *
 * @author billy
 */
public class NQueens {

    public static void solve(PartialSolution sol) {
        int exam = sol.examine();
        if (exam == PartialSolution.ACCEPT) {
            System.out.println(sol);
        } else if (exam != PartialSolution.ABANDON) {
            for (PartialSolution p : sol.extend()) {
                solve(p);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the value of n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfQueens = 0;
        try {
            numOfQueens = Integer.parseInt((br.readLine()).toString());
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your name!");
            System.exit(1);
        }

        PartialSolution sol = new PartialSolution(0);
        sol.setNumOfQueens(numOfQueens);
        solve(sol);
    }
}
