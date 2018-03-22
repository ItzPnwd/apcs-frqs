
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{
    //Field(s)
    private double dealerCost = 0;
    private double dealerMarkup = 0;
    
    //Constructor(s)
    public Vehicle(double dealerCost, double dealerMarkup,double taxRate)
    {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }
    
    //Method(s)
    public double getListPrice()
    {
        return dealerCost + dealerMarkup;
    }
    
    public void changeMarkup(double amount)
    {
        dealerMarkup = amount;
    }
}
