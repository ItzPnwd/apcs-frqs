
/**
 * This class is for those who order their tickets in advanced and are a student
 * It will return the price of how much the tickets cost which is half of what
 * the normal advanced tickets cost depending on how far out you order the tickets
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class StudentAdvanced extends Advanced
{  
    //Constructor(s)
    /**
     * @param day  number of days in advanced the student orders
     * his tickets
     */
    public StudentAdvanced(int day)
    {
        super(day);
    }
    
    //Method(s)
    /**
     * @return  returns the price of a ticket for a student
     */
    public double getPrice()
    {
        return (super.getPrice() / 2);
    }
    
    /**
     * @return  returns an additional string to note that a student ID
     * is required to purchase this ticket
     */
    public String toString()
    {
        return super.toString() + "\n(Student ID required)";
    }
}
