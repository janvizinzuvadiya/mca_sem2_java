package assignment1;

public class calculator 
{
    int num1;
    int num2;
    
    public calculator(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void Addition()
    {
        System.out.println("\nAddtion = "+(num1+num2));
    }
    public void Subtraction()
    {
        System.out.println("Subtraction = "+(num1-num2));
    }
    public void Multiplication()
    {
        System.out.println("Multiplication = "+(num1*num2));
    }
    public void Division()
    {
        System.out.println("Division = "+(num1/num2));
    }
        
}
