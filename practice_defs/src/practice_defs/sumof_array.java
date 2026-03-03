package practice_defs;


public class sumof_array 
{
    public void sum()
    {
        int[] arr= {1,2,3,4,5};
        
        int sum=0;
        for (int ar : arr)
        {
            sum+= ar;
        }
        
        System.out.println("Sum of Array Elements= "+sum);
    }
    
}
