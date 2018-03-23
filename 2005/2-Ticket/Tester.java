
/**
 * This class test the Abstract class Ticket and classes that extend to it.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrgggsss)
    {
        WalkUp w1 = new WalkUp();
        Advanced a1 = new Advanced(5);
        Advanced a2 = new Advanced(10);
        StudentAdvanced sa1 = new StudentAdvanced(9);
        StudentAdvanced sa2 = new StudentAdvanced(12);
        
        w1.toString();
        a1.toString();
        a2.toString();
        sa1.toString();
        sa2.toString();
    }
}
