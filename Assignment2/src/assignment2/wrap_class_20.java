package assignment2;

//20. Create a Java program that uses wrapper classes to convert primitive data types to
//objects and vice versa. Perform operations like auto-unboxing and auto-boxing.

public class wrap_class_20 {

    public void conversion()
    {
        int primitiveInt = 100;
        Integer objectInt = primitiveInt; 

        double primitiveDouble = 45.67;
        Double objectDouble = primitiveDouble;

        System.out.println("Autoboxing Successful:");
        System.out.println("Integer Object: " + objectInt);
        System.out.println("Double Object: " + objectDouble);

   
        Integer scoreObject = 95; 
        int scorePrimitive = scoreObject; 

        System.out.println("\nUnboxing Successful:");
        System.out.println("Primitive int: " + scorePrimitive);

     
        Integer num1 = 10;
        Integer num2 = 20;
        Integer result = num1 + num2; 

        System.out.println("\nOperation Result (Integer + Integer): " + result);
    }
}
