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
public class PlayerException extends Exception{
	public static final String ERROR_FIND_NAME="Netrod lietotaju";
	public static final String ERROR_INSERT_ACCOUNT="Exception occured while inserting new Account";
        
        public PlayerException(String message, Throwable cause){
            super(message, cause);
        }
}
