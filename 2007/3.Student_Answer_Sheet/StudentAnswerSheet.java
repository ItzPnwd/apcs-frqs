import java.util.ArrayList;
/**
 * Uses ArrayList to make a list of students answers on a test, grades them and returns there
 * score and uses a seperate method to get the name of that sheet.
 *
 * @author Sean Donlin
 * @version JavaDoc Added 3/5/18
 */
public class StudentAnswerSheet
{
    private ArrayList<String> answers; //the list of the student's answers
    private String name; //the name of the student's answers
    
    //Constructor(s)
    /**
     * @param name  name of the students answer sheet
     * @param pullList  answers on the student's answer sheet
     */
    public StudentAnswerSheet(String name,ArrayList pullList)
    {
        this.name = name;
        this.answers = pullList;
    }
    
    //Method(s)
    /** @param key the list of correct answers, represented as strings of length one
     *         Precondition: key.size() is equal to the number of answers in this answer sheet
     *  @return this student's test score
     */
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
    
    /** @return the name of the student 
     */
    public String getName()
    {
        return name;
    }
}