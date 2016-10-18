import java.util.Scanner;
import java.util.Random;

public class RoboFight
{
    private String pName;
    private int harris;
    private int cpuNameNum;
    private String cpuName;
    
    private int amtGames;
    private int firstTurn;
    private int actionNum;
    private int scale;
    
    private int pHP;
    private int cpuHP;
    private int maxHP;
    
    private int dmgToP;
    private int dmgToCpu;
    
    private int rocketPunchDmg;
    private int servoSlamDmg;
    private int bashDmg;
    private int EMPDmg;
    private int clusterBombsDmg;
    private int shieldBlock;
    private int rechargeEnergy;
    
    private String option;
    private int cpuOption;
    
    private int hitChance;
    private static final int CRIT_CHANCE = 5;
    private int hit;
    private int block;
    private int heal;
    
    private int cpuChance;

    private boolean gameOver;
    private String again;
    private boolean playAgain;
    private int pWins;

    Scanner sc = new Scanner(System.in);
    Random rngesus = new Random();
    public RoboFight()
    {
        pName = "Bot";
        harris = 0;
        cpuNameNum = 0;
        cpuName = "";
        
        amtGames = 0;
        firstTurn = 0;
        actionNum = 0;
        scale = 0;
        
        pHP = 0;
        cpuHP = 0;
        maxHP = scale(20);
        dmgToP = 0;
        dmgToCpu = 0;
        
        rocketPunchDmg = scale(10);
        servoSlamDmg = scale(7);
        bashDmg = scale(4);
        EMPDmg = scale(20);
        clusterBombsDmg = scale(5);
        shieldBlock = scale(5);
        rechargeEnergy = scale(5);
        
        option = "";
        cpuOption = 0;
        
        hitChance = 0;
        hit = 0;
        block = 0;
        heal = 0;
        
        cpuChance = 0;

        gameOver = false;
        again = "";
        playAgain = true;
        pWins = 0;
    }
    
    public int scale(int base)
    {
        return (int)(base * (Math.pow(1.5, scale)));
    }
    
    public void getInputs()
    {
        wait(1000);
        getPName();
        wait(1000);
        getCpuName(); 
        wait(1000);
    }
    
    public String getPName()
    {
        System.out.print("\nInput your robot's name:\n>");
        pName = sc.nextLine();
        for(int i = 0; i < pName.length() -2; i++)
        {
            if(Character.toString(pName.charAt(i)).equalsIgnoreCase("r"))
                if(Character.toString(pName.charAt(i+1)).equalsIgnoreCase("o"))
                    if(Character.toString(pName.charAt(i+2)).equalsIgnoreCase("b"))
                    harris = 1;
        }
        for(int i = 0; i < pName.length() -6; i++)
        {
            if(Character.toString(pName.charAt(i)).equalsIgnoreCase("h"))
                if(Character.toString(pName.charAt(i+1)).equalsIgnoreCase("a"))
                    if(Character.toString(pName.charAt(i+2)).equalsIgnoreCase("r"))
                        if(Character.toString(pName.charAt(i+3)).equalsIgnoreCase("r"))
                            if(Character.toString(pName.charAt(i+4)).equalsIgnoreCase("i"))
                                if(Character.toString(pName.charAt(i+5)).equalsIgnoreCase("s"))
                                    harris = 1;
        }
        
        if(harris == 1)
        {
            System.out.print("\nScanning name...");
            wait(1000);
            System.out.print("Mr. Harris has entered the game. Setting difficulty to maximum.\n");
        }
        return pName;
    }
    
    public String getCpuName()
    {
        cpuNameNum = 1+rngesus.nextInt(14);
        
        switch(cpuNameNum)
        {   
            case 1: cpuName = "Ultron";
                    break;
                    
            case 2: cpuName = "HAL 9000";
                    break;
                    
            case 3: cpuName = "AVA 2.0";
                    break;
                    
            case 4: cpuName = "Claptrap";
                    break;
                    
            case 5: cpuName = "GladOS";
                    break;
                    
            case 6: cpuName = "WALL-E";
                    break;
                    
            case 7: cpuName = "HK-47";
                    break;
                    
            case 8: cpuName = "Skynet";
                    break;
                    
            case 9: cpuName = "Cortana";
                    break;
                    
            case 10: cpuName = "BB-8";
                    break;
                    
            case 11: cpuName = "AM";
                    break;
                    
            case 12: cpuName = "Deep Blue";
                    break;
                    
            case 13: cpuName = "TARS";
                    break;
                    
            case 14: cpuName = "Baymax";
                    break;
                    
            default: cpuName = "CPU";
        }
        wait(1000);
        System.out.println("Your opponent is..." + cpuName);
        wait(1000);
        return cpuName;
    }
    
    public void playGame()
    {
        getInputs();
        while(playAgain)
        {
            while(!gameOver)
            {
                displayGameStart();
                setup();
                
                firstTurn = rngesus.nextInt(2);
                
                if(firstTurn == 1)
                {
                    do
                    {
                        if(pHP > 0 && cpuHP > 0)
                            pTakeTurn();
                            
                        if(pHP > 0 && cpuHP > 0)
                            cpuTakeTurn();
                    } while(pHP > 0 && cpuHP > 0);
                    
                    gameOver = true;
                }
                else
                {
                    displayEnergy();
                    pause();
                    
                    do
                    {
                        if(pHP > 0 && cpuHP > 0)
                            cpuTakeTurn();
                            
                        if(pHP > 0 && cpuHP > 0)
                            pTakeTurn();
                    } while(pHP > 0 && cpuHP > 0);
                    
                    gameOver = true;
                }
            }

            gameOver();
        }
        
        printFinalScore();
    }
    
    public void displayGameStart()
    {
        System.out.println("GAME START");
        System.out.println("\n<<>><<>><<>><<>><<>>");
        System.out.println("Start of Level " + (amtGames+1) + ":");
        System.out.println("<<>><<>><<>><<>><<>>\n");
        wait(1000);
    }
    
    public void setup()
    {
        maxHP = scale(20);
        rocketPunchDmg = scale(10);
        servoSlamDmg = scale(7);
        bashDmg = scale(4);
        EMPDmg = scale(20);
        clusterBombsDmg = scale(4);
        shieldBlock = scale(10);
        rechargeEnergy = scale(5);
        pHP = maxHP;
        cpuHP = maxHP;
        dmgToP = 0;
        dmgToCpu = 0;
        amtGames++;
    }
    
    public void displayEnergy()
    {
        System.out.println(pName + "'s Energy: " + pHP);
        System.out.println("____________________________________________________________");
        for(int x = 0; x < pHP/30; x++)
        {
            System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
        }
        for(int x = 0; x < pHP%30; x++)
        {
            System.out.print("[]");
        }

        System.out.print("\n____________________________________________________________\n");
        
        if(pHP > ((maxHP)*2)/3)
        {
            System.out.println("(o)  (o)");
            System.out.println("");
            System.out.println(" \\____/\n");
        }
        else if(pHP > ((maxHP)/3))
        {
            System.out.println("(o)  (o)");
            System.out.println(" ______");
            System.out.println("");
        }
        else if(pHP > 0)
        {
            System.out.println(" /     \\");
            System.out.println("(o)   (o)");
            System.out.println("  _____");
            System.out.println(" /     \\\n");
        }
        else
        {
            System.out.println("(X)   (X)");
            System.out.println("  _____");
            System.out.println(" /     \\\n");
        }
        System.out.println(cpuName + "'s Energy: " + cpuHP);
        System.out.println("____________________________________________________________");
        for(int x = 0; x < cpuHP/30; x++)
        {
            System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]");
        }
        for(int x = 0; x < cpuHP%30; x++)
        {
            System.out.print("[]");
        }
        System.out.print("\n____________________________________________________________\n");
        
        if(cpuHP > ((maxHP)*2)/3)
        {
            System.out.println("(+)  (+)");
            System.out.println("");
            System.out.println(" \\____/\n");
        }
        else if(cpuHP > ((maxHP)/3))
        {
            System.out.println("(+)  (+)");
            System.out.println(" ______");
            System.out.println("");
        }
        else if(cpuHP > 0)
        {
            System.out.println(" /     \\");
            System.out.println("(+)   (+)");
            System.out.println("  _____");
            System.out.println(" /     \\\n");
        }
        else
        {
            System.out.println("(X)   (X)");
            System.out.println("  _____");
            System.out.println(" /     \\\n");
        }
        
        wait(1000);
    }
    
    public void displayMoves()
    {
        System.out.println("Option\tMove\t\tDescription");
        wait(300);
        System.out.println("1\tRocket Punch\t70% chance to deal up to " + (rocketPunchDmg) + " dmg");
        wait(300);
        System.out.println("2\tServo Slam\t85% chance to deal up to " + (servoSlamDmg) + " dmg");
        wait(300);
        System.out.println("3\tBash\t\t100% chance to deal up to " + (bashDmg) + " dmg");
        wait(300);
        System.out.println("4\tEMP\t\t50% chance to deal up to " + EMPDmg + " dmg, 50% chance to take half as much dmg");
        wait(300);
        System.out.println("5\tCluster Bombs\t40% chance to deal up to " + (clusterBombsDmg) + " dmg, attacks 3 times");
        wait(300);
        System.out.println("6\tEnergy Shield\t80% chance to absorb up to " + (shieldBlock) + " dmg for " + cpuName + "'s next turn");
        wait(300);
        System.out.println("7\tRecharge\t90% chance to recharge up to " + (rechargeEnergy) + " pts of energy");
        wait(300);
    }
    
    public void displayTurn(String name)
    {
        System.out.println("{{{{{{{{{{{{{{{{{|}}}}}}}}}}}}}}}}}");
        System.out.println("        BEGIN " + name + "'s Turn");
        System.out.println("{{{{{{{{{{{{{{{{{|}}}}}}}}}}}}}}}}}\n");
        wait(500);
    }
    
    public void pTakeTurn()
    {
        displayTurn(pName);
        
        displayEnergy();
        displayMoves();
        
        int x = 0;
        while(x == 0)
        {
            System.out.print("\n\nInput option number:\n>");
            option = sc.nextLine();
            if(!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")
                && !option.equals("5") && !option.equals("6") && !option.equals("7"))
                System.out.println("That is not a valid option!");
            else if(option.equals("1337"))
                System.exit(0);
            else
                x = 1;
        }
        
        switch(option)
        {
            case "1": System.out.println("\n" + pName + " rocket punches " + cpuName + "!");
                    rocketPunch(pName);
                break;
                
            case "2": System.out.println("\n" + pName + " servo slams " + cpuName + "!");
                    servoSlam(pName);
                break;
                
            case "3": System.out.println("\n" + pName + " bashes " + cpuName + "!");
                    bash(pName);
                break;
                
            case "4": System.out.println("\n" + pName + " detonates an EMP!");
                    EMP(pName);
                break;
                
            case "6": System.out.println("\n" + pName + " throws up an energy shield!");
                    energyShield();
                break;
                
            case "7": System.out.println("\n" + pName + " recharges energy!");
                    recharge(pName);
                break;
                
            case "5": System.out.println("\n" + pName + " throws 3 cluster bombs!");
                    clusterBombs(pName);
                break;
                
            default: System.out.println("\n" + pName + " throws up an energy shield!");
                    energyShield();
                break;
        }
        wait(1000);
        displayEnergy();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        turnReset();
        pause();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void cpuTakeTurn()
    {
        displayTurn(cpuName);
        
        cpuChance = rngesus.nextInt(101);
        
        if(cpuHP >= maxHP/2)
            if(cpuChance <= 90)
                cpuOption = (1+rngesus.nextInt(5));
            else
                cpuOption = (6+rngesus.nextInt(2));
        else
            if(cpuChance <= 50)
                cpuOption = (1+rngesus.nextInt(5));
            else
                cpuOption = (6+rngesus.nextInt(2));
        if(pHP == maxHP/10)
            cpuOption = 3;    
            
        wait(1000);
        switch(cpuOption)
        {
            case 1: System.out.println("\n" + cpuName + " rocket punches " + pName + "!\n");
                    rocketPunch(cpuName);
                break;
                
            case 2: System.out.println("\n" + cpuName + " servo slams " + pName + "!\n");
                    servoSlam(cpuName);
                break;
                
            case 3: System.out.println("\n" + cpuName + " bashes " + pName + "!\n");
                    bash(cpuName);
                break;
                
            case 4: System.out.println("\n" + cpuName + " detonates an EMP!\n");
                    EMP(cpuName);
                break;
                
            case 6: System.out.println("\n" + cpuName + " throws up an energy shield!\n");
                    energyShield();
                break;
                
            case 7: System.out.println("\n" + cpuName + " recharges energy!\n");
                    recharge(cpuName);
                break;
                
            case 5: System.out.println("\n" + cpuName + " throws 3 cluster bombs!\n");
                    clusterBombs(cpuName);
                break;
                
            default: System.out.println("\n" + cpuName + " throws up an energy shield!");
                    energyShield();
                break;
        }
        wait(1000);
        displayEnergy();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        turnReset();
        pause();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
        public void turnReset()
        {
            dmgToP = 0;
            dmgToCpu = 0;
            heal = 0;
            option = "";
            cpuOption = 0;
        }
    
    public void pAttack(int chance, int dmg)
    {
        hit = rngesus.nextInt(101);
        hitChance = chance;
        wait(1000);
        if(hit <= hitChance)
        {
            dmgToCpu = 1+rngesus.nextInt(dmg);
            if(hitChance == 40)
                System.out.println("BOOM!");
            wait(300);
            if(hit <= CRIT_CHANCE)
            {
                dmgToCpu *= 3;
                dmgToCpu /= 2;
                dmgToCpu += 1;
                System.out.println("CRITICAL HIT!!!");
            }
            wait(1000);
        }
        else
            System.out.println("The attack misses!");
        wait(100);
        if(block > 0)
        {
            dmgToCpu -= block;
            System.out.println("Blocked!");
            if(dmgToCpu < 0)
                dmgToCpu = 0;
            wait(1000);
        }
        block = 0;
        cpuHP -= dmgToCpu;
        System.out.println(""+ pName + " deals " + dmgToCpu + " damage to " + cpuName + "!\n");
        wait(500);
        dmgToCpu = 0;
    }    
        
    public void cpuAttack(int chance, int dmg)
    {
        hit = rngesus.nextInt(101);
        hitChance = chance;
        wait(1000);
        if(hit <= hitChance)
        {
            dmgToP = 1+rngesus.nextInt(dmg);
            if(hitChance == 40)
                System.out.println("BOOM!");
            wait(300);
            if(hit <= CRIT_CHANCE)
            {
                dmgToP *= 3;
                dmgToP /= 2;
                dmgToP += 1;
                System.out.println("CRITICAL HIT!!!");
            }
            wait(1000);
        }
        else
            System.out.println("The attack misses!");
        wait(100);
        if(block > 0)
        {
            dmgToP -= block;
            System.out.println("Blocked!");
            if(dmgToP < 0)
                dmgToP = 0;
        }
        wait(1000);
        block = 0;
        pHP -= dmgToP;
        System.out.println(""+ cpuName + " deals " + dmgToP + " damage to " + pName + "!\n");
        wait(500);
        dmgToP = 0;
    }
    
        public void rocketPunch(String name)
        {
            if(name.equals(pName))
                pAttack(70,rocketPunchDmg);
            else if(name.equals(cpuName))
                cpuAttack(70,rocketPunchDmg);
        }
        
        public void servoSlam(String name)
        {
            if(name.equals(pName))
                pAttack(85,servoSlamDmg);
            else if(name.equals(cpuName))
                cpuAttack(85,servoSlamDmg);
        }
        
        public void bash(String name)
        {
            if(name.equals(pName))
                pAttack(100,bashDmg);
            else if(name.equals(cpuName))
                cpuAttack(100,bashDmg);
            
        }
        
        public void EMP(String name)
        {
            if(name.equals(pName))
                pEMP();
            else if(name.equals(cpuName))
                cpuEMP();
        }
        public void pEMP()
        {
            pAttack(50,EMPDmg);
            if(hit%2 == 0)
                dmgToP = (1+rngesus.nextInt(EMPDmg/2));
            
            pHP -= dmgToP;
            System.out.println(pName + " takes " + dmgToP + " damage from the shockwave!");
        }
        
        public void cpuEMP()
        {
            cpuAttack(50,EMPDmg);
            if(hit%2 == 0)
                dmgToCpu = (1+rngesus.nextInt(EMPDmg/2));
            
            cpuHP -= dmgToCpu;
            System.out.println(cpuName + " takes " + dmgToCpu + " damage from the shockwave!");
        }
        
        public void clusterBombs(String name)
        {
            if(name.equals(pName))
                for(int i = 0;i < 3;i++)
                            pAttack(40,clusterBombsDmg);
            else if(name.equals(cpuName))
                for(int i = 0;i < 3;i++)
                            cpuAttack(40,clusterBombsDmg);
        }

        public void energyShield()
        {
            hit = rngesus.nextInt(101);
            hitChance = 80;
            
            if(hit <= hitChance)
            {
                block += shieldBlock;
                if(hit <= CRIT_CHANCE)
                {
                    block *= 3;
                    block /= 2;
                    block += 1;
                    System.out.println("SUPER BLOCK!!!");
                }
                
                System.out.println("Success!");
            }
            else
                System.out.println("The shield fails!");
        }
        
        public void recharge(String name)
        {
            hit = rngesus.nextInt(101);
            hitChance = 90;
            
            if(hit <= hitChance)
            {
                heal += (1+rngesus.nextInt(rechargeEnergy));
                if(hit <= CRIT_CHANCE)
                {
                    heal *= 3;
                    heal /= 2;
                    heal += 1;
                    System.out.println("SUPER HEAL!!!");
                }
            }
            else
                System.out.println("The recharge fails!");
                
            System.out.println("\n" + name + " recharges " + heal + " points of energy!");
            
            
            if(name.equals(pName))
            {
                if(pHP + heal > maxHP)
                    heal = maxHP - pHP;
                pHP += heal;
            }
            else
            {
                if(cpuHP + heal > maxHP)
                    heal = maxHP - cpuHP;
                cpuHP += heal;
            }
        }
    
    public void gameOver()
    {
        if(pHP > 0 && cpuHP <= 0)
        {
            System.out.println(cpuName + " dies. You win!");
            pWins++;
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\nMove onto level " + (scale + 2)+ "? (type 'y' or 'n':");
                again = sc.nextLine();
                if(again.equalsIgnoreCase("y"))
                {
                    playAgain = true;
                    scale++;
                    x++;
                }
                else if(again.equalsIgnoreCase("n"))
                {
                    playAgain = false;
                    scale = 0;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            }
        }
        else if (pHP <= 0 && cpuHP > 0)
        {
            System.out.println(pName + " dies. You lose!");
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\nRestart? (type 'y' or 'n':");
                again = sc.nextLine();
                if(again.equalsIgnoreCase("y"))
                {
                    playAgain = true;
                    amtGames = 0;
                    scale = 0;
                    x++;
                }
                else if(again.equalsIgnoreCase("n"))
                {
                    playAgain = false;
                    scale = 0;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            }
        }
        else
        {
            System.out.println(pName + " and " + cpuName + " both die. You lose!");
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\nRestart? (type 'y' or 'n':");
                again = sc.nextLine();
                if(again.equalsIgnoreCase("y"))
                {
                    playAgain = true;
                    amtGames = 0;
                    scale = 0;
                    x++;
                }
                else if(again.equalsIgnoreCase("n"))
                {
                    playAgain = false;
                    scale = 0;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            }
        }
        
        gameOver = false;
    }

    public void pause()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("<press ENTER to continue>");
        in.nextLine();
    }
    
    public static void wait(int seconds)
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
    
    public void printFinalScore()
    {
        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\n");
        if(pWins  != 1)
            System.out.println(pName + "'s final score is: " + pWins
                                + " wins against " + cpuName + "!");
        else
            System.out.println(pName + "'s final score is: " + pWins
                                + " win against " + cpuName + "!");
        System.out.print("\nYour rank is...");
        if(pWins >= 12)
            System.out.print("Terminator");
        else if(pWins >= 9)
            System.out.print("Iron Giant");
        else if(pWins >= 6)
            System.out.print("Optimus Prime");
        else if(pWins >= 3)
            System.out.print("R2D2");
        else
            System.out.print("Nanobot");
        
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
