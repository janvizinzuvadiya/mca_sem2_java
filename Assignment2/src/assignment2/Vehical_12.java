package assignment2;

//12. Write a Java program to create a vehicle class hierarchy. The base class should be
//Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
//properties such as make, model, year, and fuel type. Implement methods for
//calculating fuel efficiency, distance traveled, and maximum speed.
    
public class Vehical_12 
{   
            String make;
            String model;
            int year;
            String fuelType;

            public Vehical_12(String make, String model, int year, String fuelType)
            {           
                this.make = make;
                this.model = model;
                this.year = year ;
                this.fuelType = fuelType;
            }

            public double calculatefuelefficiency(double distance, double fuelused)
            {
                return distance / fuelused;   
            }

            public double calculateDistance(double speed , double time)
            {
                return speed * time;
            }
}

class Truck extends Vehical_12
{
            Truck(String make, String model, int year, String fuelType) {
                super(make, model, year, fuelType);
            }

            int maxspeed()
            {
                return 120;
            }
    
}
class Car extends Vehical_12
{
        Car(String make, String model, int year, String fuelType) {
             super(make, model, year, fuelType);
         }
        int maxspeed()
         {
                return 180;
            }
    
}
class Motorcycle extends Vehical_12
{
            Motorcycle(String make, String model, int year, String fuelType) {
                super(make, model, year, fuelType);
            }
            int maxspeed()
            {
                return 200;
            }
}
