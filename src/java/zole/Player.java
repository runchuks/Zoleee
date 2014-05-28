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
public class Player {
    String name;
    String lastName;
    Card hand[];
    int handsPlayed;
    int points;
    int id = 0;
    int counter = 1;

    public Player(String name, String lastName, Card hand[], int handsPlayed) {
        hand = new Card[8];
        this.name = name;
        this.lastName = lastName;
        this.hand = hand;
        this.handsPlayed = handsPlayed;
        this.points = 0;
        id = ++counter;
    }
    
}
