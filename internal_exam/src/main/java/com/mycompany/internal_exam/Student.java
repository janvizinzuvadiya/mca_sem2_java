package com.mycompany.internal_exam;

public class Student 
{
    int rollno;
    String name;
    int age;
    String course;
    
    public Student(int rollno,String name,int age,String course)
    {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
        this.course = course;
    }
    
    public void checkAge() throws Exception
    {
        if(!(age>15 && age<21))
        {
            throw new AgeNotWithinRangeException("Age is not between 15 - 21");
        }
    }
    
    public void checkName() throws Exception
    {
//        if(name.matches(".*[^a-zA-Z ].*"))
        
        if(!name.matches("[a-zA-Z ]+"))
        {
            throw new NameNotValidException("Name can not contain any special character or numbers");
        }
    }

}
