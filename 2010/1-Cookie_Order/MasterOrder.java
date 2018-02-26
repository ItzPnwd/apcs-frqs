import java.util.ArrayList;
/**
 * Write a description of class MasterOrder here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    public int getTotalBoxes()
    {
        int sum = 0;
        for(int i = 0; i < orders.size(); i++)
        {
            sum += orders.get(i).getNumBoxes();
        }
        return sum;
    }
    
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
        return sum;
    }
}
