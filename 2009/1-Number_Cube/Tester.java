
/**
 * Write a description of class Tester here.
 *
 * @author Sean Donlin
 * @version JavaDoc Added 3/5/18 ~Still needs Tester
 */
import java.util.Arrays;
public class Tester
{
    
    /** Returns an array of the values obtained by tossing a number cube numTosses times.
     *  @param cube a NumberCube
     *  @param numTosses the number of tosses to be recorded
     *         Precondition: numTosses > 0
     *  @return an array of numTosses values
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses)
    {
        int[] tosses = new int[numTosses];
        for(int i = 0; i < numTosses; i++)
        {
            tosses[i] = cube.toss();
        }
        return tosses;
    }
    
    /** Returns the starting index of a longest run of two or more consecutive repeated values
     * in the array values.
     * @param values an array of integer values representing a series of number cube tosses
     *        Precondition: values.length > 0
     * @return the starting index of a run of maximum size;
     *         -1 if there is no run
     */
    public static int getLongestRun(int[] values)
    {
        int longestRun = -1;
        int run = 0;
        for(int i = 0; i < values.length - 1; i ++)
        {
            if(values[i] == values[i+1])
            {
                run ++;
                if (run > longestRun)
                {
                    longestRun = run;
                }
            }        
            else{
                run = 0;
            }
        }
        return longestRun + 1;
    }
    
    public static void main(String[] args)
    {
        NumberCube die1 = new NumberCube();
        
        int[] rolls = getCubeTosses(die1, 10);
        System.out.println(Arrays.toString(rolls));
        int run = getLongestRun(rolls);
        System.out.println(run);
        
        System.out.println();
        
        int[] rolls2 = {7,7,7,7,1,2,3,4,5,6,9,9,9,9,9,9,9,9,6,7,2};
        System.out.println(Arrays.toString(rolls2));
        int run2 = getLongestRun(rolls2);              
        System.out.println(run2);
    }
}
