
import java.util.Arrays;
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
public class P6_15 {
   public static void main(String[] args){
       Random r = new Random();
       int[] random = new int[10];
       int[] ordered = {1,2,3,4,5,6,7,8,9,10};
       int orderedCurrentSize = ordered.length;
       
       for(int i = 0; i < ordered.length; i++){
           int position = (int)(Math.random() * orderedCurrentSize);
           random[i] = ordered[position];
           for(int k = position + 1; k < orderedCurrentSize; k++){
               ordered[k - 1] = ordered[k];
           }
           orderedCurrentSize--;
       }
       
       System.out.println("Random array: " + Arrays.toString(random));
   }
}