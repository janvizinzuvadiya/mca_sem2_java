package practice_defs;

import java.util.Scanner;

public class palindrome_str 
{
    Scanner sc;
    public palindrome_str()
    {
        sc=new Scanner(System.in);
    }
    
    public void palindrome()
    {
        System.out.print("Enter String-> ");
        String str= sc.next();
        
        boolean flag=true;      
        int i=0;
        int j=str.length()-1;
        
        while(i<j)
        {
            if(str.charAt(i)== str.charAt(j))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }
            
            i++;
            j--;
        }
        System.out.println(flag ? "\nString is palindrome " : "\nString is not palindrome");
        
    }
    
}
