
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
public class P5_04 {

    public static String middle(String str) {
        int pos;
        int length;
        
        if(str.length() % 2 == 0){
            pos = str.length() / 2 -1;
            length = 2;
        } else {
            pos = str.length() / 2;
            length = 1;
        }
        return str.substring(pos, pos + length);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Middle: " + middle(str));
    }
}
