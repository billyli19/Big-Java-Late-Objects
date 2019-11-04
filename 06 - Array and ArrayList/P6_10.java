
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P6_10 {

    public static int removeDuplicate(int[] arr, int n){
        if(n == 0 || n == 1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i + 1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for(int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
       
    public static int[] array_A() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values for array A: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");

        int[] a = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Value at index " + i + " : ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static int[] array_B() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount of values for array B: ");
        final int LENGTH = sc.nextInt();
        System.out.println("Please enter " + LENGTH + " values");
        System.out.println("Please enter value for");
        
        int[] b = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Value at index " + i + " : ");
            b[i] = sc.nextInt();
        }
        return b;
    }
    
    public static boolean equals(int[] a, int[] b) {
        if (a.length == b.length) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    count++;
                }
            }
            if (count == a.length) {
                System.out.println("Array match!");
                return true;
            }
        }
        System.out.println("Array doesn't match!");
        return false;
    }
    
    public static void main (String[] args) {     
        
        int[] a = array_A();
        Arrays.sort(a);
        int length_a = a.length;
        length_a = removeDuplicate(a,length_a);
        
        int[] b = array_B();
        Arrays.sort(b);
        int length_b = b.length;
        length_b = removeDuplicate(b,length_b);
        
        int[] A = new int[length_a];
        int[] B = new int[length_b];
        
        for(int i = 0; i < length_a; i++){
            A[i] = a[i];
        }
        for(int i = 0; i < length_b; i++){
            B[i] = b[i];
        }
        
        equals(A,B);
    }  
}  