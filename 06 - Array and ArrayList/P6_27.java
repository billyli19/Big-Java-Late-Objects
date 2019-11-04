
import java.util.ArrayList;
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
public class P6_27 {
    public static ArrayList<Integer> A() {
        int index = 0;
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length A: ");
        final int LENGTH = sc.nextInt();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Enter element for A [" + index + "/" + LENGTH + "]: ");
            index++;
            A.add(sc.nextInt());
        }
        return A;
    }

    public static ArrayList<Integer> B() {
        int index = 0;
        ArrayList<Integer> B = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter length B: ");
        final int LENGTH = sc.nextInt();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print("Enter element for B [" + index + "/" + LENGTH + "]: ");
            index++;
            B.add(sc.nextInt());
        }
        return B;
    }
    
    public static ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
        ArrayList<Integer> C = new ArrayList<Integer>();
        
        while(A.size() > 0 || B.size() > 0){
            if(A.size() > 0){
                C.add(A.get(0));
                A.remove(0);
            }
            if(B.size() > 0){
                C.add(B.get(0));
                B.remove(0);
            }
        }
        return C;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> A = A();
        ArrayList<Integer> B = B();
        ArrayList<Integer> C = merge(A, B);
        
        for(int i = 0; i < C.size(); i++){
            System.out.print(C.get(i) + " ");
        }       
    }
}
