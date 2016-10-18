import java.util.Scanner;
import java.util.Random;
public class Fortune
{
    Scanner sc = new Scanner(System.in);
    Random rngesus = new Random();
    
    public void execute()
    {
        System.out.println("You will "
                            + action() + " " + dirObj() + " "
                            + place() + ".");
    }
    
    public String action()
    {
        switch(1+rngesus.nextInt(8))
        {
            case 1: return "murder";
                 
            
            case 2: return "eat";
                 
            
            case 3: return "high-five";
                 
            
            case 4: return "give birth to";
                 
            
            case 5: return "destroy";
                 
            
            case 6: return "one-on-one fight";
                 
            
            case 7: return "create, by hand,";
                 
            
            case 8: return "turn into";
                 
            
            default: return "eat";
        }
    }
    
    public String dirObj()
    {
        switch(1+rngesus.nextInt(8))
        {
            case 1: return "a baby";
                 
            
            case 2: return "a sandwich";
                 
            
            case 3: return "a grizzly bear";
                 
            
            case 4: return "your mother";
                 
            
            case 5: return "a demon";
                 
            
            case 6: return "Romil";
                 
            
            case 7: return "yourself";
                 
            
            case 8: return "someone who loves you";
                 
            
            default: return "a baby";
        }
    }
    
    public String place()
    {
        switch(1+rngesus.nextInt(8))
        {
            case 1: return "violently";
                 
            
            case 2: return "in Hell";
                 
            
            case 3: return "at a bar";
                 
            
            case 4: return "for justice";
                 
            
            case 5: return "because you feel like it";
                 
            
            case 6: return "out of love for your country";
                 
            
            case 7: return "inside the Matrix";
                 
            
            case 8: return "in space";
                 
            
            default: return "in Hell";
        }
    }
}
