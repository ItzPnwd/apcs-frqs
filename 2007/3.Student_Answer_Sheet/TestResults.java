import java.util.ArrayList;
/**
 * Write a description of class TestResults here.
 *
 * @author Sean Donlin
 * @version 12/20/2018
 */
public class TestResults
{
    private ArrayList<StudentAnswerSheet> Sheets;
    
    public String highestScoringStudent(ArrayList<String> Key)
    {
        String name = Sheets.get(0).getName();
        Double highScore = Sheets.get(0).getScore(Key);
        
        for(int i = 1; i <= Sheets.size();i++)
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
