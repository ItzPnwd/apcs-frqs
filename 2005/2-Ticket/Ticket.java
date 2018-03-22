
/**
 * Abstract class Ticket - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Ticket
{
    private int serialNumber;
    
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    public abstract double getPrice();
    
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    private static int getNextSerialNumber()
    {
        
    }
}
