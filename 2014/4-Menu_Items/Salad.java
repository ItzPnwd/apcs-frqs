
/**
 * description of class Salad.
 *
 * @author Sean Donlin
 * @version 4/20/18
 */
public class Salad implements MenuItem
{
    private String salad;
    private double cost;
    
    public Salad(String salad, double cost)
    {
        this.salad = salad;
        this.cost = cost;
    }
    
    public String getName()
    {
        return salad;
    }
    
    public double getPrice()
    {
        return cost;
    }
}
