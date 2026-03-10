package assignment2;

//2. Define a class named 
//
//Student having data member’s name, age, gender (m/f) and
//various overloaded constructors for accepting the details of student and display
//method to display information of student.

public class student_02 
{
    String name;
    int age;
    char gender;
        
    public student_02()
    {
            name = "default_name";
            age = 5;
            gender = 'f';
    }
    
    public student_02(String s,int i,char c)
    {
            name = s;
            age = i;
            gender = c;
            
    }
    
    public student_02(int i,char c,String n)
    {
            name = n;
            age = i;
            gender = c;
    }
    
    public void display()
    {
        System.out.println("\n----------------------------------");
        System.out.println("Name:\t\t\t" + name);
        System.out.println("Age:\t\t\t" + age);
        System.out.println("Gender:\t\t "+gender);
        System.out.println("----------------------------------");
    }
}
