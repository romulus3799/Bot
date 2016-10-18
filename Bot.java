
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Bot
{
    private String cmd;
    private boolean on;
    private boolean valid;
    
    Scanner sc = new Scanner(System.in);
    Random rng = new Random();
    
    DiceRoll dice = new DiceRoll();
    Adventure2 adventure = new Adventure2();
    NimTester nim = new NimTester();
    FantasyNameGenTester gen = new FantasyNameGenTester(); 
    RPSTester rps = new RPSTester();
    RoboFightClient robo = new RoboFightClient();
    Fortune fortune = new Fortune();
    BaseChangerClient bc = new BaseChangerClient();
    PatternMaker p = new PatternMaker();
    PatternMakerVSloan pvs = new PatternMakerVSloan();
    public Bot()
    {
        cmd = "";
        on = true;
        valid = false;
    }
    
    public void help()
    {
        System.out.println("alphabetize");
        System.out.println("\tEnter any number of items that you wish to aplhabetize,\n\tand let the program do the work for you!\n");
        wait(250);
        
        System.out.println("adventure");
        System.out.println("\tEnter specific information and read a MadLibs-type adventure\n\tbased on the information you entered!\n");
        wait(250);
        
        System.out.println("askrommel");
        System.out.println("\tAsk a yes-or-no question to Rommel, the all-knowing program.\n");
        wait(250);
        
        System.out.println("basechange");
        System.out.println("\tEnter a number of any base and convert it to any another base.\n");
        wait(250);
        
        System.out.println("chance");
        System.out.println("\tInput an event to learn the percejt chance of it happening.\n");
        wait(250);
        
        System.out.println("coinflip");
        System.out.println("\tFlip a coin. It's pretty self-explanatory.\n");
        wait(250);
        
        System.out.println("diceroll");
        System.out.println("\tRoll a die. It's pretty self-explanatory.\n");
        wait(250);
        
        System.out.println("fight");
        System.out.println("\tInput two combatants and let the program determine who wins!\n");
        wait(250);
        
        System.out.println("fortune");
        System.out.println("\tTell your own fortune!\n");
        wait(250);
        
        System.out.println("help");
        System.out.println("\tInput this command to bring up this list again.\n");
        wait(250);
        
        System.out.println("namegen");
        System.out.println("\tInput your full name to generate a fantasy-themed name for yourself.\n");
        wait(250);
        
        System.out.println("nim");
        System.out.println("\tPlay the game of Nim, a game about taking marbles from a pile.\n\tIt was a challenge to code, I promise.\n");
        wait(250);
        
        System.out.println("off");
        System.out.println("\tInput this command to turn off the bot program when you're done with it.\n");
        wait(250);
        
        System.out.println("pattern");
        System.out.println("\tCreate a randomly generated pattern made out of ASCII characters.\n");
        wait(250);
        
        System.out.println("patternvs");
        System.out.println("\tCreate a randomly generated pattern made out of...different ASCII characters.\n");
        wait(250);
        
        System.out.println("off");
        System.out.println("\tInput this command to turn off the bot program when you're done with it.\n");
        wait(250);
        
        System.out.println("rng");
        System.out.println("\tInput a minimum value and a maximum value, and let the program generate\n\ta random number that fits those parameters.\n");
        wait(250);
        
        System.out.println("robofight");
        System.out.println("\tPlay RoboFight, a Java fighting game made by me!\n");
        wait(250);
        
        System.out.println("rps");
        System.out.println("\tPlay the classic game of Rock, Paper, Scissors!\n");
        wait(250);
        
    }
    
    public void header()
    {
        System.out.println("<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
        System.out.println("[[[[[[[[[[[[[[[[ WELCOME TO BOT 1.2.1 ]]]]]]]]]]]]]]]]");
        System.out.println("[[[[[[[[[[[[[[[[ by: Romil Havewala   ]]]]]]]]]]]]]]]]");
        System.out.println("<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>");
        
        System.out.println("\nInstructions: input a command to the prompt and press 'enter';\nthe command will execute.");
        System.out.println("Input the command 'help' for a list of all possible commands\nand their descriptions (as of now).\n\n");
    }
    
    public void cmdLoop()
    {
        header();
        
        while(on)
        {
            System.out.print("\n\nBot -- please input command:\n>");
            cmd = sc.nextLine();
            switch(cmd)
            {
                case "adventure": adventure.main();
                    break;
                    
                case "alphabetize": alphabetize();
                    break;
                    
                case "askrommel": askrommel();
                    break;
                    
                case "basechange": bc.main();
                    break;
                    
                case "chance": chance();
                    break;
                    
                case "coinflip": coinflip();
                    break;
                    
                case "diceroll": dice.main();
                    break;
                    
                case "fight": fight();
                    break;
                    
                case "fortune": fortune.execute();
                    break;
                    
                case "help": help();
                    break;
                    
                case "namegen": gen.main();
                    break;
                    
                case "nim": nim.main();
                    break;
                    
                case "off": off();
                    break;
                    
                case "pattern": p.main();
                    break;
                    
                case "patternvs": pvs.main();
                    break;
                    
                case "rng": rng();
                    break;
                    
                case "robofight": robo.main();
                    break;
                    
                case "rps": rps.main();
                    break;
                    
                default: System.out.println("That is not a valid command!");
                    break;
            }
        }
        
        System.out.println("Bot -- Alright then. Goodbye! :)");
        System.exit(0);
    }
    
    public void fight()
    {
        System.out.print("\nInput first combatant:\n>");
        String name1 = sc.nextLine();
        
        System.out.print("\nInput second combatant:\n>");
        String name2 = sc.nextLine();
        
        int score1 = rng.nextInt(5001);
        int score2 = rng.nextInt(5001);
        if(score1 > score2)
            System.out.println("\n" + name1 + " beat " + name2 + " "
                                + score1 + " to " + score2 + "!");
        else if(score1 < score2)
            System.out.println("\n" + name2 + " beat " + name1 + " "
                                + score2 + " to " + score1 + "!");
        else if (score1 == score2)
            System.out.println("\n" + name1 + " tied " + name2 + " "
                                + score1 + " to " + score2 + "!");
    }
    
    public void chance()
    {
        System.out.print("\n\nInput event:\n>");
        String event = sc.nextLine();
        int chance = rng.nextInt(101);
        System.out.println("\nThere is a " + chance + "% chance that " + event);
    }
    
    
    public void askrommel()
    {
        System.out.print("\nWhat is your question, my child? (it must be yes or no)\n>");
        String question = sc.nextLine();
        System.out.println();
        int ansInt = 1+rng.nextInt(10);
        
        String ans = "";
        switch(ansInt)
        {
            case 1: ans = "Definitely.";
                break;
                
            case 2: ans = "Nothing has ever been more certain than my answer: no.";
                break;
                
            case 3: ans = "Eh, depends.";
                break;
                
            case 4: ans = "YES.";
                break;
                
            case 5: ans = "Not a chance in hell.";
                break;
                
            case 6: ans = "Probably, but there's a chance I could be wrong.";
                break;
                
            case 7: ans = "Yep.";
                break;
                
            case 8: ans = "Nope.";
                break;
                
            case 9: ans = "Of course...not.";
                break;
                
            case 10: ans = "Of course!";
                break;
                
            default: ans = "It's looking foggy. Try again later.";           
        }
        
        System.out.println(ans);
    }
    
    public void coinflip()
    {
        int side = rng.nextInt(2);
        if(side == 0)
            System.out.println("Heads.");
        else
            System.out.println("Tails.");
    }
    
    public void rng()
    {
        System.out.println("Enter smallest possible number: ");
        int min = Integer.parseInt(sc.next());
        System.out.println("Enter largest possible number: ");
        int max = Integer.parseInt(sc.next());
        
        int num = (min + rng.nextInt(max - min + 1));
        System.out.println("Generated " + num + ".");
    }
    
    public void alphabetize()
    {
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Enter list items (enter '1337' to terminate):");

        int x = 0;
        while(x == 0)
        {
            System.out.print(">");
            list.add(sc.nextLine());
            //list.get(list.size() - 1).toLowerCase();

            if(list.get(list.size() - 1).equals("1337"))
            {
                list.remove(list.size()-1);
                x++;
            }
        }
        
        //System.out.println("<End of List>");
        for(int b = 0; b < list.size(); b++)
            for(int i = 0; i < list.size() - 1; i++)
            {
                String val = "a";
                
                boolean found = false;
                int valI = 0;
                int valII = 0;
                //System.out.println("In the loop, ");
                while(!found)
                    for(int c = 0; c < 128; c++)
                        if(list.get(i).charAt(0) != c)
                            valI++;
                        else
                        {
                            found = true;
                            c += 128;
                        }
                //System.out.print("found i, ");
                found = false;
                            
                while(!found)
                    for(int d = 0; d < 128; d++)
                        if(list.get(i + 1).charAt(0) != d)
                            valII++;
                        else
                        {
                            found = true;
                            d += 128;
                        }
                //System.out.print("found i + 1, ");
                boolean compared = false;
                
                int index1 = 1;
                int index2 = 1;
                while(!compared)
                    if(valII < valI)
                    {
                        String temp = list.remove(i);
                        list.add(i + 1, temp);
                        compared = true;
                        //System.out.print("replaced i and i + 1, ");
                    }
                    else if(valII == valI)
                    {
                        if(list.get(i).equals(list.get(i+1)))
                            compared = true;
                        //System.out.print("entering == loop, ");
                        valI = 0;
                        valII = 0;
                        
                        found = false;
                        
                        while(!found && index1 < list.get(i).length())
                            for(int e = 0; e < 128; e++)
                                if(list.get(i).charAt(index1) != e)
                                    valI++;
                                else
                                {
                                    found = true;
                                    index1++;
                                    e += 128;
                                }
                        //System.out.print("found index1, ");
                        
                        found = false;
                        
                        while(!found && index2 < list.get(i+1).length())
                            for(int f = 0; f < 128; f++)
                                if(list.get(i+1).charAt(index2) != f)
                                    valII++;
                                else
                                {
                                    found = true;
                                    index2++;
                                    f += 128;
                                }
                        //System.out.print("found index2, ");
                        
                    }
                    else
                        compared = true;
            }
        
        System.out.println();
        for(int s = 0; s < list.size(); s++)
            System.out.println((s+1) + ".\t" + list.get(s));
    }
    
    public void wait(int seconds)
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
    
    public void off()
    {
        on = false;
    }
}
