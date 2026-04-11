package com.mycompany.jdbc_demo;
import java.sql.*;


public class Jdbc_demo {

    public static void main(String[] args) 
    {
        try
        {
            connection con= new connection();
            
            Connection cn= con.connect_db();
            
            Statement st = cn.createStatement();
            
//            creating Table
//            st.execute("create table student (rollno int,name varchar(20))");
            
//            Inserting data
               st.executeUpdate("insert into student values(1,'aaa'),(2,'bbb'),(3,'ccc')");
        }
        catch(SQLException e)
        {
            System.out.println("Falied..................................................!"+e);
        }
        
    }
}
