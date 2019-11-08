/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_21;

/**
 *
 * @author billy
 */
public class EightQueens {

    static int max = 92;
    static PartialSolution[] Unique = new PartialSolution[max];
    static PartialSolution[] UniqueRotation90 = new PartialSolution[max];
    static PartialSolution[] UniqueRotation180 = new PartialSolution[max];
    static PartialSolution[] UniqueRotation270 = new PartialSolution[max];
    static PartialSolution[] UniqueReflection = new PartialSolution[max];
    static PartialSolution[] UniqueReflection90 = new PartialSolution[max];
    static PartialSolution[] UniqueReflection180 = new PartialSolution[max];
    static PartialSolution[] UniqueReflection270 = new PartialSolution[max];
    public static int partialSolutionSize = -1;

    public static PartialSolution Rotation(PartialSolution Sol) {
        PartialSolution Soln = new PartialSolution(8);
        Soln.initQueen();

        for (int i = 0; i < 8; i++) {
            Soln.setQueen(i, 8 - 1 - Sol.getQueen(i).getColumn(), Sol.getQueen(i).getRow());
        }
        return Soln;
    }

    public static PartialSolution Reflection(PartialSolution Sol) {
        PartialSolution Soln = new PartialSolution(8);
        Soln.initQueen();

        for (int i = 0; i < 8; i++) {
            Soln.setQueen(i, Sol.getQueen(i).getRow(), 7 - Sol.getQueen(i).getColumn());
        }
        return Soln;
    }

    public static PartialSolution copyPartialSolution(PartialSolution soln) {
        PartialSolution sol = new PartialSolution(8);

        for (int i = 0; i < 8; i++) {
            sol.setQueen(i, soln.getQueen(i).getRow(), soln.getQueen(i).getColumn());
        }
        return soln;
    }

    public static boolean isUnique(PartialSolution soln) {
        PartialSolution sol = copyPartialSolution(soln);
        sol.sort();

        for (int i = 0; i <= partialSolutionSize; i++) {
            boolean indicator90 = false;
            boolean indicator180 = false;
            boolean indicator270 = false;
            boolean indicator1 = false;
            boolean indicator2 = false;
            boolean indicator3 = false;
            boolean indicator4 = false;

            for (int j = 0; j < 8; j++) {
                if (sol.getQueen(j).getRow() == UniqueRotation90[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueRotation90[i].getQueen(j).getColumn()) {
                    indicator90 = indicator90 || false;
                } else {
                    indicator90 = indicator90 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueRotation180[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueRotation180[i].getQueen(j).getColumn()) {
                    indicator180 = indicator180 || false;
                } else {
                    indicator180 = indicator180 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueRotation270[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueRotation270[i].getQueen(j).getColumn()) {
                    indicator270 = indicator270 || false;
                } else {
                    indicator270 = indicator270 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueReflection[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueReflection[i].getQueen(j).getColumn()) {
                    indicator1 = indicator1 || false;
                } else {
                    indicator1 = indicator1 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueReflection90[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueReflection90[i].getQueen(j).getColumn()) {
                    indicator2 = indicator2 || false;
                } else {
                    indicator2 = indicator2 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueReflection180[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueReflection180[i].getQueen(j).getColumn()) {
                    indicator3 = indicator3 || false;
                } else {
                    indicator3 = indicator3 || true;
                }
                if (sol.getQueen(j).getRow() == UniqueReflection270[i].getQueen(j).getRow()
                        && sol.getQueen(j).getColumn() == UniqueReflection270[i].getQueen(j).getColumn()) {
                    indicator4 = indicator4 || false;
                } else {
                    indicator4 = indicator4 || true;
                }
                if (!indicator90) {
                    return false;
                }
                if (!indicator180) {
                    return false;
                }
                if (!indicator270) {
                    return false;
                }
                if (!indicator1) {
                    return false;
                }
                if (!indicator2) {
                    return false;
                }
                if (!indicator3) {
                    return false;
                }
                if (!indicator4) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve(PartialSolution sol) {
        int exam = sol.examine();
        if (exam == PartialSolution.ACCEPT) {
            if (isUnique(sol)) {
                partialSolutionSize++;
                Unique[partialSolutionSize] = copyPartialSolution(sol).sort();
                UniqueRotation90[partialSolutionSize] = Rotation(sol).sort();
                UniqueRotation180[partialSolutionSize] = Rotation(Rotation(sol)).sort();
                UniqueRotation270[partialSolutionSize] = Rotation(Rotation(Rotation(sol))).sort();

                UniqueReflection[partialSolutionSize] = Reflection(sol).sort();
                UniqueReflection90[partialSolutionSize] = Reflection(UniqueRotation90[partialSolutionSize]).sort();
                UniqueReflection180[partialSolutionSize] = Reflection(UniqueRotation180[partialSolutionSize]).sort();
                UniqueReflection270[partialSolutionSize] = Reflection(UniqueRotation270[partialSolutionSize]).sort();

                System.out.println(Unique[partialSolutionSize]);
            }
        } else if (exam != PartialSolution.ABANDON) {
            for (PartialSolution p : sol.extend()) {
                solve(p);
            }
        }
    }

    public static void main(String args[]) {
        solve(new PartialSolution(0));
    }

}
