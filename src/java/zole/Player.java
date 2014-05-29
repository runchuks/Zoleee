/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import java.sql.Connection;

/**
 *
 * @author Krumons
 */



public class Player {
    String firstName;
    String lastName;
    Card hand[];
    int handsPlayed;
    int points;
    int id = 0;
    int counter = 1;
    
    
    public Player(String name, String lastName, Card hand[], int handsPlayed) {
        hand = new Card[8];
        this.firstName = name;
        this.lastName = lastName;
        this.handsPlayed = handsPlayed;
        this.points = 0;
        id = ++counter;
    }   
    
    public Player (String firstName, String lastName, int points){
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getPoints(){
        return this.points;
    }
    
}
