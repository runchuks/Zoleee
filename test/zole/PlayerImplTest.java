/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import junit.framework.TestCase;
import java.sql.*;
import static org.junit.Assert.*;

/**
 *
 * @author Janis
 */
public class PlayerImplTest extends TestCase{
    
    private Connection con;
    
    public PlayerImplTest() {
    }
    
   // @BeforeClass
    public static void setUpClass() {
    }
    
    //@AfterClass
    public static void tearDownClass() {
    }
    
    //@Before
    public void setUp() {
        try {
			String url = "jdbc:mysql://localhost/zole_db";
			String user = "root";
			String pass = "";
			System.out.println("fffffff");
                        
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
                        con.setAutoCommit(false);
                        
                        //cn.setAutoCommit(false);
                        System.out.println("Connection succesfully");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
    }
 
    
    //@After
    public void tearDown() throws SQLException{
        con.close();
    }

    /**
     * Test of findPlayer method, of class PlayerImpl.
     */
    //@Test
    public void testFindPlayer() throws Exception {
        System.out.println("findPlayer");
        String firstName = "Janis";
        String lastName = "Veiss";
        PlayerImpl instance = new PlayerImpl(con);
        Player expResult = new Player("Janis","Veiss",123);
        Player result = instance.findPlayer(firstName, lastName);
       // System.out.println(result.getPoints());
        assertEquals(expResult.getPoints(), result.getPoints());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
