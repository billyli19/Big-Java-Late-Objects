
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author billy
 */
public class P6_13 {
    
    public static void printArrayWithParenthesis(int[] values, int index, int length){
        boolean inRun = false;
        for(int i = 0; i < values.length; i++){
            if(inRun){
                if(length == 0){
                    System.out.print(") " + values[i] + " ");
                    inRun = false;
                } else {
                    System.out.print(" " + values[i]);
                }
                length--;
            } else if(i == index){
                inRun = true;
                length--;
                System.out.print("(" + values[i]);
            } else {
                System.out.print(values[i] + " ");
            }
        }
        if(length == 0){
            System.out.print(")");
        }
        System.out.println();
    }
    
    public static void printLongestRun(int[] values){
        boolean inRun = false;
        int previousValue = values[0];
        int longestRunLength = 0;
        int longestRunIndex = -1;
        int currentRunLength = 0;
        int currentRunIndex = -1;
        
        for(int i = 0; i < values.length - 1; i++){
            if(inRun){
                if(values[i] != previousValue){
                    inRun = false;
                    if(currentRunLength > longestRunLength){
                        longestRunLength = currentRunLength;
                        longestRunIndex = currentRunIndex;
                    }
                } else {
                    currentRunLength++;
                }
            } else {
                if(values[i] == values[i + 1]){
                    inRun = true;
                    currentRunLength = 1;
                    currentRunIndex = i;
                }
            }
            previousValue = values[i];
        }
        if(inRun && values[values.length - 1] == previousValue){
            currentRunLength++;
            if(currentRunLength > longestRunLength){
                longestRunLength = currentRunLength;
                longestRunIndex = currentRunIndex;
            }
        }
        printArrayWithParenthesis(values, longestRunIndex, longestRunLength);
    }
    
    public static void main(String args[]){
        Random random = new Random();
        
        int[] dieTosses = new int[20];
        
        for(int i = 0; i < dieTosses.length; i++){
            dieTosses[i] = random.nextInt(6) + 1;
        }
        
        printLongestRun(dieTosses);
    }
}
