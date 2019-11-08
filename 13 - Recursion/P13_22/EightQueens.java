/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_22;

import java.io.*;

/**
 *
 * @author billy
 */
public class EightQueens {

    public static File file;
    public static FileWriter fw;
    public static BufferedWriter bw;

    static public boolean isPresent(PartialSolution sol, int x, int y) {
        for (int i = 0; i < 8; i++) {
            if (sol.getQueen(i).getRow() == x && sol.getQueen(i).getColumn() == y) {
                return true;
            }
        }
        return false;
    }

    public static void solve(PartialSolution sol) {
        int exam = sol.examine();
        if (exam == PartialSolution.ACCEPT) {
            try {
                bw.write("style=\"width:100px\">\n");
                for (int i = 0; i < 8; i++) {
                    bw.write("\n");
                    for (int j = 0; j < 8; j++) {
                        if ((i + j) % 2 == 0) {
                            if (isPresent(sol, i, i)) {
                                bw.write("\n");
                            } else {
                                bw.write("\n");
                            }
                        } else {
                            if (isPresent(sol, i, j)) {
                                bw.write("\n");
                            } else {
                                bw.write("\n");
                            }
                        }
                        bw.write("\n");
                    }
                    bw.write("bgcolor=\"#808080\">♕ bgcolor=\"#808080\">♕\n");
                    System.out.println(sol);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (exam != PartialSolution.ABANDON) {
            for (PartialSolution p : sol.extend()) {
                solve(p);
            }
        }
    }

    public static void main(String args[]) {
        file = new File("show.html");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            bw.write("\n");
            bw.write("\n\n");
            solve(new PartialSolution(0));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
