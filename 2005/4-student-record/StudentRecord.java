
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
    
    private double average(int first, int last)
     {
         int sum = 0;
         for (int i = first; i <= last; i++)
         {
             sum = scores[i] + scores[i+1];
         }
         return sum/scores.length;
     }
    
    private boolean hasImproved()
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
