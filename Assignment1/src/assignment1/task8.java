package assignment1;

import java.util.Scanner;

public class task8 
{
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    
    public void get_array()
    {
        System.out.print("Enter 5 values->\n");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        print_array();
    }
    
    public void print_array()
    {
        System.out.print("\nelements are---:\n");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
