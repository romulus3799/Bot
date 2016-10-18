import java.util.Scanner;

public class FantasyNameGen
{
    private String firstInitial;
    private String lastInitial;
    
    private String firstName;
    private String lastName;
    
    public boolean again;
    
    Scanner sc = new Scanner(System.in);
    public FantasyNameGen()
    {
        firstInitial = "";
        lastInitial = "";
        
        firstName = "";
        lastName = "";
        
        again = true;
    }
    
    public void qLoop()
    {
        while(again)
        {
            getInitials();
            generateName();
            outputName();
            
            askAgain();
        }
   }
    
    public void getInitials()
    {
        System.out.print("\n\nInput your first name:\n>");
        firstInitial = sc.nextLine();
        
        System.out.print("\nInput your last name:\n>");
        lastInitial = sc.nextLine();
    }
    
    public void generateName()
    {
        switch(Character.toString(firstInitial.charAt(0)).toLowerCase())
        {
            case "a": firstName = "Corrupted";
                break;
            
            case "b": firstName = "Glass";
                break;
            
            case "c": firstName = " Ebony";
                break;
            
            case "d": firstName = "Orc";
                break;
            
            case "e": firstName = "Elf";
                break;
            
            case "f": firstName = "Dwarf";
                break;
            
            case "g": firstName = "Ogre";
                break;
            
            case "h": firstName = "Mermaid";
                break;
            
            case "i": firstName = "Troll";
                break;
            
            case "j": firstName = "Light";
                break;
            
            case "k": firstName = "Monster";
                break;
            
            case "l": firstName = "Death";
                break;
            
            case "m": firstName = "Dawn";
                break;
            
            case "n": firstName = "Emerald";
                break;
            
            case "o": firstName = "Watchful";
                break;
            
            case "p": firstName = "Soulless";
                break;
            
            case "q": firstName = "Dusk";
                break;
            
            case "r": firstName = "Dark";
                break;
            
            case "s": firstName = "Silent";
                break;
            
            case "t": firstName = "Druid";
                break;
            
            case "u": firstName = "Deadly";
                break;
            
            case "v": firstName = "Hulking";
                break;
            
            case "w": firstName = "Liquid";
                break;
            
            case "x": firstName = "Moon";
                break;
            
            case "y": firstName = "Doom";
                break;
            
            case "z": firstName = "Dragon";
                break;
            
            default : firstName = "Daft";
                break;
        }
        
        switch(Character.toString(lastInitial.charAt(0)).toLowerCase())
        {
            case "a": lastName = " Archer";
                break;
            
            case "b": lastName = " Crusher";
                break;
            
            case "c": lastName = " Dragon";
                break;
            
            case "d": lastName = " Marauder";
                break;
            
            case "e": lastName = " Protector";
                break;
            
            case "f": lastName = " Fighter";
                break;
            
            case "g": lastName = " Hunter";
                break;
            
            case "h": lastName = " Slayer";
                break;
            
            case "i": lastName = " Sentinel";
                break;
            
            case "j": lastName = " Serpent";
                break;
            
            case "k": lastName = " Apprentice";
                break;
            
            case "l": lastName = " Beast";
                break;
            
            case "m": lastName = " Master";
                break;
            
            case "n": lastName = " Warrior";
                break;
            
            case "o": lastName = " Rogue";
                break;
            
            case "p": lastName = " Shaman";
                break;
            
            case "q": lastName = " Paladin";
                break;
            
            case "r": lastName = " Priest";
                break;
            
            case "s": lastName = " Mage";
                break;
            
            case "t": lastName = " Guardian";
                break;
            
            case "u": lastName = " Whisperer";
                break;
            
            case "v": lastName = " Swordsman";
                break;
            
            case "w": lastName = " Firelord";
                break;
            
            case "x": lastName = " Moon";
                break;
            
            case "y": lastName = " Wanderer";
                break;
            
            case "z": lastName = " Zealot";
                break;
            
            default : lastName = " Imbecile";
                break;
        }
    }
    
    public void outputName()
    {
        System.out.println("\nYou are no longer "+ firstInitial + " " + lastInitial + ".\n" +
                            "Your new name is: " + firstName + lastName + ".");
    }
    
    public void askAgain()
    {
        int x = 0;
        String ans = "";
        
        while(x==0)
        {
            System.out.print("\n\nAgain? (type 'y' or 'n'):\n>");
            ans = sc.nextLine();
            
            if(ans.equalsIgnoreCase("y"))
            {
                again = true;
                x++;
            }
            else if(ans.equalsIgnoreCase("n"))
            {
                again = false;
                x++;
            }
            else
                System.out.println("That is not a valid answer!");
        }
    }
}
