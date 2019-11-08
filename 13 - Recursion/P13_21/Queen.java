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
public class Queen {
    private int row;
    private int column;
    
    public Queen(int r, int c){
        row = r;
        column = c;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getColumn(){
        return column;
    }
    
    public void setRow(int r){
       row = r;
    }
    
    public void setColumn(int c){
        column = c;
    }
    
    public boolean attacks(Queen other){
        return row == other.row || column == other.column || Math.abs(row -other.row) == Math.abs(column - other.column);
    }
    
    public String toString(){
        return "" + "abcdefgh".charAt(column) + (row + 1);
    }
}
