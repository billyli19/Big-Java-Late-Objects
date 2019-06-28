/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author billy
 */
public class P3_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card;
        char cardRank;
        char cardSuit;
        String cardName = "";
        System.out.println("Enter the card notation: ");
        card = sc.next();

        cardRank = card.charAt(0);
        cardSuit = card.charAt(1);

        if (cardRank == 'A') {
            cardName = cardName + "Ace";
        } else if (cardRank == 'K') {
            cardName = cardName + "King";
        } else if (cardRank == 'Q') {
            cardName = cardName + "Queen";
        } else if (cardRank == 'J') {
            cardName = cardName + "Jack";
        } else {
            cardName = cardName + cardRank;
        }

        cardName = cardName + " of ";

        if (cardSuit == 'D') {
            cardName = cardName + "Diamond";
        } else if (cardSuit == 'H') {
            cardName = cardName + "Heart";
        } else if (cardSuit == 'S') {
            cardName = cardName + "Spades";
        } else if (cardSuit == 'C') {
            cardName = cardName + "Clubs";
        }
        System.out.println(cardName);
        sc.close();
    }
}
