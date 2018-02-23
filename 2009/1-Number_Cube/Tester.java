
/**
 * Write a description of class Tester here.
 *
 * @author Sean Donlin
 * @version 2/23/18
 */
public class Tester
{
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] tosses = new int[numTosses-1];
        for(int i = 0; i <= numTosses; i++)
        {
            tosses[i] = cube.toss();
        }
        return tosses;
    }
    
    public static int getLongestRun(int[] values)
    {
        int longestRun = 0;
        int run = 0;
        for(int i = 0; i < values.length; i ++)
        {
            if(values[i] == values[i+1])
            {
                run ++;
            }
            else
            {
                if (run > longestRun)
                {
                    longestRun = run;
                }
                run = 0;
            }            
        }
        return longestRun;
    }
    
    public static void main(String[] args)
    {
        
    }
}
