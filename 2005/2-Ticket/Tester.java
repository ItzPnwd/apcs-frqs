
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
        
        System.out.println(w1.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(sa1.toString());
        System.out.println(sa2.toString());
    }
}
