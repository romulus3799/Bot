import java.util.Random;
import java.util.Scanner;

public class RPS
{
    private int cpuNameNum;
    private String cpuName;
    
    private String pName;
    
    private int cpuChoiceInt;
    private String cpuChoiceStr;
    
    private int pChoiceInt;
    private String pChoice;
    
    private boolean again;
    
    private int cpuScore;
    private int pScore;
    
    private String response;
    
    Random rngesus = new Random();
    Scanner sc = new Scanner(System.in);
    public RPS()
    {
        cpuNameNum = 0;
        cpuName = "";
        
        pName = "";
        cpuChoiceInt = 0;
        cpuChoiceStr = "";
        
        pChoiceInt = 0;
        pChoice = "";
        
        again = true;
        
        cpuScore = 0;
        pScore = 0;
        
        response = "";
    }
    
    public String getName()
    {
        System.out.print("\nInput name:\n>");
        pName = sc.nextLine();
        return pName;
    }
        
    public String getCpuName()
    {
        cpuNameNum = 1+rngesus.nextInt(14);
        
        switch(cpuNameNum)
        {   
            case 1: cpuName = "Ultron";
                    break;
                    
            case 2: cpuName = "HAL 9000";
                    break;
                    
            case 3: cpuName = "AVA 2.0";
                    break;
                    
            case 4: cpuName = "Claptrap";
                    break;
                    
            case 5: cpuName = "GladOS";
                    break;
                    
            case 6: cpuName = "WALL-E";
                    break;
                    
            case 7: cpuName = "HK-47";
                    break;
                    
            case 8: cpuName = "Skynet";
                    break;
                    
            case 9: cpuName = "Cortana";
                    break;
                    
            case 10: cpuName = "R2D2";
                    break;
                    
            case 11: cpuName = "AM";
                    break;
                    
            case 12: cpuName = "Deep Blue";
                    break;
                    
            case 13: cpuName = "TARS";
                    break;
                    
            case 14: cpuName = "Baymax";
                    break;
                    
            default: cpuName = "CPU";
        }
        
        return cpuName;
    }
        
    public void getInputs()
    {
        getName();
        getCpuName();   
    }
    
    public void play()
    {
        getInputs();
        int i = 0;
        while(again)
        {
            compare();
            
            /*
            i = 0;
            while(i == 0)
            {
                System.out.print("\nAgain? (input 'y' or 'n')\n>");
                response = sc.nextLine();
                if(response.equalsIgnoreCase("y"))
                {
                    i++;
                }
                else if(response.equalsIgnoreCase("n"))
                {
                    again = false;
                    break;
                }
                else
                {
                    System.out.print("\nThat is not a valid response!\n>");
                    
                }
            }
            */
        }
        
        printFinalScore();
    }
    
    public int pChoose()
    {
        int x = 0;
        wait(1000);
        while(x == 0)
        {
            System.out.print("\nEnter choice: rock, paper, or scissors? (type 'done' to finish)\n>");
            pChoice = sc.nextLine();
            
            if(pChoice.equalsIgnoreCase("rock") || pChoice.equalsIgnoreCase("r"))
            {
                pChoice = "rock";
                pChoiceInt = 1;
                x++;
            }
            else if( pChoice.equalsIgnoreCase("paper") || pChoice.equalsIgnoreCase("p"))
            {
                pChoice = "paper";
                pChoiceInt = 2;
                x++;
            }
            else if(pChoice.equalsIgnoreCase("scissors") || pChoice.equalsIgnoreCase("s"))
            {
                pChoice = "scissors";
                pChoiceInt = 3;
                x++;
            }
            else if(pChoice.equalsIgnoreCase("done"))
            {
                again = false;
                pChoiceInt = -1;
                break;
            }
            else
            {
                System.out.println("\nThat is not a valid choice!\n");
                
            }
        }
        
        return pChoiceInt;
    }
    
    public int cpuChoose()
    {
        cpuChoiceInt = 1+rngesus.nextInt(3);
        
        switch(cpuChoiceInt)
        {
            case 1: cpuChoiceStr = "rock";
                break;
                
            case 2: cpuChoiceStr = "paper";
                break;
                
            case 3: cpuChoiceStr = "scissors";
                break;
            
            default: cpuChoiceStr = "gun";
                break;
        }
        wait(1000);
        System.out.println(cpuName + " chooses " + cpuChoiceStr + ".");
        return cpuChoiceInt;
    }
    
    public void compare()
    {
        pChoose();
        while(again == false)
            break;
        cpuChoose();
        wait(1000);
        if(pChoiceInt == 1 && cpuChoiceInt == 2)
        {
            cpuScore++; 
            System.out.println("\n" + cpuName + " wins! (" + cpuChoiceStr + " covers " + pChoice + ")\n");
        }
        else if(pChoiceInt == 1 && cpuChoiceInt == 3)
        {
            pScore++;
            System.out.println("\n" + pName + " wins! (" + pChoice + " crushes " + cpuChoiceStr + ")\n");
        }
        else if(pChoiceInt == 2 && cpuChoiceInt == 1)
        {
            pScore++;
            System.out.println("\n" + pName + " wins! (" + pChoice + " covers " + cpuChoiceStr + ")\n");
        }
        else if(pChoiceInt == 2 && cpuChoiceInt == 3)
        {
            pScore++;
            System.out.println("\n" + pName + " wins! (" + pChoice + " cut " + cpuChoiceStr + ")\n");
        }
        else if(pChoiceInt == 3 && cpuChoiceInt == 1)
        {
            cpuScore++;
            System.out.println("\n" + cpuName + " wins! (" + cpuChoiceStr + " crushes " + pChoice + ")\n");
        }
        else if(pChoiceInt == 3 && cpuChoiceInt == 2)
        {
            cpuScore++;
            System.out.println("\n" + cpuName + " wins! (" + cpuChoiceStr + " cut " + pChoice + ")\n");
        }
        else if(pChoiceInt == -1)
            System.out.println("\nGame Over!\n");
        else
            System.out.println("\nTie! No one wins!\n");
    }
    
    public void printFinalScore()
    {
        wait(1000);
        System.out.println("__________________________________________________________");
        if(pScore > cpuScore)
            System.out.println("The overall winner is " + pName + " with a total score of " + pScore + " - " + cpuScore + "!");
        else if(pScore < cpuScore)
            System.out.println("The overall winner is " + cpuName + " with a total score of " + cpuScore + " - " + pScore + "!");
        else
            System.out.println("There is a tie with a total score of " + cpuScore + " - " + pScore + "!");
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
