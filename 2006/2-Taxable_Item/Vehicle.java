
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
    private double taxRate = 0;
    
    //Constructor(s)
    public Vehicle(double dealerCost, double dealerMarkup,double taxRate)
    {
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
        this.taxRate = taxRate;
    }
    
    //Method(s)
    public double getListPrice()
    {
        return 
    }
    
    public void changeMarkup(double amount)
    {
        dealeMarkup = amount;
    }
}
