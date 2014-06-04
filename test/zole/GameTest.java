/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krumons
 */
public class GameTest {
       
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deal method, of class Game.
     */
    @Test
    public void testDeal() {
        Game game = new Game();
        boolean isNull = false;
        System.out.println("deal");
        Player p1 = new Player("Pirmais", "Speletajs",0);
        Player p2 = new Player("Pirmais", "Speletajs",0);
        Player p3 = new Player("Pirmais", "Speletajs",0);
        Card[] tableCards = new Card[2];
        
        Deck deck = new Deck();
        
        game.deal(p1,p2,p3,tableCards,deck);
        for (int i=0; i<8; i++){
            if (p1.hand[i] == null){ 
                isNull = true;
                
            }
            System.out.print(p1.hand[i].toString() + "     ");
            System.out.print(p2.hand[i].toString() + "     ");
            System.out.println(p3.hand[i].toString() + "     ");
            if (p2.hand[i] == null){
                isNull = true;
            }            
            if (p3.hand[i] == null){
                isNull = true;                
            }
        }
        if(tableCards[0] == null || tableCards[1] == null){
            isNull = true;
        }
        System.out.println(tableCards[0].toString() + "     ");
        System.out.println(tableCards[1].toString() + "     ");
        assert(!isNull);
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of move method, of class Game.
     */
    @Test
    public void testMove() {
//        System.out.println("move");
//        Player player = null;
//        Card firstCard = null;
//        Card expResult = null;
//        Card result = Game.move(player, firstCard);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }
    
}
