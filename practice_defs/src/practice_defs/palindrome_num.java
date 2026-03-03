package practice_defs;
import java.util.Scanner;

public class palindrome_num {
    
    Scanner sc;
    public palindrome_num()
    {
        sc=new Scanner(System.in);
    }
    
    public void palindrome()
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
        
        System.out.println((num == rev)? "\nnumber is palindrome " : "\nnumebr is not palindrome");
        
    }
    
    
}
