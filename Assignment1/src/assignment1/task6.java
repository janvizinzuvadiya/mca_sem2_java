package assignment1;

import java.util.Scanner;

public class task6 
{
    Scanner sc;
    int num;
    
    public void print_table()
    {
            sc=new Scanner(System.in);
        
            System.out.println("Enter Number->");
            num=sc.nextInt();
             
            int ans;
                System.out.println("\tTable of "+num +":\n");
                for(int i=1;i<=10;i++)
                {
                     ans=num*i;
                     System.out.println("\t"+num +" X "+ i +" = "+ ans);
                }
            
        
        
        
    }
        
}
