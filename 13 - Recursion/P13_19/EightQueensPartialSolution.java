/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_19;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class EightQueensPartialSolution implements PartialSolution {

    public Queen[] queens;

    public EightQueensPartialSolution(int size) {
        queens = new Queen[size];
    }

    public int examine() {
        for (int i = 0; i < this.queens.length; i++) {
            for (int j = i + 1; j < queens.length; j++) {
                if (queens[i].attacks(queens[j])) {
                    return ABANDON;
                }
            }
        }
        if (queens.length == NQUEENS) {
            return ACCEPT;
        } else {
            return CONTINUE;
        }
    }

    public EightQueensPartialSolution[] extend() {
        EightQueensPartialSolution[] result = new EightQueensPartialSolution[NQUEENS];
        for (int i = 0; i < result.length; i++) {
            int size = queens.length;
            result[i] = new EightQueensPartialSolution(size + 1);
            for (int j = 0; j < size; j++) {
                result[i].queens[j] = queens[j];
            }
            result[i].queens[size] = new Queen(size, i);
        }
        return result;
    }

    public String toString() {
        return Arrays.toString(queens);
    }

    public void solve() {
        int exam = this.examine();
        if (exam == this.ACCEPT) {
            System.out.println(this);
        } else if (exam != this.ABANDON) {
            for (EightQueensPartialSolution p : this.extend()) {
                p.solve();
            }
        }
    }

    public static void main(String args[]) {
        EightQueensPartialSolution ep = new EightQueensPartialSolution(0);
        ep.solve();
    }
}
