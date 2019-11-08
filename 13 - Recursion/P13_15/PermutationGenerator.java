/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P13_15;

/**
 *
 * @author billy
 */
public class PermutationGenerator {
    private String word;
    private NumberPermutationIterator indexPermutationGenerator;
    
    public PermutationGenerator(String aWord){
        word = aWord;
        indexPermutationGenerator = new NumberPermutationIterator(word.length());
    }
    
    public boolean hasMorePermutation(){
        return indexPermutationGenerator.hasMorePermutation();
    }
    
    public String nextPermutation(){
        int[] a = indexPermutationGenerator.nextPermutation();
        
        String r = "";
        for(int i = 0; i < a.length; i++){
            r += word.charAt(a[i]);
        }
        return r;
    }
}
