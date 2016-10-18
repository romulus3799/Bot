import javax.swing.JOptionPane;

public class InteractiveAdventure
{
    public static void main()
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String job = JOptionPane.showInputDialog("Name an occupation.");
        String gender = JOptionPane.showInputDialog("What is your gender (Type: M or F)?");

        String color = JOptionPane.showInputDialog("What is your favorite color?");
        String reason = JOptionPane.showInputDialog("Why can't you sleep at night?");
        String food = JOptionPane.showInputDialog("What is your favorite food?");
        String character = JOptionPane.showInputDialog("Name any real or fictional character.");
        String weapon = JOptionPane.showInputDialog("What is your weapon of choice?");
        String warPlace = JOptionPane.showInputDialog("Name your favorite place.");
        String place = JOptionPane.showInputDialog("What is your least favorite place?");
        String illness = JOptionPane.showInputDialog("Name a fatal illness.");
        
       if(gender.equalsIgnoreCase("f"))
           System.out.println(name + ", the wandering " + job
               + ", went to " + place + ", her favorite place in the universe.\nAfter eating some "
               + food + ", she found a " + color + " " + weapon
               + ", the very one used to kill " + character + " in the great war of "
               + warPlace + ".\nAnd it was lying on the ground! What luck!\nHowever, "
               + name + " couldn't get it because "
               + reason + ". She was heartbroken and later died of "
               + illness + ".\nTHE END");  
       else
           System.out.println(name + ", the wandering " + job
               + ", went to " + place + ", his favorite place in the universe.\nAfter eating some "
               + food + ", he found a " + color + " " + weapon
               + ", the very one used to kill " + character + " in the great war of "
               + warPlace + ".\nAnd it was lying on the ground! What luck!\nHowever, "
               + name + " couldn't get it because "
               + reason + ". He was heartbroken and later died of "
               + illness + ".\nTHE END");  
    }
}
