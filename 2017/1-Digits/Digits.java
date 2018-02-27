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
        int remainder = 0;
        int number = num;
        
        while(num > 0)
        {
            remainder = number % 10;
            digitList.add(remainder);
            number = number /10;
        }
    }
    
    public boolean isStrictlyIncreasing()
    {
        boolean increase = true;
        for(int i = 0; i <= digitList.size(); i++)
        {
            if(digitList.get(i) >= digitList.get(i+1))
            {
                increase = false;
            }
        }
        return increase;
    }
}
