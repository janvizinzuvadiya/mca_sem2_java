package practice_defs;
import java.util.Scanner;

public class reverse_num 
{
    Scanner sc;
    public reverse_num()
    {
        sc= new Scanner(System.in);
    }
    
    public void reverse()
        {
            System.out.print("\nEnter Number->");
            int num=sc.nextInt();

                int temp = num;
                int rev=0;

                while(temp!=0)
                {
                    int rem=temp%10;
                    rev*=10;
                    rev+=rem;
                    temp=(int)temp/10;
                }

            System.out.println("\nReverse number = "+rev);
    }
        
}


