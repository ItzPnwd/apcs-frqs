import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrrrgggggggggggsssssss)
    {
        ArrayList<String> r1 = new ArrayList<String>();
        r1.add("cat");
        r1.add("mouse");
        r1.add("frog");
        r1.add("dog");
        r1.add("dog");
        
        ArrayList<String> r2 = new ArrayList<String>();
        r2.add("cat");
        r2.add("mouse");
        r2.add("frog");
        r2.add("dog");
        r2.add("dog");
        
        ArrayList<String> r3 = new ArrayList<String>();
        r3.add("cat");
        r3.add("mouse");
        r3.add("frog");
        r3.add("dog");
        r3.add("dog");
        
        ArrayList<String> r4 = new ArrayList<String>();
        r4.add("cat");
        r4.add("mouse");
        r4.add("frog");
        r4.add("dog");
        r4.add("dog");
              
        WordList a1 = new WordList(r1);
        WordList a2 = new WordList(r2);
        WordList a3 = new WordList(r3);
        WordList a4 = new WordList(r4);
        
        System.out.println(a1.numWordsOfLength(4));
        System.out.println(a1.numWordsOfLength(3));
        System.out.println(a1.numWordsOfLength(2));
        
        a2.removeWordsOfLength(4);
        System.out.println(a2);
        a2.removeWordsOfLength(3);
        System.out.println(a2);
        a2.removeWordsOfLength(2);
        System.out.println(a2);
    }
}
