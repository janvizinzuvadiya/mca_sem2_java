package assignment1;

import java.util.Scanner;

public class task5 
{
    Scanner sc;
    int rno;
    String nm;
    int total;
    String grade;
    
    
    public void get_result()
    {
           sc= new Scanner(System.in);
           
           System.out.println("Enter Roll no->");
           rno= sc.nextInt();
           
           System.out.println("Enter Name->");
           nm= sc.next();
           sc.nextLine();
           
           System.out.println("Enter Total secured in 5 susbjects->");
           total= sc.nextInt();
           
           double per;
           per= (total*100)/500;
           
           if(per>= 70)
           {
               grade="Distinction";
           }
           else if(per<70 && per>=60)
           {
               grade="First Class";
           }
           else if(per<60 &&  per>=50)
           {
               grade="Second Class";
           }
           else if(per<50 && per>=40)
           {
               grade="Pass Class";
           }
           else
           {
               grade = "Fail";
           }
           
           
           System.out.println("-------------------------------------------------------------------------------------------");
           System.out.println("");
           
                     System.out.println("\t Roll no:\t"+rno);
                     System.out.println("\t Name:\t\t"+nm);
                     System.out.println("\t Total:\t\t"+ total);
                     System.out.println("\t Percentage:\t"+per);
                     System.out.println("\t Grade:\t\t"+grade);
                      
           System.out.println(""); 
           System.out.println("-------------------------------------------------------------------------------------------");
    } 
    
}
