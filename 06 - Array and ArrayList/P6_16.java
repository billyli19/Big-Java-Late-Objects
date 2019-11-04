
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P6_16 {
    
    public static int nextStall(boolean[] A){
        int longestIndex = -1;
        int longestRun = 0;
        int currentIndex = -1;
        int currentRun = 0;
        
        boolean inRun = false;
        
        for(int i = 0; i < A.length; i++){
            if(inRun && A[i]){
                inRun = false;
                if(currentRun >= longestRun){
                    longestRun = currentRun;
                    longestIndex = currentIndex;
                }
            } else if(!inRun && !A[i]){
                inRun = true;
                currentIndex = i;
                currentRun = 1;
            } else if(inRun && !A[i]){
                currentRun = currentRun + 1;
            }
        }
        if(inRun){
            if(currentRun >= longestRun){
                longestRun = currentRun;
                longestIndex = currentIndex;
            }
        }
        return (longestRun -1 ) / 2 + longestIndex;
    }
    
    public static void printStall(boolean[] A){
        for(boolean el : A){
            if(el){
                System.out.print("X");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        final int LENGTH = 10;
        
        boolean[] stall = new boolean[LENGTH];
        
        for(int i = 0; i < stall.length; i++){
            stall[nextStall(stall)] = true;
            printStall(stall);
        }
    }
}
