/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_24;

/**
 *
 * @author billy
 */
public class Puzzle_INCOMPLETE {

    public String puzzle1;
    public String puzzle2;
    public String addPuzzle;
    public String lettersToAssign;
    public String numbersAss;
    public int assigned;
    public String solvePuzzle1;
    public String solvePuzzle2;
    public String solveAddPuzzle;

    public Puzzle_INCOMPLETE(String p1, String p2, String ad) {
        puzzle1 = p1;
        puzzle2 = p2;
        addPuzzle = ad;

        solvePuzzle1 = p1;
        solvePuzzle2 = p2;
        solveAddPuzzle = addPuzzle;
        assigned = 0;
        numbersAss = "";
        lettersToAssign = unique(p1 + p2 + ad);
    }

    public String unique(String s) {
        String newString = "";
        for (int i = 0; i < newString.length(); i++) {
            if (newString.indexOf(s.charAt(i)) == -1) {
                newString += s.charAt(i);
            }

        }
        return newString;
    }
}
