/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

/**
 *
 * @author Krumons
 */
public class Table {
    
    Card[] cards;
    Card[] table;
    static Deck deck;
    Player p1;
    Player p2;
    Player p3;
    

    public Table() {
       deck = new Deck();
       cards = new Card[3];
       table = new Card[2];
       p1 = new Player("Pirmais", "Speletajs",0);
       p2 = new Player("Otrais", "Speletajs",0);
       p3 = new Player("Otrais", "Speletajs",0);
    }
    
    void deal(){
        Card[] p1cards = new Card[8];
        Card[] p2cards = new Card[8];
        Card[] p3cards = new Card[8];
        for(int i=0; i<8; i++){
            
            p1cards[i] = deck.cards[i];
            deck.cards[i].setOwner(1);
            System.out.print(deck.cards[i].toString());
            
            p2cards[i] = deck.cards[i+8];
            deck.cards[i+8].setOwner(2);
            System.out.print(deck.cards[i].toString());
            
            p2cards[i] = deck.cards[i+16];
            deck.cards[i+16].setOwner(3);
            System.out.println(deck.cards[i].toString());
        }
        table[0] = deck.cards[24];
        table[1] = deck.cards[25];
        
        
    }
    
    public static void main(String[] args) {
       while(true){
          deck.shuffle();
          
       }
    }
    

}
