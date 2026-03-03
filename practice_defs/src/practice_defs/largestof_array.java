package practice_defs;

public class largestof_array 
{
    public void large()
    {
        int[] arr = {45,23,67,34,99,34};
        int max = arr[0];
        
        for (int val : arr)
        {
            max=(max<val)?val:max;
        }
        System.out.println("Maximum Element = "+max);
    }
    
}
