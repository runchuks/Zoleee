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
    String card;
    int strength; //speks
    int value; //punkti
    int status; // 0 - nav nokauta 1 - nokauta(mazajiem), 2- nokauta(liealajam)
    
    public Card(){
        suit = "";
        strength = 0;
        value = 0;
        status = 0;
        card = "";
    }

    public Card(String suit, String card,  int strength, int value, int status) {
        this.suit = suit;
        this.card = card;
        this.strength = strength;
        this.value = value;
        this.status = status;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

}
