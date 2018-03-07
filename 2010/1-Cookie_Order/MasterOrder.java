import java.util.ArrayList;
/**
 * Write a description of class MasterOrder here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class MasterOrder
{
    /** The list of all cookie orders */
    private ArrayList<CookieOrder> orders;
    
    //Constructor(s)
    /** Constructs a new MasterOrder object. */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    /** Adds theOrder to the master order
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    /** @return the sum of the number of boxes of all of the cookie orders 
     */
    public int getTotalBoxes()
    {
        int sum = 0;
        for(int i = 0; i < orders.size(); i++)
        {
            sum += orders.get(i).getNumBoxes();
        }
        return sum;
    }
    
    /** Removes all cookie orders from the master order that have the same variety of 
     *  cookie as cookieVar and returns the total number of boxes that were removed.
     *  @param cookieVar the variety of cookies to remove from the master order
     *  @return the total number of boxes of cookievar in the cookie orders removed
     */
    public int removeVariety(String cookieVar)
    {
        int sum = 0;
        for(int i = 0; i < orders.size(); i++)
        {
            if(cookieVar == orders.get(i).getVariety())
            {
                sum += orders.get(i).getNumBoxes();
                orders.remove(i);
                i -= 1;
            }
        }
        System.out.println(sum + " boxes of " + cookieVar + " removed.");
        return sum;
    }
}
