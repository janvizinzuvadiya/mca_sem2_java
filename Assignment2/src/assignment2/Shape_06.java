package assignment2;

//6. Create a Shape class as the abstract class with abstract method draw( ), its
//implementation is provided by the Rectangle & Circle classes. Create a reference of
//Shape class and if you create the instance of Rectangle class, draw() method of
//Rectangle class will be invoked. And same for Circle class. (Dynamic Method
//Dispatch)

public abstract class Shape_06 
{
    public abstract void draw();
    {
        System.out.println("Shape Parent Method");
    }   
}
class Rectangle extends Shape_06
{
    public void draw()
    {
        System.out.println("Draw Method of  Rectangle");
    }
}
class Circle extends Shape_06
{
    public void draw()
    {
        System.out.println("Draw Method of  Circle");
    }
}


