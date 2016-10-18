import java.util.Scanner;
public class BaseChanger extends Again
{
    public BaseChanger()
    {
        super("Again?","y","n");
    }
    
    public void change()
    {
        Scanner sc = new Scanner(System.in);
        String output = "";
        boolean error = false;
        boolean error2 = false;
        while(again)
        {
            System.out.print("\nEnter an integer:\n>");
            String input = sc.nextLine();
            
            System.out.print("\n\nWhat base is this number?:\n>");
            int baseIn = 10;
            String errorBaseIn = "";
            try 
            {
                errorBaseIn = sc.nextLine();
                    baseIn = Integer.parseInt(errorBaseIn);
                
                output = Integer.toString(Integer.parseInt
                                            (input, baseIn));
            }
            catch (java.lang.NumberFormatException e)
            {
                System.out.println("Invalid input: " + input 
                                    + "(" + errorBaseIn + ") does not exist!\n");
                                    
                error = true;
            }
            
            if(!error)
            {
                System.out.print("\n\nEnter the integer's new base:\n>");
                int baseOut = 10;
                String errorBaseOut = "";
                try 
                {
                    errorBaseOut = sc.nextLine();
                    baseOut = Integer.parseInt(errorBaseOut);
                }
                catch (java.lang.NumberFormatException e)
                {
                    System.out.println("Invalid input: " + errorBaseOut 
                                        + " is not a valid base!\n");
                                        
                    error2 = true;
                }
                
                if(!error2)
                {
                    output = Integer.toString(Integer.parseInt
                                                    (input, baseIn),baseOut);
                                                    
                    System.out.println("\n" + input + "(" + baseIn + ") = "
                                        + output + "(" + baseOut + ")\n\n");
                }
                else
                    System.out.println("");
                    
                check();
                System.out.println("\n\n\n");
                error = false;
                error2 = false;
            }
            else
            {
                check();
                System.out.println("\n\n\n");
                error = false;
                error2 = false;
            }
        }
    }
}
