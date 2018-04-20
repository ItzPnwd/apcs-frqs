
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
    
    public Sandwich(String sandwich, double cost)
    {
        this.sandwich = sandwich;
        this.cost = cost;
    }
    
    public String getName()
    {
        return sandwich;
    }
    
    public double getPrice()
    {
        return cost;
    }
}
