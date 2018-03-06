
/**
 * Class that simulates a die being tossed
 *
 * @author Sean Donlin
 * @version JavaDoc Added 3/5/18
 */
public class NumberCube
{
    
    /** @return an integer value between 1 and 6, inclusive 
     */
    public int toss()
    {
        return (int)(6 * Math.random() + 1);
    }
}
