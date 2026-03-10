package assignment2;

//16. Create a class "MathUtils" with a final method that calculates the square of a number.
//Try to extend this class and override the final method, and explain the error that
//occurs.

public class Math_Utils_16 
{
    public final int calculateSquare(int num)
    {
        return num * num;
    }
    
}
class subclass extends Math_Utils_16
{
//    @Override
//    public int calculateSquare(int num)
//    {
//        System.out.println(0);
//        return num * num;
//    }
    
//    Exception in thread "main" java.lang.IncompatibleClassChangeError:
//    class assignment2.subclass overrides final method assignment2.Math_Utils_16.calculateSquare(I)I
}
