
/**
 * This class is extended from ticket which gets the set price for the ticket
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class Advanced extends Ticket
{
    //Field(s)
    private double price = 30.0;//Price of a ticket more than 9 days in advanced
    private int date;//The amount of days before the show
    
    //Constructor(s)
    /**
     *  @param days  the ammount of days till the show
     */
    public Advanced(int days)
    {
        this.date = days;
    }
    
    //Method(s)
    
    /**
     *  @return  returns the price depending on how many days there are until
     *           the concert
     */
    public double getPrice()
    {
        if(date <= 9)
        {
            price = 40.0;
        }        
        return price;
    }
}
