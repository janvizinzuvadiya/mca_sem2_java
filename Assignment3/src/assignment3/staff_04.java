package assignment3;

//Define an abstract class “Staff” with members name and address. Define two subclasses
//of this class – “FullTimeStaff” (department, salary) and “PartTimeStaff”
//(number_of_hours, rate_per_hour). Define appropriate constructors. Create objects which
//could be of either FullTimeStaff or PartTimeStaff class by asking the user’s choice.
//Display details of all “FullTimeStaff” objects and all “PartTimeStaff” objects.

abstract public class staff_04 
{
    String name;
    String address;  
    
    public staff_04(String name,String address)
    {
        this.name = name;
        this.address = address;
    }
    
}
class FullTimeStaff extends staff_04
{
    String department;
    Double salary;
    
    public FullTimeStaff(String name,String address,String department,double salary)
    {
        super (name,address);
        this.department = department;
        this.salary = salary;
    }
    
    public void Display()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name:"+ name);
        System.out.println("Address:"+address);
        System.out.println("Department: \t"+this.department);
        System.out.println("Salary: \t"+this.salary);
    }
}

class PartTimeStaff extends staff_04
{
    int number_of_hours;
    double rate_per_hour;
    
    public PartTimeStaff (String name,String address,int hours,double rate)
    {
        super (name,address);
        this.number_of_hours = hours;
        this.rate_per_hour = rate;
    }
     public void Display()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name:"+ name);
        System.out.println("Address:"+address);
        System.out.println("Shift Hours: \t"+this.number_of_hours);
        System.out.println("Total rate Per Day: \t"+ (number_of_hours*rate_per_hour));
    }
    
}

    