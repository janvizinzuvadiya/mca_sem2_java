package practice_defs;
import java.util.Scanner;

public class numto_words 
{
    
    Scanner sc;
    public numto_words()
    {
        sc= new Scanner(System.in);
    }
    
    public void words()
    {
        System.out.print("\nEnter Number->");
        int num=sc.nextInt();
        String no="";
            int temp = num;
            int rev=0;
     
            while(temp!=0)
            {
                int rem=temp%10;
                rev*=10;
                rev+=rem;
                temp=(int)temp/10;
            }
            
             while(rev!=0)
            {
                int rem=rev%10;
                switch(rem)
                {
                    case 1:
                        no+="one";
                        break;
                    case 2:
                        no+="two";
                        break;
                    case 3:
                        no+="three";
                        break;
                    case 4:
                        no+="four";
                        break;
                    case 5:
                        no+="five";
                        break;
                    case 6:
                        no+="six";
                        break;
                    case 7:
                        no+="seven";
                        break;
                    case 8:
                        no+="eight";
                        break;
                    case 9:
                        no+="nine";
                        break;
                    case 0:
                        no+="zero";
                        break;
                    default:
                        System.out.print("---");                            
                }
                rev=(int)rev/10;
                no+=" ";
            }
             
             System.out.println("number = "+no);
        
    }
    
}
