
/**
 * Write a description of class Advanced here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Advanced extends Ticket
{
    private double price = 30.0;
    private int days;
    
    public Advanced(int days)
    {
        this.days = days;
    }
    
    public double getPrice()
    {
        if(days <= 9)
        {
            price = 40.0;
        }        
        return price;
    }
}
