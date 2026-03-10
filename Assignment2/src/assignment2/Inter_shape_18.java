package assignment2;

public class Inter_shape_18 
{
      
}
class Circle extends Inter_shape_18 implements Shape 
{
    int r;
        public Circle(int r)
        {
            this.r = r;
        }

    @Override
    public void calculateArea() {
        System.out.println((3.14) * r * r );
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * (3.14) * r );
    }
}
class Rectangle extends Inter_shape_18 implements Shape
{
        int l,b;
        public Rectangle(int l,int b)
        {
            this.l = l;
            this.b = b;
        }

    @Override
    public void calculateArea() {
        System.out.println(l * b);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2 * (l+b));
    }
}
