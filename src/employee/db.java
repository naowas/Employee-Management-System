/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Naowas
 */
public class db {
    
    Connection conn=null;
    public static Connection dbconn(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:data.sqlite");
            return conn;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
        
    }
    
}
