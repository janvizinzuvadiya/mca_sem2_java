package assignment2;

//13. Create a superclass "Animal" with properties like name and age. Create a subclass
//"Dog" that inherits from "Animal" and adds a breed property. Demonstrate the use of
//the superclass and subclass.

public class Animal_13 
{
    String name;
    int age;

    public Animal_13(String name,int age) 
    {
        this.name = name;
        this.age = age;
    }
   
    
}
class Dog extends Animal_13
{
    String breed ;
    
    public Dog(String name,int age, String breed)
    {
        super(name,age);
        this.breed = breed;
    }
    
    public void sound()
    {
        System.out.println("\nWoof!..... Woof!.....");
    }
    
}
