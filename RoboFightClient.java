import java.util.Scanner;
public class RoboFightClient
{
    public static void header()
    {
        System.out.println("You have just chosen (or been forced) to play...");

        System.out.println("\n<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>");
        System.out.println(" ___      _____      ___        _____        _____   _____     _____                  _______");
        System.out.println("|    \\   /     \\    |    \\     /     \\       |         |      /           |      |       |   ");
        System.out.println("|__  /   |     |    |___ /     |     |       |___      |      |  ___      |______|       |");
        System.out.println("|   \\    |     |    |    \\     |     |       |         |      |     \\     |      |       |");
        System.out.println("|    \\   \\__ __/    |___ /     \\__ __/       |       __|__    \\_____/     |      |       |");
        System.out.println("\n<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>");
        
        System.out.println("Version 1.2.8");
        System.out.println("\nCreated by: Romulus3799");
        System.out.println("\nSpecial Thanks To:");
        System.out.println("\t--aspi\n\t--Mom aka TocDoc\n\t--Xx_TH3-W3ND1G0_xX\n\t--high heat\n\t--Zubin");
        System.out.println("\n");
        
        pause();
    }
    
    public static void pause()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("<press ENTER to continue>");
        in.nextLine();
    }
    
    public static void main()
    {
        header();
        
        RoboFight fight = new RoboFight();
        
        fight.playGame();
    }
}
