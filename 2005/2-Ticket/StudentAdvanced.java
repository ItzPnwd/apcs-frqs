
/**
 * Write a description of class StudentAdvanced here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvanced extends Advanced
{  
    public StudentAdvanced(int day)
    {
        super(day);
    }
    
    public double getPrice()
    {
        return (super.getPrice() / 2);
    }
}
