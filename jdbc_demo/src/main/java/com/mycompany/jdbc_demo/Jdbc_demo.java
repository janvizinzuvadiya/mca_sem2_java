package com.mycompany.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class Jdbc_demo 
{
        public static void main(String [] args)
        {
                        try
                        {
                                   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                                   Statement st = cn.createStatement();
                                   
                                   PreparedStatement pst = cn.prepareStatement("insert into sales values (?,?,?)");
                                   
                                   for (int i=1; i<6;i++)
                                   {
                                       
                                   }
                                   
                                   
                                   
                                   
                                   
                                   
                                   
                                   
//                                   st.execute("create table sales (pd_no int, pd_name varchar(20),pd_price int)");
                              
//                                   st.executeUpdate("insert into sales values (2,'Mouse',5000)");      
//                                   st.executeUpdate("insert into sales values (3,'Keyboard',000)");
//                                   st.executeUpdate("insert into sales values (4,'Charger',4000)");
//                                   st.executeUpdate("insert into sales values (5,'PC',35000)");

//                                     st.executeUpdate("update sales set pd_price=70000 where pd_no=1");

//                                      ResultSet rs=st.executeQuery("select * from sales");
//                                      
//                                      while(rs.next())
//                                      {
//                                          System.out.println(rs.getInt(1)+"  ||  "+rs.getString(2)+"  ||  "+rs.getInt(3));
//                                      }        
                        }
                        catch(Exception e)
                        {
                                   System.err.println(e);
                        }
        }
}