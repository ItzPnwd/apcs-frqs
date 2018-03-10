import java.util.ArrayList;
/**
 * Uses a number, puts into an ArrayList of integers and able to be
 * tested if it is strictly increasing
 *
 * @author Sean Donlin
 * @version JavaDoc Added 3/9/18
 */
public class Digits
{
    /** The list of digits from the number used to construct this object.
     *  The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;
    
    //Constructor(s)
    /** Constructs a Digit object that represents num.
     *  Precondition: num >= 0
     */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        
        int remainder = 0;
        
        if(num == 0)
        {
            digitList.add(0);
        }
        
        while(num > 0)
        {
            remainder = num % 10;
            digitList.add(remainder);
            num = num /10;
        }
    }
    
    /** Returns true if the digits in this Digits object are in strictly increasing order.
     *          false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        boolean increase = true;
        for(int i = 0; i < digitList.size()-1; i++)
        {
            if(digitList.get(i) <= digitList.get(i+1))
            {
                increase = false;
            }
        }
        return increase;
    }
}
