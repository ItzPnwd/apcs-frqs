import java.util.ArrayList;
/**
 * Write a description of class TestResults here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestResults
{
    private ArrayList<StudentAnswerSheet> Sheets;
    
    public String highestScoringStudent(ArrayList<String> Key)
    {
        String name = Sheets.get(0).getName;
        Double highScore = Sheets.get(0).getScore;
        
        for(int i = 1; i <= Sheets.size();i++)
        {
            double score = Sheets.get(i).getScore;
            if(score > highScore)
            {
                name = Sheets.get(i).getName;
                highScore = Score;
            }
        }
        return name;
    }
}
