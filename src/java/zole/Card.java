/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

/**
 *
 * @author Janis
 */
public class Card {
    String suit;
    int number;
    int value;
    
    public Card(){
        suit = " ";
        number = 0;
        value = 0;
    }

    public Card(String suit, int number, int value) {
        this.suit = suit;
        this.number = number;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
