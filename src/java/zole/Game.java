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
public class Game {
   
    static Card[] tableCards;
    static Deck deck;
    static Player p1;
    static Player p2;
    static Player p3;
    Table table;

    public Game() {
        deck = new Deck();
        tableCards = new Card[3];
//        p1 = new Player("Pirmais", "Speletajs", 0);
//        p2 = new Player("Otrais", "Speletajs", 0);
//        p3 = new Player("Tresais", "Speletajs", 0);
    }
    
    static void deal(){
        deck.shuffle();
        Card[] p1cards = new Card[8];
        Card[] p2cards = new Card[8];
        Card[] p3cards = new Card[8];
        for(int i=0; i<8; i++){
            
            p1cards[i] = deck.cards[i];
            deck.cards[i].setOwner(1);
            
            
            p2cards[i] = deck.cards[i+8];
            deck.cards[i+8].setOwner(2);
            
            
            p2cards[i] = deck.cards[i+16];
            deck.cards[i+16].setOwner(3);
            
        }
        tableCards[0] = deck.cards[24];
        tableCards[1] = deck.cards[25];
        
//        p1.setHand(p1cards);
//        p2.setHand(p2cards);
//        p3.setHand(p3cards);
        
    }
    static void endHand(){
//        p1.setHandsPlayed(p1.getHandsPlayed()+1);
//        p2.setHandsPlayed(p2.getHandsPlayed()+1);
//        p2.setHandsPlayed(p2.getHandsPlayed()+1);
        
    }
    static void chooseRoles(Player starter){

                if(true){ // ja 1 panem lielo, vai zoli
//                    p2.setStatus(1);
//                    p3.setStatus(1);
                } else if(true){ // ja otrais panem lielo, vai zoli
//                    p1.setStatus(1);
//                    p3.setStatus(1);
                } else if (true){ // ja tresais panem lielo, vai zoli
//                    p1.setStatus(1);
//                    p2.setStatus(1);
                }
            
    }
     
        
    
    public void GameOn(){

        while(true){
        Game game = new Game();
        game.deal();
        
        
        game.endHand();
        }
        
    }
    
    
}
