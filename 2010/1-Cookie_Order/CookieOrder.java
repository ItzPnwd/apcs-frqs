
/**
 * Write a description of class CookieOrder here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class CookieOrder
{
    private String variety;
    private int numBoxes;
    
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }
    
    public String getVariety()
    {
        return variety;
    }
    
    public int getNumBoxes()
    {
        return numBoxes;
    }
}
