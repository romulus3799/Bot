
public class NimTester
{
    /*
    public static void header()
    {
        System.out.println("Romil Havewala");
         System.out.println("Lab");
         System.out.println("The Game of Nim\n\n");
    }
    */
   
    public static void title()
    {
        System.out.println("\t\tWelcome to...");
        System.out.println("\t\tTHE GAME OF NIM!");
        System.out.println("_______________________________________________________");
        System.out.println("Begin!\n");
    }
        
    public static void main()
    {
        //header();
        title();
        
        Nim game = new Nim();

        game.getInputs();
        game.playGame();
    }
}

