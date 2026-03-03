package assignment1;

import java.util.Scanner;

public class task4 
{
    Scanner sc;
    int a,b,c;
    
           public void find_minimum()
           {
                      sc= new Scanner(System.in);
                      
                      System.out.println("Enter Value->");
                      a= sc.nextInt();
                      
                      System.out.println("Enter Value->");
                      b=sc.nextInt();
                      
                      System.out.println("Enter Value->");
                      c=sc.nextInt();
                      
                      if(a<b)
                      {
                          if(a<c)
                          {
                              System.out.println(a+" is minimum");
                          }
                          else
                          {
                               System.out.println(c+ " is minimum");
                          }
                      }
                      else
                      {
                              if(b<c)
                              {
                                  System.out.println(b + " is minimum");
                              }
                              else
                              {
                                  System.out.println(c+ " is minimum");
                              }
                      }
           }
    
}
