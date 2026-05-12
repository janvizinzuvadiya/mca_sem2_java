package com.mycompany.jdbc_demo;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.io.*;




public class Jdbc_demo 
{
        public static void main(String [] args)
        {
                Scanner sc = new Scanner(System.in);
                
//                try
//                {
//                    int arr[] = new int[5];
//                    arr[5]=9/0;
                    
//                    String s = "sdf 3";
//                    int a = Integer.parseInt(s);
                    
//                    String str  = null ;
//                    System.out.println(str.length());
                    
//                }
//                catch(NumberFormatException e)
//                {
//                    System.err.println(e);
//                }
//                catch(NullPointerException e)
//                {
//                    System.err.println(e);
//                }
//                catch(ArrayIndexOutOfBoundsException e)
//                {
//                    System.err.print(e);
//                }
//                catch(ArithmeticException e)
//                {
//                    System.err.print(e);
//                }
//                catch(Exception e)
//                {
//                    System.err.println(e);
//                }
                
//                try
//                {
                    
//                               File Handling
//                    using FileWriter FileReader
                    
                    
//                    FileWriter w = new FileWriter("data.txt");
//                    w.write("Hello world \n new line");
//                    w.close();
                    
//                    FileWriter cp = new FileWriter("copy.txt");
//                    FileReader r = new FileReader("data.txt");
//                    
//                    int i;
//                    while((i= r.read())!=-1)
//                    {
//                        cp.write((char)i);
//                    }
//                    r.close();
//                    cp.close();
                    
                    
//                    FileOutputStream ow = new FileOutputStream("byte.txt");
//                    String str  = "helloo hy bye ";
//                    ow.write(str.getBytes());
                    
//                    FileInputStream in = new FileInputStream("data.txt");
//                    FileOutputStream out  = new FileOutputStream("bytefile.txt");
//                     
//                    int i;
//                    while((i=in.read())!=-1)
//                    {
//                        out.write((char)i);
//                    }
                    
//                                   Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
//                                   
//                                   PreparedStatement ps = cn.prepareStatement("update sales set pd_name='Mousepad' where pd_price=2");
//                                   ps.executeUpdate();
//                                   
//                                   PreparedStatement p = cn.prepareStatement("select * from sales");
//                                   ResultSet r = p.executeQuery();
//                                   
//                                   while(r.next())
//                                   {
//                                       System.out.println(r.getInt(1)+"  ||  "+r.getString(2)+"  ||  "+r.getInt(3));
//                                   }
                                                 
                                   
//                                   Statement st = cn.createStatement();
//                                   
//                                   int count= 0;
//                                   
//                                   PreparedStatement pst = cn.prepareStatement("insert into sales values (?,?,?)");
//                                   
//                                   for (int i=1; i<6;i++)
//                                   {
//                                       System.out.print("Enter values->");
//                                       int id = sc.nextInt();
//                                       String nm = sc.next();
//                                       int pr = sc.nextInt();
//                                       
//                                       pst.setInt(1, id);
//                                       pst.setString(2, nm);
//                                       pst.setInt(3, pr);
//                                       
//                                       pst.executeUpdate();
//                                       count++;
//                                   }
//                                   
//                                   System.out.print(count + "Record Inserted!");  
                                   
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
                    
                    
//                        PreparedStatement p = cn.prepareStatement("select * from sales where pd_name = ?");
//                        System.out.println("Enter Product Name->");
//                        String str = sc.next();
//                        p.setString(1, str);
//                        
//                         ResultSet rs=p.executeQuery();
//
//                        while(rs.next())
//                        {
//                            System.out.println(rs.getInt(1)+"  ||  "+rs.getString(2)+"  ||  "+rs.getInt(3));
//                        }  
//
//                        }
//                        catch(Exception e)
//                        {
//                                   System.err.println(e);
//                        }
        }
}