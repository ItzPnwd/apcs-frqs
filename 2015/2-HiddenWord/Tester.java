
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrrggggs)
    {
        String a1 = "HARPS";
        
        HiddenWord t1 = new HiddenWord(a1);
        
        System.out.println(t1.getHint("AAAAA"));
        System.out.println(t1.getHint("HELLO"));
        System.out.println(t1.getHint("HEART"));
        System.out.println(t1.getHint("HARMS"));
        System.out.println(t1.getHint("HARPS"));
    }
}
