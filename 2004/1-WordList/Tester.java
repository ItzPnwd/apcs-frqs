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
        r1.add("cat");
        r1.add("mouse");
        r1.add("frog");
        r1.add("dog");
        r1.add("dog");
        
        ArrayList<String> r3 = new ArrayList<String>();
        r1.add("cat");
        r1.add("mouse");
        r1.add("frog");
        r1.add("dog");
        r1.add("dog");
        
        ArrayList<String> r4 = new ArrayList<String>();
        r1.add("cat");
        r1.add("mouse");
        r1.add("frog");
        r1.add("dog");
        r1.add("dog");
              
        WordList a1 = new WordList(r1);
        WordList a2 = new WordList(r2);
        WordList a3 = new WordList(r3);
        WordList a4 = new WordList(r4);
        
        System.out.println(a1.numWordsOfLength(4));
        System.out.println(a1.numWordsOfLength(3));
        System.out.println(a1.numWordsOfLength(2));
        
        a2.removeWordsOfLength(4);
        System.out.println(a2);
        a3.removeWordsOfLength(3);
        System.out.println(a3);
        a4.removeWordsOfLength(2);
        System.out.println(a4);
    }
}
