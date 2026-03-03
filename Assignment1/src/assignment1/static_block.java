package assignment1;

public class static_block {

    static
    {
        System.out.println("This is Static block it is created at the beginning of the program and "
                            + "\neven before constructors");
    }
    
    public static_block()
    {
        System.out.print("Running... constructor from the static block's class");
    }   
    
}
