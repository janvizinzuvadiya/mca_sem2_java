package assignment2;

//Write a program to do the following using in-built methods in the string class of java.
//a. Find the 3rd character in the string "Atmiya University"
//b. Find the index of character ‘o’ in string "Java Programming".
//c. Convert the string "Enjoy Holiday" to uppercase.
//d. Replace character 'H' with 'n' in the string "Hello… Hi..”.

public class string_methods_09 
{
    public String str;
    
    public void display()
    {
        str = "Atmiya University";
        System.out.println(str.charAt(2));
        
        str = "Java Programming";
        System.out.println(str.indexOf("o"));
        
        str = "Enjoy Holiday";
        System.out.println(str.toUpperCase());
        
        str = "Hello... Hi";
        System.out.println(str.replace('H', 'n'));
    }
    
}
