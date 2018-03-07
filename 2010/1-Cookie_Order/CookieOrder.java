
/**
 * Creates a cookie order to add to the master
 * order
 *
 * @author Sean Donlin
 * @version JavaDoc added 3/6/18
 */
public class CookieOrder
{
    private String variety; //Variety of the cookie order
    private int numBoxes; //Number of boxes in the cookie order
    
    //Constructor(s)
    /** Constructs a new CookieOrder object.
     */
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    //Method(s)
    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    {
        return variety;
    }
    
    /** @ return the number of boxes being ordered
     */
    public int getNumBoxes()
    {
        return numBoxes;
    }
}
