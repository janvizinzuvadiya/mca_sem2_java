package assignment2;

//11. Define class Human with first name and last name. Define new class Student which is
//derived from Human and has new field – grade. Define class Worker derived from
//Human with new field weekSalary and work-hours per day and method
//MoneyPerHour() that returns money earned by hour by the worker. Define the proper
//constructors and properties for this hierarchy. Create object and demonstrate.

public class Human_11 {
    
    String firstName;
    String lastName;
    
    public Human_11(String a,String b)
    {
        firstName = a;
        lastName = b;      
    }
    
}
class Student extends Human_11 
{
    char grade ;
    public Student (String a,String b,char g)
    {
        super(a,b);
        grade = g;
    }
        
    void Display()
    {
        System.out.println("First Name : "+ firstName);
        System.out.println("Last Name : "+ lastName);
        System.out.println("Grade : "+ grade);
    }
}
class Worker extends Human_11
{
    double weekSalary;
    int workHours;
    
    public Worker(String a,String b,double sal,int hour)
    {
        super(a,b);
        weekSalary = sal;
        workHours = hour;
    }
    
    double MoneyPerHour()
    {
        return (weekSalary/workHours);
    }
}


