
public class Loading
{
    public static void load(int seconds)
    {
        for(int i = 0; i < seconds; i++)
        {
            System.out.print("| ");
            wait(250);
            System.out.print("\f");
            
            System.out.print("/ ");
            wait(250);
            System.out.print("\f");
            
            System.out.print("- ");
            wait(250);
            System.out.print("\f");
            
            System.out.print("\\ ");
            wait(250);
            System.out.print("\f");
            
        }
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
