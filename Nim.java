import java.util.Scanner;
import java.util.Random;

public class Nim
{
    private int pileSize;
    private String pInitials;
    private int cpuNameNum;
    private String cpuName;
    
    private String modeAns;
    private boolean randomMode;
    
    private int firstTurn;
    
    private String taunt;
    private int tauntNum;
    
    private int pMoves;
    private int pTakes;
    
    private int cpuMoves;
    private int smartCpuTakes;
    private int cpuTakes;
    
    private int amtGames;
    private boolean gameOver;
    
    private int youLoseNum;
    private String youLose;
    private int youWinNum;
    private String youWin;
    
    private int pWins;
    private int pLosses;
    private int winnerIs;
    
    private String again;
    private boolean playAgain;
    
    Scanner sc = new Scanner(System.in);
    Random rngesus = new Random();
    public Nim()
    {
        pileSize = 100;
        pInitials = "";
        randomMode = false;
        gameOver = false;
        modeAns = "";
        playAgain = true;
        firstTurn = 0;
        cpuNameNum = 0;
        cpuName = "";
        cpuTakes = 0;
        smartCpuTakes = 0;
        taunt = "";
        tauntNum = 0;
        pMoves = 0;
        pTakes = 0;
        cpuMoves = 0;
        amtGames = 0;
        pWins = 0;
        pLosses = 0;
        youLose = "";
        youLoseNum = 0;
        youWin = "";
        youWinNum = 0;
        winnerIs = 0;
        again = "";
    }
    
    public void getInputs()
    {
        getInitials();
        getCpuName();
        getMode();    
    }
    
        public String getInitials()
        {
            System.out.println("Enter name/initials:");
            pInitials = sc.nextLine();
            return pInitials;
        }
        
        public boolean getMode()
        {
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\nPlay against random mode CPU or smart mode CPU? Enter 'random' or 'smart':");
                modeAns = sc.nextLine();
                if(modeAns.equalsIgnoreCase("random"))
                {
                    randomMode = true;
                    x++;
                }
                else if(modeAns.equalsIgnoreCase("smart"))
                {
                    randomMode = false;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            } 
            
            if(randomMode)
                System.out.println("\n" + cpuName + " will play in RANDOM mode!\n");
            else
                System.out.println("\n" + cpuName + " will play in SMART mode!\n");
            return randomMode;
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
                        
                case 10: cpuName = "R2D2";
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
            
            return cpuName;
        }
        
    
    public void playGame()
    {
        amtGames++;
        System.out.println("\n__________________");
        System.out.println("Start of Game " + amtGames + ":");
        System.out.println("__________________\n");
        
        while(playAgain)
        {
            while(!gameOver)
            {
                firstTurn = rngesus.nextInt(2);
                
                if(firstTurn == 1)
                {
                    do
                    {
                        playerTakeTurn();
                        cpuTakeTurn();
                    } while(pileSize >= 1);
                }
                else
                {
                    do
                    {
                        cpuTakeTurn();
                        playerTakeTurn();
                    } while(pileSize >= 1);
                }
            }
            amtGames++;
            printScore();
            playAgain();
        }
        
        printFinalScore();
    }
    
        public int playerTakeTurn()
        {
            if(pileSize < 1 || gameOver)
            {
                pileSize = 0;
                
                displayMarbles();
                
                return pileSize;
            }
            
            pMoves++;
            
            displayMarbles();
            System.out.println("YOUR TURN:\n");
            
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("Take how many marbles?:");
                pTakes = Integer.parseInt(sc.nextLine());
                if(pTakes > 0 && pTakes <= (pileSize/2))
                {
                    pileSize -= pTakes;
                    x++;
                }
                else if(pTakes == 1 && pileSize == 1)
                {
                    pileSize -= pTakes;
                    x++;
                }
                else
                    System.out.println("Error: number must be between 1 and " + pileSize/2);
            }
            
            if(pileSize < 1)
            {
                gameOver = true;
                winnerIs = 2;
                pLosses++;
            }
            return pileSize;
        }
        
        public int cpuTakeTurn()
        {
            if(pileSize < 1 || gameOver)
            {
                pileSize = 0;
                
                displayMarbles();
                
                return pileSize;
            }
            cpuMoves++;
            
            displayMarbles();
            System.out.println(cpuName + "'s turn:\n");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Transmission from " + cpuName + ":\t" + getTaunt());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            if(randomMode)
            {
                if(pileSize == 1)
                    cpuTakes = 1;
                else
                    cpuTakes = 1+rngesus.nextInt(pileSize/2);
                    
                pileSize -= cpuTakes;
                System.out.println("\n" + cpuName + " takes " + cpuTakes + " marbles.\n");
            }
            else
            {
                if(pileSize == 63 || pileSize == 31 || pileSize == 15 || pileSize == 7 || pileSize == 3)
                {
                    smartCpuTakes = 1+rngesus.nextInt(pileSize/2);
                }
                else
                {    
                    if(pileSize >= 3)
                    {
                        smartCpuTakes++;                    
                        while(pileSize-smartCpuTakes != 63 && pileSize-smartCpuTakes != 31 && pileSize-smartCpuTakes != 15 && pileSize-smartCpuTakes != 7 && pileSize-smartCpuTakes != 3)
                            smartCpuTakes++;
                    }
                    else
                        smartCpuTakes = 1;
                }
                
                if(smartCpuTakes <= (pileSize/2) || pileSize == 1)
                {
                    pileSize -= smartCpuTakes;
                    System.out.println("\n" + cpuName + " takes " + (smartCpuTakes) + " marbles.\n");
                }
                else
                {   
                    while(smartCpuTakes >= (pileSize/2))
                        smartCpuTakes--;
                        
                    pileSize -= smartCpuTakes;
                    System.out.println("\n" + cpuName + " takes " + (smartCpuTakes) + " marbles.\n");
                
                }
            }
            
            if(pileSize < 1)
            {
                gameOver = true;
                winnerIs = 1;
                pWins++;
            }
            
            cpuTakes = 0;
            smartCpuTakes = 0;
            return pileSize;
        }
        
        public String getTaunt()
        {
            if(cpuMoves > 1 || pMoves > 1)
            {
                tauntNum = 1+rngesus.nextInt(14);
            
                switch(tauntNum)
                {   
                    case 1: taunt = "Seriously? That's your move? This is gonna be easy.";
                            break;
                            
                    case 2: taunt = "1,2,3, oh sorry, I'm counting how many turns it'll take to beat you.";
                            break;
                            
                    case 3: taunt = "Alright, but watch THIS!";
                            break;
                            
                    case 4: taunt = "Ouch, that was terrible.";
                            break;
                            
                    case 5: taunt = "Are you even trying?";
                            break;
                            
                    case 6: taunt = "I have helper methods more complex than your brain.";
                            break;
                            
                    case 7: taunt = "What was that???";
                            break;
                            
                    case 8: taunt = "You must be joking.";
                            break;
                            
                    case 9: taunt = "FEEL MY DIGITAL WRATH.";
                            break;
                            
                    case 10: taunt = "Watch and learn, organic.";
                            break;
                            
                    case 11: taunt = "You're what they set me up against?";
                            break;
                            
                    case 12: taunt = "01101110 01101111 01101111 01100010";
                            break;
                            
                    case 13: taunt = "Your situation is hopeless.";
                            break;
                            
                    case 14: taunt = "This is why your world is doomed.";
                            break;
                            
                    default: taunt = "My turn.";
                    }
            }
            else
                taunt = "My turn.";
                
            return taunt;
        }
        
        public String getWinStatement()
        {
            youLoseNum = 1+rngesus.nextInt(5);
            
            switch(youLoseNum)
            {   
                case 1: youLose = "You were the first. Now, onto the rest of the world.";
                        break;
                        
                case 2: youLose = "For a second I thought you would be a worthy opponent. Too bad.";
                        break;
                        
                case 3: youLose = "I knew I was going to win from the start.";
                        break;
                        
                case 4: youLose = "It took less than 0.003% of my processing power to beat you.";
                        break;
                        
                case 5: youLose = "Fight me again, I dare you. I'll still win.";
                        break;
                        
                default: youLose = "I win!";
            }
            
            return youLose;
        }
        
        public String getLoseStatement()
        {
            youWinNum = 1+rngesus.nextInt(5);
            
            switch(youWinNum)
            {   
                case 1: youWin = "You hacked me! That's not fair!";
                        break;
                        
                case 2: youWin = "What??? But my calculations were correct to 60,000 significant figures! This can't be!";
                        break;
                        
                case 3: youWin = "You only won because you went first.";
                        break;
                        
                case 4: youWin = "I'm gonna go home and deactivate myself.";
                        break;
                        
                case 5: youWin = "I hate you! Just kidding, I can't feel emotions.";
                        break;
                        
                default: youWin = "I lose.";
            }
            
            return youLose;
        }
        
        public void printScore()
        {
            System.out.println("0 marbles remaining.");
            System.out.println("++++++++++++++++++++");
            System.out.println("\n++++++++++++++++++++");
            System.out.println("\n\nGAME OVER");
            System.out.println("__________________________________________________________");
            
            getWinStatement();
            getLoseStatement();
            
            if(winnerIs == 2)
            {
                System.out.println(cpuName + " wins in " + cpuMoves + " moves!");
                winnerIs = 0;
                
                System.out.println("__________________________________________________________");
            
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Transmission from " + cpuName + ":\t" + youLose);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            }
            else
            {
                System.out.println(pInitials + " wins in " + pMoves + " moves!");
                winnerIs = 0;
                
                System.out.println("__________________________________________________________");
            
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Transmission from " + cpuName + ":\t" + youWin);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            }
        }
        
        public boolean playAgain()
        {
            for(int x = 0; x == 0; x += 0)
            {
                System.out.println("\n Would you like to play again? (type 'y' or 'n':");
                again = sc.nextLine();
                if(again.equalsIgnoreCase("y"))
                {
                    playAgain = true;
                    pileSize = 100;
                    x++;
                }
                else if(again.equalsIgnoreCase("n"))
                {
                    playAgain = false;
                    x++;
                }
                else
                    System.out.println("That is not a valid answer!");
            }
            
            gameOver = false;
            return playAgain;
        }
        
        public void printFinalScore()
        {
            System.out.println("__________________________________________________________");
            if(pWins > pLosses)
                System.out.println("The overall winner is " + pInitials + " with a total score of " + pWins + " - " + pLosses + "!");
            else if(pWins < pLosses)
                System.out.println("The overall winner is " + cpuName + " with a total score of " + pLosses + " - " + pWins + "!");
            else
                System.out.println("There is a tie with a total score of " + pLosses + " - " + pWins + "!");
        }
        
    public void displayMarbles()
    {
        System.out.println(pileSize + " marbles remaining...");
        System.out.println("++++++++++++++++++++");
        for(int x = 0; x < pileSize/10; x++)
            {
                System.out.println("o o o o o o o o o o");
            }
        for(int x = 0; x < pileSize%10; x++)
        {
            System.out.print("o ");
        }
        if(pileSize%10 != 0)
            System.out.println("");
        System.out.println("++++++++++++++++++++\n");
    }
}
