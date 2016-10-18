
public class BaseChangerClient
{
    public static void header()
    {
        System.out.println("BASE CHANGER by Romil Havewala");
        
        System.out.println("\nInstructions");
        System.out.println("1.\tInput any integer between base 2 and base 36 (inclusive)");
        System.out.println("2.\tSpecify the base of the integer you just input");
        System.out.println("3.\tSpecify the base to which you want your integer to convert");
        System.out.println("4.\tBe impressed :)");
        System.out.println("\n");
        
    }
    
    public static void main()
    {
        header();
        
        BaseChanger bc = new BaseChanger();
        
        bc.change();
    }
}
