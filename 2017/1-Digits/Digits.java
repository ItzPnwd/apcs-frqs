import java.util.ArrayList;
/**
 * Write a description of class Digits here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class Digits
{
    private ArrayList<Integer> digitList;
    
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        
        int remainder = 0;
        
        while(num > 0)
        {
            remainder = num % 10;
            digitList.add(remainder);
            num = num /10;
        }
    }
    
    public boolean isStrictlyIncreasing()
    {
        boolean increase = true;
        for(int i = 0; i < digitList.size()-1; i++)
        {
            if(digitList.get(i) < digitList.get(i+1))
            {
                increase = false;
            }
        }
        return increase;
    }
}
