
/**
 * Abstract class Ticket - Abstract class that pulls from StudentAdvanced if the person is 
 * a student
 * This class gives the number of the ticket price of the ticket and any additional
 * information needed if necessary
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public abstract class Ticket
{
    //Field(s)
    private int serialNumber;//Number of the ticker(Completely random
    
    //Constructor(s)
    /**
     * Sets the next serial number for the ticket
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }
    
    //Method(s)
    /** Abstract method that is required in all other classes
     *  Retrieves the price of a ticket from subclasses
     */
    public abstract double getPrice();
    
    /**
     * @return  returns a display of the ticket number and how much it cost
     */
    public String toString()
    {    
        return "Number: " + serialNumber + "\nPrice: " + getPrice();    
    }
    
    /**
     * @return  returns a random number from 1 to 999 for the ticket to use
     */
    private static int getNextSerialNumber()
    {
        return (int)( 999 * Math.random() + 1);
    }
}
