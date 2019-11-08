/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_14;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class PermutationIterator {
    private String word;
    private int position;
    private PermutationIterator tailiterator;
    
    public PermutationIterator(String s){
        word = s;
        position = 0;
        if(word.length() > 1){
            tailiterator = new PermutationIterator(word.substring(1));
        }
    }
    
    public boolean hasMorePermutations(){
        if(position < word.length()){
            return true;
        } else {
            return false;
        }
    }
    
    public String nextPermutation(){
        if(word.length() == 1){
            position++;
            return word;
        } else {
            String rWord = word.charAt(position) + tailiterator.nextPermutation();
            if(tailiterator.hasMorePermutations() == false){
                position++;
                if(position < word.length()){
                    String newWord = word.substring(0, position) + word.substring(position + 1);
                    tailiterator = new PermutationIterator(newWord);
                }
            }
            return rWord;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = sc.next();
        PermutationIterator perm = new PermutationIterator(word);
        while(perm.hasMorePermutations()){
            System.out.println(perm.nextPermutation());
        }
    }
}
