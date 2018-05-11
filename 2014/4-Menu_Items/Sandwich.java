
/**
 * description of class Sandwich.
 *
 * @author Sean Donlin
 * @version 4/20/18
 */
public class Sandwich implements MenuItem
{
    private String sandwich;
    private double cost;
    /**
     * @param sandwhich  typr of sandwich
     * @param cost  cost of the sandwich
     */
    public Sandwich(String sandwich, double cost)
    {
        this.sandwich = sandwich;
        this.cost = cost;
    }
    
    /**
     * @return the name of the sandwich
     */
    public String getName()
    {
        return sandwich;
    }
    
    /**
     * @return the price of the sandwich
     */
    public double getPrice()
    {
        return cost;
    }
}
