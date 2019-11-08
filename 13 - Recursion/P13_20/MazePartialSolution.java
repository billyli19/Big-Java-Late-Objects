/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_20;
import java.util.ArrayList;
/**
 *
 * @author billy
 */
public class MazePartialSolution implements PartialSolution{
    private static String[][] strMaze;
    private ArrayList iEscape = new ArrayList();
    private ArrayList isVisited = new ArrayList();
    private Coordinate coordinate;
    
    public MazePartialSolution(int x, int y){
        coordinate = new Coordinate(x, y);
    }
    
    public static void maze(){
        strMaze = new String[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(j == 1 && i == 0){
                    strMaze[i][j] = "E";
                    System.out.print(" ");
                } else if(i == 1 && ((j > 0 && j < 6) || j == 7)){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 2) && (j == 1 || j == 7)){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 3) && (j == 1 || j == 3 || (j > 4 && j < 8))){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 4) && (j == 1 || j == 3 || j == 7)){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 5) && ((j > 0 && j < 4) || (j > 4 && j < 8))){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 6) && (j == 3 || j == 5 || j == 7)){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 7) && ((j > 0 && j < 6) || j == 7)){
                    strMaze[i][j] = " ";
                    System.out.print(" ");
                } else if((i == 8) && (j == 7)){
                    strMaze[i][j] = "E";
                    System.out.print(" ");
                } else {
                    strMaze[i][j] = "*";
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    public int examine(){
        if(isVisited.contains("(" + coordinate.getX() + "," + coordinate.getY() + ")")){
            return ABANDON;
        }
        if(strMaze[coordinate.getY()][coordinate.getX()] == "E"){
            iEscape.add(coordinate.getX() + "," + coordinate.getY());
            return ACCEPT;
        }
        if((coordinate.getX()>8) || coordinate.getX() < 0 || (coordinate.getY() > 8 || coordinate.getY() < 0)){
            return ABANDON;
        }
        if(strMaze[coordinate.getY()][coordinate.getX()] == "*"){
            return ABANDON;
        }
        isVisited.add("(" + coordinate.getX() + "," + coordinate.getY() + ")");
        iEscape.add("(" + coordinate.getX() + "," + coordinate.getY() + ")");
        return CONTINUE;
    }
    
    public MazePartialSolution[] extend(){
        MazePartialSolution[] result = new MazePartialSolution[4];
        result[0] = new MazePartialSolution(coordinate.getX(), coordinate.getY()+1);
        result[0].isVisited.addAll(this.isVisited);
        result[0].iEscape.addAll(this.iEscape);
        result[1] = new MazePartialSolution(coordinate.getX() + 1, coordinate.getY());
        result[1].isVisited.addAll(this.isVisited);
        result[1].iEscape.addAll(this.iEscape);
        result[2] = new MazePartialSolution(coordinate.getX() - 1, coordinate.getY());
        result[2].isVisited.addAll(this.isVisited);
        result[2].iEscape.addAll(this.iEscape);
        result[3] = new MazePartialSolution(coordinate.getX(), coordinate.getY()-1);
        result[3].isVisited.addAll(this.isVisited);
        result[3].iEscape.addAll(this.iEscape);
        return result;
    }
    
    public void solve(){
        int exam = this.examine();
        if(exam == this.ACCEPT){
            System.out.println("\n\n\n\n\n\n");
            for(Object s : iEscape){
                System.out.println(s.toString());
            }
        } else if(exam != this.ABANDON){
            for(MazePartialSolution p : this.extend()){
                p.solve();
            }
        }
    }
    
    public static void main(String args[]){
        MazePartialSolution pz = new MazePartialSolution(2, 0);
        pz.solve();
        System.out.println();
    }
}
