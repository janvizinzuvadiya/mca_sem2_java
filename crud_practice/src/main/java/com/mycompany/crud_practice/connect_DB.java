package com.mycompany.crud_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect_DB 
{
    Connection cn;
    String host ;
    String user;
    String pass;
    
    public Connection getConnectionObject()
    {
        host  = "jdbc:mysql://localhost:3306/test";
        user = "root";
        pass = "";
        
            try
            {
                cn = DriverManager.getConnection(host,user,pass);
                return cn;
            }
            catch (SQLException se)
            {
                System.err.println("XXXXXXXXXXXXXXXXXXXXX"+se+"XXXXXXXXXXXXXXXXXXXXXXXX");
                return null;
            }
    }
    
    
}
