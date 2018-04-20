
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
    
    public Drink(String drink, double cost)
    {
        this.drink = drink;
        this.cost = cost;
    }
    
    public String getName()
    {
        return drink;
    }
    
    public double getPrice()
    {
        return cost;
    }
}
