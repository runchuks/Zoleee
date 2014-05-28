/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import java.util.Random;

/**
 *
 * @author Krumons
 */
public class Deck {
    Card[] cards;

    public Deck(){
        cards = new Card[26];    
     
        cards[0] = new Card("Clubs", "Queen", 14, 3, 0, 0); // Kreica dama(12)
        cards[1] = new Card("Spades", "Queen", 13, 3, 0, 0); // Pika dama(12)
        cards[2] = new Card("Hearts", "Queen", 12, 3, 0, 0); // Ercena dama(12)
        cards[3] = new Card("Diamonds", "Queen", 11, 3, 0, 0); // Karava dama(12)
        
        cards[4] = new Card("Clubs", "Jack", 10, 2, 0, 0); // Kreica kalps(11)
        cards[5] = new Card("Spades", "Jack", 9, 2, 0, 0); // Pika kalps(11)
        cards[6] = new Card("Hearts", "Jack", 8, 2, 0, 0); // Ercena kalps(11)
        cards[7] = new Card("Diamonds", "Jack", 7, 2, 0, 0); // Karava kalps(11)
        
        cards[8] = new Card("Diamonds", "Ace" , 6, 11, 0, 0); // Karava Duzis
        cards[9] = new Card("Diamonds" , "Ten", 5, 10, 0, 0); // Karava Desmit
        cards[10] = new Card("Diamonds", "King", 4 , 4, 0, 0); // Karava Kungs
        cards[11] = new Card("Diamonds" , "Nine", 3, 0, 0, 0); // Karava devini
        cards[12] = new Card("Diamonds" , "Eight", 2, 10, 0, 0); // Karava astoni
        cards[13] = new Card("Diamonds" , "Seven", 1, 10, 0, 0); // Karava septini
        
        cards[14] = new Card("Clubs", "Ace", 0, 11, 0, 0); // Kreica Duzis
        cards[15] = new Card("Spades", "Ace", 0, 11, 0, 0); // Pika Duzis
        cards[16] = new Card("Hearts", "Ace", 0, 11, 0, 0); // Ercena Duzis
        
        cards[17] = new Card("Clubs", "Ten", 0, 10, 0, 0); // Kreica Desmit
        cards[18] = new Card("Spades", "Ten", 0, 10, 0, 0); // Pika Desmit
        cards[19] = new Card("Hearts", "Ten", 0, 10, 0, 0); // Ercena Desmit
        
        cards[20] = new Card("Clubs", "King", 0, 4, 0, 0); // Kreica Kungs
        cards[21] = new Card("Spades", "King", 0, 4, 0, 0); // Pika Kungs
        cards[22] = new Card("Hearts", "King", 0, 4, 0, 0); // Ercena Kungs
        
        cards[23] = new Card("Clubs", "Nine", 0, 0, 0, 0); // Kreica Devini
        cards[24] = new Card("Spades", "Nine", 0, 0, 0, 0); // Pika Devini
        cards[25] = new Card("Hearts", "Nine", 0, 0, 0, 0); // Ercena Devini        
    }
        void shuffle(){
		Random rgen = new Random();			
 
		for (int i=0; i<cards.length; i++) {
		    int randomPosition = rgen.nextInt(cards.length);
		    Card temp = cards[i];
		    cards[i] = cards[randomPosition];
		    cards[randomPosition] = temp;
		}		
	}
    
};


