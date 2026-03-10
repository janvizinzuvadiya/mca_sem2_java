package assignment2;

//17. Create a class "Person" with an instance variable "name." Create a subclass
//"Employee" with its instance variable "employeeId." Use the "super" keyword to
//access the "name" variable from the "Person" class within the "Employee"
//constructor.

public class Person_17 
{
    String name;
    
    
}
class Employee extends Person_17
{
    int employeeid;
    public Employee (String name,int id)
    {
        super.name = name;
        employeeid = id;
    }
    public void Display()
    {
        System.out.println("Person Name:"+super.name);
        System.out.println("Employee Id:"+employeeid);
    }
}
