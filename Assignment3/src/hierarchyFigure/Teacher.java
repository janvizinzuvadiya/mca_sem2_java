package hierarchyFigure;

public class Teacher extends Person {
    String Qualification;
    String Designation;
    
    public Teacher()
    {
        System.out.println("Teacher class Constructor");
    }
    
    public void setQualification(String q)
    {
        this.Qualification = q;
    }
    public void promote(String m)
    {
        this.Designation = m;
    }
    
    public void Display()
    {
        System.out.println("Teacher info:\n" + Qualification + "\nPromote to:" + Designation);
    }
}
