
/**
 * Write a description of class StudentRecord here.
 *
 * @author Sean Donlin
 * @version 11/15/17
 */
public class StudentRecord
{
    //fields
    private int[] scores; //contains scores.length values
                          //scores.length > 1
                          
    //Constructor(s)
    public StudentRecord(int[] records)
    {
        this.scores = records;
    }
    
    //Methods
    /**
     * @return the average (arithmetic means) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     */
    //Tested 12/1/17 ~ Working
        private double average(int first, int last)
     {
         double sum = 0;
         for (int i = first; i <= last; i++)
         {
             sum += scores[i];
         }
         return sum/((last - first) + 1);
     }
    
    /**
     * @return true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * 
     */
    //Tested 12/1/17 ~ Working
    public boolean hasImproved()
    {
        for(int i = 0; i < scores.length - 1; i++)
        {
            if(scores[i] > scores[i+1])
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * if the values in scores have improved,
     * @return the average of the elements in scores with indexes greater than or equal
     * to scores.length/2;
     * otherwise, returns the average of all of the values in scores
     */
    //Tested 12/1/17 ~ Working
    public double finalAverage()
    {
        int first = 0;
        int last = scores.length - 1;
        
        if(hasImproved())
        {
            int middle = scores.length/2;
            return average(middle,last);
        }
        else{
            return average(first,last);
        }
    }
}
