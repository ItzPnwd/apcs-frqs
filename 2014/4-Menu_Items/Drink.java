
/**
 * description of class Drink.
 *
 * @author Sean Donlin
 * @version 4/20/18
 */
public class Drink implements MenuItem
{
    private String drink;
    private double cost;
    /**
     *  @param drink  the name of the drink
     *  @param cost  the cost of the drink
     */
    public Drink(String drink, double cost)
    {
        this.drink = drink;
        this.cost = cost;
    }
    
    /**
     * @return the name of the drink
     */
    public String getName()
    {
        return drink;
    }
    
    /**
     * @return the price of the drink
     */
    public double getPrice()
    {
        return cost;
    }
}
