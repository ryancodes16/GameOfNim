
/**
 * Write a description of class Pile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pile 
{
    private int marbles;
    public Pile(int num)
    {
        this.marbles = num;
    }
    public void decrease(int num)
    {
        this.marbles -= num;
    }
    public int getMarbles()
    {
        return(this.marbles);
    }
    public boolean keepPlaying()
    {
        if(this.marbles >= 1)
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    public String toString()
    {
        return("Marbles left: " + this.marbles);
    }
}
