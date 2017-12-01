
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        StudentRecord a1 = new StudentRecord(50);
        StudentRecord a2 = new StudentRecord(50);
        StudentRecord a3 = new StudentRecord(20);
        StudentRecord a4 = new StudentRecord(80);
        StudentRecord a5 = new StudentRecord(53);
        
        StudentRecord[] allGrades = {a1, a2, a3, a4, a5};
        
        StudentRecord group = new StudentRecord(allGrades);
    }
}
