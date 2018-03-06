import java.util.ArrayList;
/**
 * Uses the StudentAnswerSheet Class to compare the scores of the students
 * to determine the highest scoring student
 *
 * @author Sean Donlin
 * @version JavaDoc Added 3/5/18
 */
public class TestResults
{
    private ArrayList<StudentAnswerSheet> Sheets;
    
    //Constructor(s)
    public TestResults(ArrayList pullList)
    {
        this.Sheets = pullList;
    }
    
    //Method(s)
    /** Precondition: sheets.size() > 0;
     *                sll answer sheets in sheets have the same number of answers
     *  @param key the list of correct answers represented as strings of length one
     *         Precondition: key.size() is equal to the number of answers
     *                       in each of the answer sheets in sheets
     *  @return the name of the student with the highest score
     */
    public String highestScoringStudent(ArrayList<String> Key)
    {
        String name = Sheets.get(0).getName();
        Double highScore = Sheets.get(0).getScore(Key);
        
        for(int i = 1; i < Sheets.size();i++)
        {
            double score = Sheets.get(i).getScore(Key);
            if(score > highScore)
            {
                name = Sheets.get(i).getName();
                highScore = score;
            }
        }
        return name;
    }
    
}
