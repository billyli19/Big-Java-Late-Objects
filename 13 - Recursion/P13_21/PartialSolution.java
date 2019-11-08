/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_21;

import java.util.Arrays;

/**
 *
 * @author billy
 */
public class PartialSolution {

    private Queen[] queens;
    private static final int NQUEENS = 8;
    public static final int ACCEPT = 1;
    public static final int ABANDON = 2;
    public static final int CONTINUE = 3;

    public PartialSolution(int size) {
        queens = new Queen[size];
    }

    public void initQueen() {
        for (int i = 0; i < 8; i++) {
            queens[i] = new Queen(0, 0);
        }
    }

    public Queen getQueen(int i) {
        return queens[i];
    }

    public void setQueen(int i, int row, int column) {
        queens[i].setRow(row);
        queens[i].setColumn(column);
    }

    public PartialSolution sort() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queens[i].getColumn() < queens[j].getColumn()) {
                    Queen temp = queens[i];
                    queens[j] = queens[i];
                    queens[i] = temp;
                }
            }
        }
        return this;
    }

    public int examine() {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
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

    public PartialSolution[] extend() {
        PartialSolution[] result = new PartialSolution[NQUEENS];
        for (int i = 0; i < result.length; i++) {
            int size = queens.length;
            result[i] = new PartialSolution(size + 1);
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

    public int numberOfQueen() {
        return queens.length;
    }
}
