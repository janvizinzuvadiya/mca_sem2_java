package hierarchyFigure;

public class PostGraduate extends Student
{
    String Branch;
    String Grade;
    
    public PostGraduate()
    {
        System.out.println("Post class Constructor");
    }
    public void Display()
    {
        System.out.println("PostGraduate info:\n" + Branch + "\n" + Grade);
    }
}
