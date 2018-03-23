
/**
 * Vehicle class is set up to find the total dealer cost of any vehicle and
 * then sends it to TaxableItem to add the tax and recieve the full list Price
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class Vehicle extends TaxableItem
{
    //Field(s)
    private double dealerCost = 0;
    private double dealerMarkup = 0;
    
    //Constructor(s
    /**
     * @param dealerCost  cost the dealer sets on the vehicle
     * @param dealerMarkup  cost on the car the dealer wants to add to vehicles cost
     * @param taxRate  the tax of whichever state your in
     */
    public Vehicle(double dealerCost, double dealerMarkup,double taxRate)
    {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }
    
    //Method(s)
    /**
     * @return the list price without the tax included
     */
    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }
    
    /**
     * Changes the dealer markup price
     * @param amount  the amount you want to change the dealer markup to be
     */
    public void changeMarkup(double amount)
    {
        dealerMarkup = amount;
    }
}
