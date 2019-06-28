
import java.util.Scanner;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class P3_16 {

    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        String firstWord;
        String secondWord;
        String thirdWord;

        System.out.println("Enter three words separated by spaces: ");

        firstWord = wordInput.next();
        secondWord = wordInput.next();
        thirdWord = wordInput.next();

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add(firstWord);
        treeSet.add(secondWord);
        treeSet.add(thirdWord);
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
