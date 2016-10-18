import java.util.Random;
import java.util.Scanner;
public class DiceRoll
{
    public static void main()
    {
        int dice = 0;
        Random r = new Random();
        String response = "y";
        boolean again = true;
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("WELCOME TO DICEROLL -by Romil Havewala");
        System.out.println("In case you didn't figure it out, this program rolls dice for you.");
        
        int i = 0;
        String ans = "";
        
        while(i==0)
        {
            System.out.print("\nInput 'y' to roll:\n>");
            ans = sc.nextLine();
            
            if(ans.equalsIgnoreCase("y"))
            {
                again = true;
                i++;
            }
            else if(ans.equalsIgnoreCase("n"))
            {
                again = false;
                i++;
            }
            else
                System.out.println("That is not a valid answer!");
        }
        
        while(again)
        {
            dice = 1+r.nextInt(6);
            
            System.out.println("\n---------");
            switch(dice)
            {
                case 1: System.out.println("|       |"); 
                        System.out.println("|   o   |");
                        System.out.println("|       |");
                    break;
                case 2: System.out.println("|      o|"); 
                        System.out.println("|       |");
                        System.out.println("|o      |");
                    break;
                case 3: System.out.println("|      o|"); 
                        System.out.println("|   o   |");
                        System.out.println("|o      |");
                    break;
                case 4: System.out.println("|o     o|"); 
                        System.out.println("|       |");
                        System.out.println("|o     o|");
                    break;
                case 5: System.out.println("|o     o|"); 
                        System.out.println("|   o   |");
                        System.out.println("|o     o|");
                    break;
                case 6: System.out.println("|o     o|"); 
                        System.out.println("|o     o|");
                        System.out.println("|o     o|");
                    break;
            }
            System.out.println("---------");
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\nRoll again? ('y' or 'n'): ");
                response = sc.next();
                if(response.equalsIgnoreCase("y"))
                {
                    again = true;
                    x++;
                }
                else if(response.equalsIgnoreCase("n"))
                {
                    again = false;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            }
           }
           
        System.out.println("\nDone.");
        
    }
}
