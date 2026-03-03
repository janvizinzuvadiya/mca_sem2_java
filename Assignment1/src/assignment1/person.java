package assignment1;

public class person 
{
    String name;
    int age;
    
//    public person()
//    {
//       this.name = "aaa";
//       this.age = 33;
//    }
    public person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void display_data()
    {           
        System.out.println("\n Name: "+this.name);
        System.out.println(" Age: "+this.age);  
    }
                                   
}
