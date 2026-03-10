package assignment2;

//15. Create a superclass "Vehicle" with a method "startEngine." Create subclasses "Car"
//and "Motorcycle" that override the "startEngine" method to provide their own
//implementation. Demonstrate method overriding.

public class Vehical_15 
{
    public void startEngine()
    {
        System.out.println("Starting Engine .........");
    }
}
class Car extends Vehical_15
{
    @Override
    public void startEngine()
    {
        System.out.println("Car Starts when Ignitation is Operated");
    }
    
}
class Motorcycle extends Vehical_15
{
    @Override
    public void startEngine()
    {
        System.out.println("Motorcycle Starts when Key is Operated");
    }
}