package practice_defs;

public class split_array 
{
    int[] arr = {75,29,32,90,53,94,56,74};
    
    public void split()
    {
        int i=0,j=0;
        for(int val: arr)
        {
            if(val%2 == 0)
                i++;
            else
                j++;
        }
        
        int evenarr[]= new int[i];
        int oddarr[]= new int[j];
        
        int k=0,m=0;
        for(int val: arr)
        {
            if (val % 2 == 0)
                evenarr[k++] = val;
            else
                oddarr[m++] = val;
        }
        
        System.out.println("Even Values: ");
        for(int val: evenarr)
        {
            System.out.print(val+" ");
        }
        
        System.out.println("\nOdd Values: ");
        for(int val: oddarr)
        {
            System.out.print(val+" ");
        }
        
    }
    
}
