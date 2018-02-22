import java.util.ArrayList;
/**
 * Write a description of class StudentAnswerSheet here.
 *
 * @author Sean Donlin
 * @version 2/16/18
 */
public class StudentAnswerSheet
{
    private ArrayList<String> answers;
    private String name;
    public StudentAnswerSheet(String name,ArrayList pullList)
    {
        this.name = name;
        this.answers = pullList;
    }
    
    public double getScore(ArrayList<String> key)
    {
        int correct = 0;
        int wrong = 0;
        
        for(int i = 0; i < key.size(); i++)
        {
            if(answers.get(i) == key.get(i))
            {
                correct ++;
            }
            if(answers.get(i) != "?"&& answers.get(i) != key.get(i))
            {
                wrong ++;
            }
        }
        return correct - 0.25 * wrong;
    }
    
    public String getName()
    {
        return name;
    }
}