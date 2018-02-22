import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 *
 * @author Sean Donlin
 * @version 2//2018
 */
public class Tester
{
    public static void main(String[]arrrrrrrrrrrrrrrrrrrrrrrrggggggggggggggggsssssssssssssssss)
    {
        ArrayList<String> Key = new ArrayList<String>();
        Key.add("A");
        Key.add("C");
        Key.add("D");
        Key.add("E");
        Key.add("B");
        Key.add("C");
        Key.add("E");
        Key.add("B");
        Key.add("B");
        Key.add("C");
        
        ArrayList<String> Dave = new ArrayList<String>();
        Dave.add("A");
        Dave.add("B");
        Dave.add("D");
        Dave.add("E");
        Dave.add("A");
        Dave.add("C");
        Dave.add("?");
        Dave.add("B");
        Dave.add("D");
        Dave.add("C");
        
        ArrayList<String> Blake = new ArrayList<String>();
        Blake.add("A");
        Blake.add("C");
        Blake.add("D");
        Blake.add("E");
        Blake.add("B");
        Blake.add("C");
        Blake.add("E");
        Blake.add("B");
        Blake.add("B");
        Blake.add("C");
        
        ArrayList<String> Andrew = new ArrayList<String>();
        Andrew.add("B");
        Andrew.add("C");
        Andrew.add("?");
        Andrew.add("E");
        Andrew.add("A");
        Andrew.add("?");
        Andrew.add("D");
        Andrew.add("B");
        Andrew.add("?");
        Andrew.add("C");
        
        StudentAnswerSheet AndrewsSheet = new StudentAnswerSheet("Andrew", Andrew);
        StudentAnswerSheet BlakesSheet = new StudentAnswerSheet("Blake", Blake);
        StudentAnswerSheet DavesSheet = new StudentAnswerSheet("Dave", Dave);
        
        ArrayList<StudentAnswerSheet> sheets = new ArrayList<StudentAnswerSheet>();
        sheets.add(AndrewsSheet);
        sheets.add(BlakesSheet);
        sheets.add(DavesSheet);
        
        TestResults results = new TestResults(sheets);
        
        System.out.println(results.highestScoringStudent(Key));
        System.out.println(BlakesSheet.getScore(Key));
        System.out.println(AndrewsSheet.getScore(Key));
        System.out.println(DavesSheet.getScore(Key));
    }
}
