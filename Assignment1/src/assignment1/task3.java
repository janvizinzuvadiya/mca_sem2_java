package assignment1;

import java.util.Scanner;

public class task3 
{
    Scanner sc;
    double len;
    double width;
    
    public void calculate_area()
    {
           sc=new Scanner(System.in);
           
           System.out.println("Enter Length of Rectangle->");           
           len=sc.nextDouble();
          
           System.out.println("Enter Width of Rectangle->");           
           width=sc.nextDouble();
           
           double area = len* width;
           System.out.println("Area of Rectangle="+area);
           
    }
    
}
