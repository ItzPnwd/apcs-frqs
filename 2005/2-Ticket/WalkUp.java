
/**
 * This class sends a value to Ticket for a ticket purchased on the night of the
 * show
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class WalkUp extends Ticket
{
    //Field(s)
    private double price;//Price for a ticket
    
    //Method(s)
    /**
     * @return  returns the price for a ticket the night of the show
     */
    public double getPrice()
    {
        price = 50.0;
        return price;
    }
}
