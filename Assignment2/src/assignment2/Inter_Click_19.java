
package assignment2;



public class Inter_Click_19 {
    
}
class Button extends Inter_Click_19 implements Clickable
{
    public void click()
    {
        System.out.println("Button is Clicked");
    }
            
}
class Link extends Inter_Click_19 implements Clickable
{
    public void click()
    {
        System.out.println("Link is Clicked");
    }
            
}
