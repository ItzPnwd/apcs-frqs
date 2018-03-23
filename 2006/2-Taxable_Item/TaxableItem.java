
/**
 * Abstract class TaxableItem - Class that adds tax to the vehicle price
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public abstract class TaxableItem implements Item
{
    //Field(s)
    private double taxRate;//The tax rate of a state
    
    //Constructor(s)
    /**
     * @param rate  the tax rate of a state
     */
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    //Method(s)
    /**
     * Gets the list price of an item before the tax is added from the vehicle class
     */
    public abstract double getListPrice();
    
    /**
     * Finds the total price of a taxable item
     * @return  Returns the total price including tax added
     */
    public double purchasePrice()
    {
        return getListPrice() + (taxRate * getListPrice());
    }
}
