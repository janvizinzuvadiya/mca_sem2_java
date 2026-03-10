package assignment2;

//10. Declare a class called Author having author_name as private data member. Extend
//author class to have two sub classes called Book_Publication & Paper_Publication.
//Each of these classes have private member called title. Show usage of dynamic
//method dispatch (dynamic polymorphism) to display book or paper publications of a
//given author.

public class Author_10 
{
    private String author_name ="J.K rowling";
    
        void display()
        {
            System.out.println("Author name = "+ author_name);
        }
    
}
class book_publication extends Author_10
{
    private String title = "Harry Potter";  
    
     void display()
        {
            System.out.println("Book Publication = "+ title);
        }
}
class Paper_publication extends Author_10
{
    private String title = "Part 1 - 8";
    
     void display()
        { 
            System.out.println("Paper Publicaiton = "+ title);
        }
}
