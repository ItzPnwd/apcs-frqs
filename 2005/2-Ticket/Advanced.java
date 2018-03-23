
/**
 * Write a description of class Advanced here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Advanced extends Ticket
{
    private double price = 30.0;
    private int date;
    
    public Advanced(int days)
    {
        this.date = days;
    }
    
    public double getPrice()
    {
        if(date <= 9)
        {
            price = 40.0;
        }        
        return price;
    }
}
