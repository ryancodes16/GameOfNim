import java.util.Scanner;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    private Pile myPile;
    private int marbles;
    private static int player = 0;
    private int playNum;
    private int mode = 0;
    private Scanner scan = new Scanner(System.in);
    public Game(int num, int playNum)
    {
        myPile = new Pile(num);
        this.playNum = playNum;
        marbles = 0;
        String ans = "";
        if(playNum == 1)
        {
            do
            {
                System.out.println("Would you like to play an easy or hard computer level (enter number)? [easy(0),medium(1), hard(2)]");
                mode = scan.nextInt();
            }while(mode != 0 && mode != 1 && mode != 2);
        }
        Play();
    }

    public void Play()
    {
        int firstPlayer = (int)(Math.random() * 2) + 1;
        //firstPlayer = 1;
        System.out.println("Player: " + firstPlayer + " will go first");
        if(playNum == 1)
        {
            System.out.println(myPile);
            if(firstPlayer == 1)
            {
                do
                {
                    player = 1;
                    System.out.println("How many marbles would you like to take?");
                    marbles = scan.nextInt();
                }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                myPile.decrease(marbles);
                System.out.println(myPile);
                while(myPile.keepPlaying() == true)
                {
                    player = 2;
                    computerMove();
                    System.out.println(myPile);
                    player = 1;      
                    if(avalMarbles() > 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println(myPile);
                    }
                    else if(avalMarbles() == 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles != 1);
                        myPile.decrease(marbles);
                        System.out.println(myPile);
                        if(player == 1)
                        {
                            System.out.println("Computer wins!");
                        }
                        else
                        {
                            System.out.println("You won!");
                        }
                        break;
                    }
                }
            }
            else if(firstPlayer == 2)
            {
                player = 2;
                //System.out.println(myPile);
                computerMove();
                System.out.println(myPile);
                player = 1;
                while(myPile.keepPlaying() == true)
                {
                    player = 1;
                    if(avalMarbles() > 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println(myPile);
                        player = 2;
                        computerMove();
                        System.out.println(myPile);
                    }
                    else if(avalMarbles() == 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles != 1);
                        myPile.decrease(marbles);
                        System.out.println(myPile);
                        if(player == 1)
                        {
                            System.out.println("Computer wins!");
                        }
                        else
                        {
                            System.out.println("You won!");
                        }
                        break;
                    }

                }

            }
        }
        else if(playNum == 2)
        {
            if(firstPlayer == 1)
            {
                player = 1;
                System.out.println(myPile);
                while(myPile.keepPlaying() == true)
                {
                    //System.out.println(myPile);
                    if(avalMarbles() > 1)
                    {
                        player = 1;
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                        player = 2;
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                    }
                    else if(avalMarbles() == 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles != 1);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                        if(player == 1)
                        {
                            System.out.println("Player: " + 2 + " wins!");
                        }
                        else
                        {
                            System.out.println("Player: " + 1 + " wins!");
                        }
                    }
                }
            }
            else if(firstPlayer == 2)
            {
                player = 2;
                System.out.println(myPile);
                while(myPile.keepPlaying() == true)
                {
                    //System.out.println(myPile);
                    if(avalMarbles() > 1)
                    {
                        player = 1;
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                        player = 2;
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles > myPile.getMarbles() / 2 || marbles <= 0);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                    }
                    else if(avalMarbles() == 1)
                    {
                        do
                        {
                            System.out.println("How many marbles would you like to take?");
                            marbles = scan.nextInt();
                        }while(marbles != 1);
                        myPile.decrease(marbles);
                        System.out.println("Player: " + player + " took " + marbles + " marbles");
                        System.out.println(myPile);
                        if(player == 1)
                        {
                            System.out.println("Player: " + 2 + " wins!");
                        }
                        else
                        {
                            System.out.println("Player: " + 1 + " wins!");
                        }
                    }
                }
            }
        }
    }

    public int avalMarbles()
    {
        return(myPile.getMarbles());
    }

    public void computerMove()
    {
        if(mode == 0)
        {
            if(avalMarbles() > 3)
            {                
                int take = (int)(Math.random() * myPile.getMarbles() / 2) + 1;
                myPile.decrease(take);
                System.out.println("The computer took: " + take + " marbles");
            }
            else if(avalMarbles() <= 3)
            {
                myPile.decrease(1);
                System.out.println("The computer took: " + 1 + " marbles");
                if(avalMarbles() == 0)
                    System.out.println("You Win!");
            }
        }
        else if(mode == 1)
        {
            int move = (int)(Math.random() * 2);
            if(move == 0)
            {
                if(avalMarbles() > 3)
                {                
                    int take = (int)(Math.random() * myPile.getMarbles() / 2) + 1;
                    myPile.decrease(take);
                    System.out.println("The computer took: " + take + " marbles");
                }
                else if(avalMarbles() <= 3)
                {
                    myPile.decrease(1);
                    System.out.println("The computer took: " + 1 + " marbles");
                    if(avalMarbles() == 0)
                        System.out.println("You Win!");
                }
            }
            else if(move == 1)
            {
                int take = avalMarbles() - ((int)(Math.pow(2,((int)(Math.log(avalMarbles()) / Math.log(2)))) - 1));
                if(avalMarbles() <= 3)
                {
                    myPile.decrease(1);
                    System.out.println("The computer took: 1 marble");
                    if(avalMarbles() == 0)
                    {
                        System.out.println("The user won!");
                    }
                }
                else if(take > avalMarbles()/2)
                {
                    take = (int)(Math.random() * myPile.getMarbles() / 2) + 1;
                    myPile.decrease(take);
                    System.out.println("The computer took: " + take + " marbles");
                }
                else
                {
                    myPile.decrease(take);
                    System.out.println("The computer took: " + take + " marbles");
                }
            }
        }
        else if(mode == 2)
        {
            int take = avalMarbles() - ((int)(Math.pow(2,((int)(Math.log(avalMarbles()) / Math.log(2)))) - 1));
            if(avalMarbles() <= 3)
            {
                myPile.decrease(1);
                System.out.println("The computer took: 1 marble");
                if(avalMarbles() == 0)
                {
                    System.out.println("The user won!");
                }
            }
            else if(take > avalMarbles()/2)
            {
                take = (int)(Math.random() * myPile.getMarbles() / 2) + 1;
                myPile.decrease(take);
                System.out.println("The computer took: " + take + " marbles");
            }
            else
            {
                myPile.decrease(take);
                System.out.println("The computer took: " + take + " marbles");
            }
        }
    }
}
