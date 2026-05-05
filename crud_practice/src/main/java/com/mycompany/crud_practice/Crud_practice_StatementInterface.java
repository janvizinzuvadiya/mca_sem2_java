// com.mysql
// mysql-connector-j
// 8.0.33

package com.mycompany.crud_practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Crud_practice_StatementInterface {

    public static void main(String[] args) 
    {
        connect_DB getcn = new connect_DB();
        Connection con = getcn.getConnectionObject();
        
//        StatementMethods(con);
PreparedMethods(con);
        
       
    }
    public static void StatementMethods(Connection con)
        {
            try
            {
                Statement st  = con.createStatement();

                boolean flag =  st.execute("create table Employee (eno int,ename carcahr(20),email varchar(50))");
                System.out.println(flag); 

                int eff  = st.executeUpdate("insert into Employee values (1,'Harry' ,'h@gmail.com'),(2,'Ron','r@gmail.com'),(3,'Harmiony','hr@gmail.com') ");
                System.out.println(eff);

                ResultSet rs = st.executeQuery("select * from Employee");
                while(rs.next())
                {
                    System.out.print(rs.getInt(1)+" ");
                    System.out.print(rs.getString(2)+" ");
                    System.out.print(rs.getString(3));

                    System.out.println("");
                }

            }
            catch(SQLException se)
            {
                System.err.println("XXXXXXXXXXXXXXXXXXXXX\n"+se+"XXXXXXXXXXXXXXXXXXXXXXXX");
            }
        }

    private static void PreparedMethods(Connection con) 
    {
        
        try
        {
          PreparedStatement pst = con.prepareStatement("select * from Employee Where ename=? AND email=?");
          
          
          
        }
        catch(SQLException se)
        {
             System.err.println("XXXXXXXXXXXXXXXXXXXXX\n"+se+"XXXXXXXXXXXXXXXXXXXXXXXX");
        }

    }
}

