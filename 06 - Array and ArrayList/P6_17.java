
import java.util.ArrayList;
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
public class P6_17 {
    
    public static ArrayList<Integer> makeNewCardPile(ArrayList<Integer> cards){
        int newPile = 0;
        
        for(int i = 0; i < cards.size(); i++){
            int currentElement = cards.get(i);
            cards.set(i, currentElement -1);
            newPile += 1;
        }
        
        cards.add(newPile);
        
        for(int i = 0; i < cards.size(); i++){
            int currentElement = cards.get(i);
            
            if(currentElement == 0){
                cards.remove(i);
                i -= 1;
            }
        }
        return cards;
    }
    
    public static ArrayList<Integer> divideCards(){
        ArrayList<Integer> newCards = new ArrayList<Integer>();
        Random random = new Random();
        
        int amountOfCards = 45;
        while(amountOfCards > 0){
            int randomInt = random.nextInt(amountOfCards) + 1;
            newCards.add(randomInt);
            amountOfCards -= randomInt;
        }
        return newCards;
    }
    
    public static boolean checkForFinish(ArrayList<Integer> cards){
        boolean isFinished = true;
        
        if(cards.size() == 9){
            for(int i = 0; i < cards.size(); i++){
                if(!(cards.contains(i + 1))) {
                    isFinished = false;
                    break;
                }
            }
        } else {
            isFinished = false;
        }
        return isFinished;
    }
    
    public static void printCards(ArrayList<Integer> cards){
        for(int i = 0; i < cards.size(); i++){
            System.out.print(cards.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        ArrayList<Integer> cards = divideCards();
        printCards(cards);
        
        while(!checkForFinish(cards)){
            cards = makeNewCardPile(cards);
            printCards(cards);
        }
        printCards(cards);
    }
}
