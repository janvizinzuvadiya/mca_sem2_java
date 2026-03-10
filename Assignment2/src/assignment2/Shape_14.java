package assignment2;

//14. Create an abstract class "Shape" with an abstract method for calculating area. Create
//concrete subclasses like "Circle" and "Rectangle" that extend "Shape" and implement
//the area calculation. Demonstrate how to use these classes.

public abstract class Shape_14 
{
    abstract double calculateArea();
}
class Circle extends Shape_14
{
        double r;
        
        public Circle (double r)
        {
            this.r = r;
        }

        @Override
        double calculateArea() 
        {
          return (3.14) * r * r;
        }
}
class Rectangle extends Shape_14
{
        double l,b;
        
        public Rectangle (double l,double b)
        {
            this.l = l;
            this.b = b;
        }

        @Override
        double calculateArea() 
        {
          return l * b;
        }
}

