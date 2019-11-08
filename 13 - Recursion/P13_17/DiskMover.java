/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_17;

/**
 *
 * @author billy
 */
public class DiskMover {

    private DiskMover tailmover;
    private int iFrom, iTo, disk;
    private String state;

    public DiskMover(int nDisks, int from, int to) {
        disk = nDisks;
        iFrom = from;
        iTo = to;
        state = "BEFORE LARGEST";
        if (nDisks > 1) {
            int other = 3 - from - to;
            tailmover = new DiskMover(nDisks - 1, from, other);
        }
    }

    public boolean hasMoreMoves() {
        if (state.equals("DONE")) {
            return false;
        } else {
            return true;
        }
    }

    public String nextMove() {
        if (disk == 1) {
            state = "DONE";
            return "Move disk from peg " + iFrom + " to " + iTo;
        }
        if (state.equals("LARGEST")) {
            state = "AFTER LARGEST";
            int other = 3 - iFrom - iTo;
            tailmover = new DiskMover(disk - 1, other, iTo);
            return "Move disk from peg " + iFrom + " to " + iTo;
        }
        String strreturn = tailmover.nextMove();
        if (tailmover.hasMoreMoves() == false) {
            if (state.equals("BEFORE LARGEST")) {
                state = "LARGEST";
            } else {
                state = "DONE";
            }
        }
        return strreturn;
    }
    
    public static void main(String args[]){
        DiskMover diskmover = new DiskMover(6,0,2);
        
        while(diskmover.hasMoreMoves()){
            System.out.println(diskmover.nextMove());
        }
    }
}
