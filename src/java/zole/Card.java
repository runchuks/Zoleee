/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Janis
 */
public class Card {
    String suit; //masts
    String card;
    int strength; //speks
    int value; //punkti
    int status;// 0 - nav nokauta 1 - nokauta(mazajiem), 2- nokauta(liealajam)
    int owner;
    String picture;
    Image image;
    
    public Card(){
        suit = "";
        strength = 0;
        value = 0;
        status = 0;
        card = "";
        owner = 0;
    }

    public Card(String suit, String card,  int strength, int value, int status, int owner, String picture) {
        this.suit = suit;
        this.card = card;
        this.strength = strength;
        this.value = value;
        this.status = status;
        this.owner = owner;
        this.picture = picture;        
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", card=" + card + ", status=" + status + ", owner=" + owner + '}';
    }
    
    public BufferedImage returnImage(){
        BufferedImage img = null;
        try{
            img = ImageIO.read(new File("src/resources" + this.picture));
        } catch (IOException e){
            
        }
        
        return img;
    }

    

}
