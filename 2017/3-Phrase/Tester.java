
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrrggggggs)
    {
        Phrase phrase1 = new Phrase("A cat ate late.");
        Phrase phrase2 = new Phrase("A cat ate late.");
        Phrase phrase3 = new Phrase("A cat ate late.");
        Phrase phrase4 = new Phrase("aaaa");
        Phrase phrase5 = new Phrase("aaaa");
        
        phrase1.replaceNthOccurrence("at", 1, "rane");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);
        System.out.println(phrase4);
        System.out.println(phrase5);
        
        phrase1.findLastOccurrence("at");
        phrase1.findLastOccurrence("cat");
        phrase1.findLastOccurrence("bat");
    }
}
