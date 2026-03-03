package practice_defs;


public class jagged_array 
{

    int [][] jag =
    {
        {1},
        {1,2},
        {1,2,3},
        {1,2,3,4},
        {1,2,3,4,5}
    };
            
    public void show()
    {
        for(int[] val:jag)
        {
            for(int a:val)
            {
                System.out.print(a+" ");
            }
            System.out.print("\n");
        }    
    }
    
}
