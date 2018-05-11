
/**
 * description of class Trio.
 *
 * @author Sean Donlin
 * @version 4/20/18
 */
public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Drink drink;
    private Salad salad;
    /** Constructor for the Trio Class
     * @param sandwich  the sandwhich for this trio
     * @param salad  The salad for this trio
     * @param drink  the drink for this trio
     */
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    /**
     *  @return  returns the contents of the trio
     */
    public String getName()
    {
        return sandwich.getName() + " / " + salad.getName() + " / " + drink.getName() + "Trio";
    }
    
    /**
     *  @returns the price of the trio
     */
    public double getPrice()
    {
        double p1 = sandwich.getPrice();
        double p2 = salad.getPrice();
        double p3 = drink.getPrice();
        
        double total = p1 + p2 + p3;
        double lowest = Math.min(p1,Math.min(p2,p3));
        
        return total - lowest;
    }
}
