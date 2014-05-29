
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Janis
 */
public class PlayerImpl {
    
    private Connection zoleDB;
    
    public PlayerImpl(Connection conn){
        this.zoleDB = conn;
    }
    
    public Player findPlayer (String firstName, String lastName) throws PlayerException{
        Player plyr = null;
        try{
            PreparedStatement preStmt = zoleDB.prepareStatement("SELECT * FROM `players`"
							+ "WHERE first_name = ? AND last_name = ? ");
            preStmt.setString(1, firstName);
            preStmt.setString(2, lastName);
            ResultSet rs = preStmt.executeQuery();
                        
            while (rs.next()) {
                plyr = new Player(rs.getString(2),rs.getString(3),rs.getInt(4));
            }
            preStmt.close();
            zoleDB.close();
        } catch(Exception e) {
            throw new PlayerException(PlayerException.ERROR_FIND_NAME,e);
        }
        return plyr;
    }
    
}
