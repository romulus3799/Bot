import java.util.Scanner;
public class Again
{
    Scanner sc = new Scanner(System.in);
    
    private String question;
    private String yes;
    private String no;
    private String response;
    protected boolean again;
    
    public Again(String q, String aff, String neg)
    {
        question = q;
        yes = aff;
        no = neg;
        response = "";
        again = true;
    }
    
    public void check()
    {
        for(int x = 0; x == 0; x += 0)
        {
            System.out.print(question + "(Type "+yes+" or "+no+"):\n>");
            response = sc.nextLine();
            if(response.equalsIgnoreCase(yes))
            {
                x++;
                again = true;
            }
            else if(response.equalsIgnoreCase(no))
            {
                x++;
                again = false;
            }
            else
                System.out.println("That is not a valid answer!");
        }
    }
}
