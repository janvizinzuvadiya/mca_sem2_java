package practice_defs;
import java.util.Scanner;

public class areaof_circle 
{
    final double pi;
    Scanner sc;

    public areaof_circle() 
    {
        this.pi = 3.14;
        sc=new Scanner(System.in);
    }
    
    public void count_area() 
    {
        System.out.println("Enter radious->");
        double r= sc.nextDouble();
        
            double area = pi*r*r;
            System.out.println("\nArea of Circle= "+area);         
    }
    
}
