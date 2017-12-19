
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class Tester
{
    public static void main(String[] arrrgggsss)
    {
        System.out.println(SelfDivisor.isSelfDivisor(128));
        System.out.println(SelfDivisor.isSelfDivisor(26));
        
        System.out.println(Arrays.toString(SelfDivisor.firstNumSelfDivisors(10,3)));        
    }
}
