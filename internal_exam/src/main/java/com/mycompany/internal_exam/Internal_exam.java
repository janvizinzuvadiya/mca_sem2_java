package com.mycompany.internal_exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Internal_exam {

    public static void main(String[] args)  throws Exception
    {
        
//        try
//        {
//            Student s1 = new Student(1,"hhdfg",18,"MCA");
//            s1.checkAge();
//            s1.checkName();            
//        }
//        catch(AgeNotWithinRangeException ae)
//        {
//            System.err.print(ae);
//        }
//        catch(NameNotValidException ne)
//        {
//            System.err.println(ne);
//        }
       
        
//        Write a program to demonstrate NumberFormatException and NullPointerException.
//           try
//           {
//              String str = null;
//              String  a = "3 df";
//              
//               System.out.println(str.length());
//               
//               int b = Integer.parseInt(a);
//               System.out.print(b);
//                             
//           }                
//           catch(NullPointerException e)
//           {
//               System.err.print(e);
//           }
//           catch(NumberFormatException e)
//           {
//               System.err.print(e);
//           }
            
//            try
//            {
//                     FileOutputStream out = new FileOutputStream("new.txt");
//                     String str = "Hello world";
//                     byte [] b = str.getBytes();
//                     out.write(b);                 
//                     out.close();
//                     System.out.println("Written Down!!");
                
//                        FileInputStream in = new FileInputStream("new.txt");
//                        int i;
//                        while((i=in.read())!=-1)
//                        {
//                            System.out.print((char)i);
//                        }
//                        
//                        in.close();
//             
//            }
//            catch(IOException e)
//            {
//                    System.out.print(e);
//            }
        
        
        
        
//            try
//            {
//                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                
//                Statement st = cn.createStatement();
//                st.execute("create table Emp(id int,name varchar(20),passwrod varchar(10))");
//                
//                System.out.print("Table Created!!");
                
//                PreparedStatement pst = cn.prepareStatement("insert into Emp values (?,?,?)");
//                
//                pst.setInt(1, 4);
//                pst.setString(2, "adnfihgr");
//                pst.setString(3, "asr8304");
//                
//                pst.executeUpdate();
                
//                ResultSet rs = st.executeQuery("Select * from Emp");
//                while(rs.next())
//                {
//                    System.out.print(rs.getInt(1)+" ");
//                    System.out.print(rs.getString(2)+" ");
//                    System.out.print(rs.getString(3)+" ");
//                    System.out.print("\n");
//                    
//                }
                
                
//3 hhh 34324

//                ResultSet rs;
//
//                PreparedStatement ps  = cn.prepareStatement("select * from Emp where name=? and passwrod=?");
//                ps.setString(1, "hhh");
//                ps.setString(2, "34jaeiu324");
//
//                rs = ps.executeQuery();
//
//                if(rs.next())
//                {
//                    System.out.println("yes");
//                }
//                else
//                {
//                    System.out.println("no");  
//                }
//
//            }
//            catch(SQLException e)
//            {
//                    System.err.print(e);
//            }

    }
}
