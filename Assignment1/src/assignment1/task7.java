package assignment1;

import java.util.Scanner;

public class task7 
{
    Scanner sc;
    int no;
    
    public void Show_menu()
    {
        sc = new Scanner(System.in);
        int choice=0;
        
        do
        {
            System.out.println("What do you Want to Perform?");
            System.out.println("1-> Factorial of a number");
            System.out.println("2-> Check Number is Odd or Even");
            System.out.println("3-> Exit");
            
                System.out.println("Enter Your choice here->");
                choice = sc.nextInt();
                
                switch (choice) 
                {
                    case 1:
                                factorial();
                                break;
                    case 2:
                                odd_even();
                                break;
                    case 3:
                                System.out.println("Exiting !!!");
                                break;
                     
                     default:
                                System.out.println("Invalid choice!");                               
                }
            
        }while(choice != 3);
        
    }
    
    public void factorial()
    {
        System.out.println("Enter Number->");
        no = sc.nextInt();
        
            int fact=1;
            for(int i=no;i>0;i--)
            {
                fact*=i;
            }
            
            System.out.println("Factorial="+fact);
    }
    public void odd_even()
    {
          System.out.println("Enter Number->");
          no = sc.nextInt();
          
          if(no%2==0)
          {
              System.out.print("Even Number");
          }
          else
          {
              System.out.print("Odd Number");
          }
    }
    
}
