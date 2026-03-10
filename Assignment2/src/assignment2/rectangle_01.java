package assignment2;

//1. Create a class Rectangle 
//
//having instance variable length and width of type double.
//Write a method to calculate area of rectangle. Set the value of length and width using
//setValue( ) method. Define area method to calculate area. Create an object of the
//class and display the area.


public class rectangle_01 
{
        double len;
        double wid;
        
            public void setValue(double a, double b)
            {
                this.len = a;
                this.wid = b;
            }
            
            public double calculateArea()
            {
                double area = len * wid;
                return area;
            }
    
}
