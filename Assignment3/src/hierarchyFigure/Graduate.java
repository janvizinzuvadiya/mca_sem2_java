package hierarchyFigure;

public class Graduate extends Student
{
        String Branch;
        
        public Graduate()
        {
            System.out.println("Graduate class Constructor");
        }
        public void Display()
        {
            System.out.println("Graduate info:\n" + Branch);
        }
}
