package practice_defs;
import java.util.Scanner;

public class reverse_str 
{
    Scanner sc;
    
    public reverse_str()
    {
        sc = new Scanner(System.in);
    }
    
    public void reverse()
    {
        System.out.println("Enter String-> ");
        String str = sc.next();
        String strev = "";
        
        int len = str.length()-1;
        
        while(len>=0)
        {
            strev += str.charAt(len);
            len--;   
        }
        
        System.out.println(str +" <---> "+ strev);
    }
    
}
