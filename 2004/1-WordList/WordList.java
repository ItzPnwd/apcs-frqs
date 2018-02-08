import java.util.ArrayList;
/**
 * Write a description of class WordList here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class WordList
{
    private ArrayList<String> myList;
    
    public WordList(ArrayList pullList)
    {
        this.myList = pullList;
    }
    
    public int numWordsOfLength(int len)
    {
        int counter = 0;
        for(String i : myList)
        {
            if(i.length() == len)
            {
                counter++;
            }
        }
        return counter;
    }
    
    public void removeWordsOfLength(int len)
    {
        for(int i = 0; i < myList.size(); i++)
        {
            String word = myList.get(i);
            if(word.length() == len)
            {
                myList.remove(i);
                i-=1;
            }
        }
    }
    
    public String toString()
    {
        return myList.toString();
    }
}
