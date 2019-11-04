
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
public class P6_14 {
    
    public static int[] sortArray(int[] values){
        Arrays.sort(values);
        System.out.println("Array after sorting :" + Arrays.toString(values));
        return values;
    }
    
    public static int[] generateRandomArray(){
        Random random = new Random();
        final int LENGTH = 20;
        
        int[] array = new int[LENGTH];
        for(int i = 0; i < LENGTH; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Array before sorting :" + Arrays.toString(array));
        return array;
    }
    
    public static void main(String[] args){
        
        int[] values = generateRandomArray();
        Arrays.sort(values);
        sortArray(values);
    }
}
