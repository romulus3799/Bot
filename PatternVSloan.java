import java.util.*;

public class PatternVSloan extends Again
{
    private int items;

    private ArrayList<String> patternList = new ArrayList<>();
    private static final int CHAR_NUM = 15;
    private String[] patternChars = new String[]
                                        {":) ",":( ",";) ",">:( ",".-. ","_(._.)_ ","T.T ","~@^.^@~ ",":/ ",":P ","(+).(+) ",":* ","$.$ ","[o.o] ","O.o "};
    Scanner sc = new Scanner(System.in);
    Random rngesus = new Random();
    
    public PatternVSloan()
    {
        super("Generate another?", "y", "n");
        items = 0;
    }
    
    public void getInputs()
    {
        System.out.print("\nHow many items in your pattern?:\n>");
        items = sc.nextInt();
    }
    
    public void generate()
    {
        
        
        System.out.print("Generating");
        for(int i = 0; i < 3; i++)
        {
            wait(500);
            System.out.print("..");
        }
        
        for(int i = 0; i < items; i++)
        {
            patternList.add(patternChars[rngesus.nextInt(CHAR_NUM)]);
            /*
            switch(rngesus.nextInt(15))
            {
                case 0: patternList.add("/");
                    break;
                
                case 1: patternList.add("\\");
                    break;
                
                case 2: patternList.add("|");
                    break;
                
                case 3: patternList.add("(");
                    break;
                
                case 4: patternList.add(")");
                    break;
                
                case 5: patternList.add("-");
                    break;
                
                case 6: patternList.add("+");
                    break;
                
                case 7: patternList.add("=");
                    break;
                
                case 8: patternList.add("_");
                    break;
                
                case 9: patternList.add("<");
                    break;
                
                case 10: patternList.add(">");
                    break;
                
                case 11: patternList.add("[");
                    break;
                
                case 12: patternList.add("]");
                    break;
                
                case 13: patternList.add(":");
                    break;
                
                case 14: patternList.add("~");
                    break;
                
                default: patternList.add("");
            }
            */
        }
    }
    
    public void print()
    {
        System.out.println("\n");
        wait(500);
        for(int i = 0; i < 200/items; i++)
            for(String e:patternList)
                System.out.print(e);
        System.out.println("\n");
    }
    
    public void reset()
    {
        for(int i = 0; i < items; i++)
            patternList.remove(0);
    }
    
    public void execute()
    {
        while(again)
        {
            getInputs();
            generate();
            print();
            reset();
            check();
        }
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
}
