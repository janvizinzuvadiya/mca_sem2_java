package assignment3;

//2. Create a class Student with attributes roll no, name, age and course. Initialize values
//through parameterized constructor. If age of student is not in between 15 and 21 then
//generate user-defined exception “AgeNotWithinRangeException”. If name contains
//numbers or special symbols raise exception “NameNotValidException”. Define the two
//exception classes.

public class student_02 
{
    int rollno;
    String name;
    int age;
    String course;
    
    public student_02(int rollno,String name,int age,String course)      
    {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
            this.course = course;
            
    }
    public void checkAge() throws Exception
    { 
        if( this.age <15  || this.age >21)
        {
            throw new AgeisNotinRangeException("Age is not Between 15 to 21");
        }
    }
    public void checkName() throws Exception
    {
        if(this.name.matches(".*[^a-zA-z ].*"))
        {
            throw new NameNotValidException("Name can not Contain Special Characters or Numbers");
        }
    }
}
