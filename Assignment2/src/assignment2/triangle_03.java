package assignment2;

//3. Write a Java program which creates the Triangle class with two attributes base and
//height of type float or double. Takes the two constructors of the Triangle class.
//First constructor takes the default value for base and height and Second Constructor
//takes base and height as a parameter. Create a method calcArea() to calculate the
//area of the Triangle. Define a main method and create objects to the class and print
//the area of the Triangle.


public class triangle_03 
{
    double base;
    double height;
    
        public triangle_03()
        {
                base = 22.2;
                height = 40.2;
        }
        public triangle_03(double a, double b)
        {
                base = a;
                height = b; 
       }
        
        public void calculateArea()
        {
            double area = ( 0.5) * base  * height;
            System.out.println("Area of Triangle = " + area);
        }
}
