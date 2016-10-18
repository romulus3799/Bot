import java.util.*;

public class Pattern extends Again
{
    private int items;

    private ArrayList<String> patternList = new ArrayList<>();
    private static final int CHAR_NUM = 15;
    private String[] patternChars = new String[]
                                        {"/","\\","|","(",")","-","+","=","_","<",">","[","]",":","~"};
    Scanner sc = new Scanner(System.in);
    Random rngesus = new Random();
    Loading l = new Loading();
    public Pattern()
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
        l.load(3);
        
        for(int i = 0; i < items; i++)
        {
            patternList.add(patternChars[rngesus.nextInt(CHAR_NUM)]);
        }
    }
    
    public void print()
    {
        System.out.println("\n");
        wait(500);
        for(int i = 0; i < 200/items; i++)
            for(String e:patternList)
            {
                System.out.print(e);
                wait(10);
            }
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
