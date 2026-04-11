
package com.mycompany.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection 
{
    Connection cn;
    String url;
    String username;
    String password;
    
    public connection()
    {
        this.url = "jdbc:mysql://localhost:3306/test";
        this.username = "root";
        this.password = "";
    }
    
    public Connection connect_db()
    {
            try
            {
                cn=DriverManager.getConnection(url,username,password);
                System.out.println("connected!-----------------------------------------------------------------------");
                
                return cn;
            }
            catch(SQLException e)
            {
                System.out.print(e);
                return cn;
            }
    }
}
