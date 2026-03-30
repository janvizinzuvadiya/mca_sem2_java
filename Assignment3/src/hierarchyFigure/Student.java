package hierarchyFigure;

public class Student extends Person {
    int roll_no;
    String Course;
    
    public Student()
    {
        System.out.println("Student class Constructor");
    }
    
    public void Display()
    {
        System.out.println("Student info:\n" + roll_no + "\n" + Course);
    }
}
