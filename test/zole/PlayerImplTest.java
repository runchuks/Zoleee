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
 * @author Janis
 */
public class PlayerImplTest {
    
    public PlayerImplTest() {
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
     * Test of findPlayer method, of class PlayerImpl.
     */
    @Test
    public void testFindPlayer() throws Exception {
        System.out.println("findPlayer");
        String firstName = "Janis";
        String lastName = "Veiss";
        PlayerImpl instance = null;
        Player expResult = new Player("Janis","Veiss",123);
        Player result = instance.findPlayer(firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
