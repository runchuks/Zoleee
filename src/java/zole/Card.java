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
    String suit; //masts
    int number; //cipars
    int value; //punkti
    int status; // 0 - ir rokaas 1 - nokauta(mazajiem), 2- nokauta(liealajam)
    
    public Card(){
        suit = "";
        number = 0;
        value = 0;
        status = 0;
    }

    public Card(String suit, int number, int value, int status) {
        this.suit = suit;
        this.number = number;
        this.value = value;
        this.status = status;
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
