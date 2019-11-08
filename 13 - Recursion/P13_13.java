
import java.util.ArrayList;
import java.util.Collections;
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
public class P13_13 {

    public static ArrayList<String> generateSubSet(String word) {
        ArrayList<String> result = new ArrayList<String>();
        if (word.equals("")) {
            result.add(word);
        } else {
            char ch = word.charAt(0);
            String remaining = word.substring(1);

            ArrayList<String> subsets = generateSubSet(remaining);

            result.addAll(subsets);

            for (String s : subsets) {
                result.add(ch + s);
            }
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = sc.next();
        ArrayList<String> subsets = generateSubSet(word);
        Collections.sort(subsets);
        System.out.println(subsets);
    }
}
