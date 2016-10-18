import java.util.Scanner;
public class Adventure2
{
    public static void header()
    {
        System.out.println("[[[[[[[[Interactive Adventure v.2]]]]]]]]");
        System.out.println("[[[[[[[[   by: Romil Havewala    ]]]]]]]]");
        System.out.println("\n");
    }
    
    public static void main()
    {
        header();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nInput your name:\n>");
        String name = sc.nextLine();
        
        System.out.print("\nInput your gender('m' or 'f'):\n>");
        String gender = sc.nextLine();
        
        System.out.print("\nInput a place:\n>");
        String place = sc.nextLine();    
        
        System.out.print("\nInput a plural item:\n>");
        String itemPlural = sc.nextLine();
        
        System.out.print("\nInput a male name:\n>");
        String nameMale = sc.nextLine();
        
        System.out.print("\nInput another occupation:\n>");
        String occupation2 = sc.nextLine();
        
        System.out.print("\nInput a plural noun:\n>");
        String nounPlural = sc.nextLine();
        
        System.out.print("\nInput a verb ending in -er (such as 'killer' or 'launcher'):\n>");
        String verb = sc.nextLine();
        
        System.out.print("\nInput an occupation:\n>");
        String occupation = sc.nextLine();
        
        System.out.print("\nInput a body part:\n>");
        String feature = sc.nextLine();
        
        System.out.print("\nInput an explosive device:\n>");
        String explosiveDevice = sc.nextLine();
        
        System.out.print("\nInput a company name:\n>");
        String company = sc.nextLine();
        
        System.out.print("\nInput a body part:\n>");
        String bodyPart = sc.nextLine();
        
        System.out.print("\nInput another plural item:\n>");
        String itemPlural2 = sc.nextLine();
        
        System.out.print("\nInput a noun:\n>");
        String noun = sc.nextLine();
        
        System.out.print("\nInput another place:\n>");
        String place2 = sc.nextLine();
        
        System.out.print("\nInput a verb ending in -ing:\n>");
        String verbIng = sc.nextLine();

        if(gender.equalsIgnoreCase("f"))
        {
            System.out.println("There once was a woman named "+name+". She was the best "+occupation+" in all of "+place+".");
            System.out.println("She was good at being a "+occupation+" because she had a great "+feature+" for that kind of thing. However, one day, "+name+" was inexplicably fired! What was she to do now?");
            System.out.println(""+name+" looked for jobs, but all she could find were low-paying side jobs working at places like "+place2+". She would never work there in a million years.");
            System.out.println("After a long period of depression and a strange incident involving "+itemPlural+", "+name+" was approached by a strange man.");
            System.out.println("\n'I hear you're out of work,' he said. 'How would you like to work for me?");
            System.out.println("\n"+name+" was confused. Who was this man? How did he know I was out of work? Why did he want me to work for him? And WHAT did he want me to do for him?");
            System.out.println("As if on cue, the man answered all of the questions.");
            System.out.println("'My name is "+nameMale+". I am a head "+occupation2+" at "+company+". You asked one of my colleagues for a job. ");
            System.out.println("Of course, you didn't know this, but he informed me that you'd be perfect for the job.");
            System.out.println("\n'And what might this job be?' asked "+name+".");
            System.out.println("\n'Hahaha, don't you know? You're gonna be handling "+itemPlural2+" as a full-time "+noun+" "+verb+"!'");
            System.out.println(""+name+" was ecstatic. This had been her dream job all his life! She started work the very next day, and she loved her job.");
            System.out.println("She especially loved "+verbIng+" all the "+nounPlural+". It was her favorite part of the day. She lived happily ever after, until a "+explosiveDevice+" blew off her "+bodyPart+".");
            
            System.out.println("\nTHE END");
        }
        else
        {
            System.out.println("There once was a man named "+name+". He was the best "+occupation+" in all of "+place+".");
            System.out.println("He was good at being a "+occupation+" because he had a great "+feature+" for that kind of thing. However, one day, "+name+" was inexplicably fired! What was he to do now?");
            System.out.println(""+name+" looked for jobs, but all he could find were low-paying side jobs working at places like "+place2+". He would never work there in a million years.");
            System.out.println("After a long period of depression and a strange incident involving "+itemPlural+", "+name+" was approached by a strange man.");
            System.out.println("\n'I hear you're out of work,' he said. 'How would you like to work for me?");
            System.out.println("\n"+name+" was confused. Who was this man? How did he know I was out of work? Why did he want me to work for him? And WHAT did he want me to do for him?");
            System.out.println("As if on cue, the man answered all of the questions.");
            System.out.println("'My name is "+nameMale+". I am a head "+occupation2+" at "+company+". You asked one of my colleagues for a job. ");
            System.out.println("Of course, you didn't know this, but he informed me that you'd be perfect for the job.");
            System.out.println("\n'And what might this job be?' asked "+name+".");
            System.out.println("\n'Hahaha, don't you know? You're gonna be handling "+itemPlural2+" as a full-time "+noun+" "+verb+"!'");
            System.out.println(""+name+" was ecstatic. This had been his dream job all his life! He started work the very next day, and he loved his job.");
            System.out.println("He especially loved "+verbIng+" all the "+nounPlural+". It was his favorite part of the day. He lived happily ever after, until a "+explosiveDevice+" blew off his "+bodyPart+".");
            
            System.out.println("\nTHE END");
        }
    }
}
