
/**
 * Write a description of class SelfDivisor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelfDivisor
{
    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *          false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        int temp = number;
        while(temp > 0)
        {
            temp = number % 10;
            if(number % temp != 0)
            {
                return false;
            }
            else
            {
                temp /= 10;
            }
        }
        return true;
    }
    
    /** @param start starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num integers >= start that are self-devisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int [] included = new int[num];
        int j = 0;
        for(int i = start; i == included.length; i++)
        {
            if(isSelfDivisor(i) == true)
            {
                included[j] = i;
                j++;
            }
        }
        return included;
    }
    
}
