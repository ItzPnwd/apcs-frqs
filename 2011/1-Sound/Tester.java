
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrggggggssssss)
    {
        int[] a1 = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
        int[] a2 = {0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0};
        
        Sound s1 = new Sound(a1);
        Sound s2 = new Sound(a2);
        
        System.out.println(s1.limitAmplitude(2000));
        
        s2.trimSilenceFromBeginning();
        int[] trimmed = s2.getSamples();
        
        for(int i = 0; i < trimmed.length; i++)
        {
            System.out.println(trimmed[i]);
        }
    }
}
