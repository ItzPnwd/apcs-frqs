
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
    
    /**
     * @param the name of the salad
     * @param the cost of the salad
     */
    public Salad(String salad, double cost)
    {
        this.salad = salad;
        this.cost = cost;
    }
    
    /**
     * @return  the name of the salad
     */
    public String getName()
    {
        return salad;
    }
    
    /**
     *  @return the price of the sandwich
     */
    public double getPrice()
    {
        return cost;
    }
}
