
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
        int[] r1 = {50, 50, 20, 80, 53};
        int[] r2 = {20, 50, 50, 53, 80};
        int[] r3 = {20, 50, 50, 80};
        
        StudentRecord a1 = new StudentRecord(r1);
        StudentRecord a2 = new StudentRecord(r2);
        StudentRecord a3 = new StudentRecord(r3);
        
        System.out.println(a1.finalAverage());
        System.out.println(a2.finalAverage());
        System.out.println(a3.finalAverage());
    }
}
