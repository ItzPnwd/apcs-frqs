
/**
 * Items that are non taxable are here meaning this is a very useless class,
 * go look up the prices smh
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class NonTaxableItem implements Item
{
    //Field(s)
    private String item;//name of the item
    private double cost;//cost of the item
    
    
    //Constructor(s)
    /**
     * @param item  the item name
     * @param cost  the item cost
     */
    public NonTaxableItem(String item, double cost)
    {
        this.item = item;
        this.cost = cost;
    }
    
    //Method(s)
    /**returns the purchase price of the nonTaxable item */
    public double purchasePrice()
    {
        return cost;
    }
    
    /** toString method to make the output on the console look beautiful */
    public String toString()
    {
        return "Item: " + item + "\nPrice" + purchasePrice();
    }
}
