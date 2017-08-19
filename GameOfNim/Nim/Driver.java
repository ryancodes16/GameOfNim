import java.util.Scanner;
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        String ans = "";
        Scanner scan = new Scanner(System.in);
        int play = 0;
        do
        {
            System.out.println("Do you want to play Nim? [yes/no]");
            ans = scan.nextLine();
        }while(! ans.equalsIgnoreCase("yes") && ! ans.equalsIgnoreCase("no"));
        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Starting game");
            int marbles = (int)(Math.random() * 91) + 10;
            do
            {
                System.out.println("How many people shall play?");
                play = scan.nextInt();
            }while(play <= 0 || play > 2);
            Game myGame = new Game(marbles, play);
        }
    }
}
