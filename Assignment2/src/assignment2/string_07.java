package assignment2;

//Write a program that finds the length of the string “Java Programming”. And also
//display a sub-string formed by the last five characters of the string. ( use String class)


public class string_07 
{   
        public String str = "Java Programming";
        
        public void getlength()
        {
            System.out.println("Length = "+str.length());
        }
        public void substr()
        {
            System.out.println(str.substring(11, str.length()));
        }
        
}
