/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import java.sql.Connection;

/**
 *
 * @author Janis
 */
public class PlayerImpl {
    
    private Connection zoleDB;
    
    public PlayerImpl(Connection conn){
        zoleDB = conn;
    }
    
    public Player findPlayer (String firstName, String lastName){
        Player plyr = null;
        
        
        
        return plyr;
    }
    
}
