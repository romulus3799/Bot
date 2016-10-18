
public class Wait
{
    public static void main()
    {
        System.out.println("Hello");
        wait(1);
        System.out.println("Hello");
        wait(1);
        System.out.println("Hello");
        wait(1);
    }
    
    public static void wait(int seconds)
    {
        try 
        {
            Thread.sleep(seconds);
        } 
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
