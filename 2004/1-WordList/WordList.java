import java.util.ArrayList;
/**
 * Write a description of class WordList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordList
{
    private ArrayList myList;
    
    public WordList(ArrayList pullList)
    {
        this.myList = pullList;
    }
    
    public int numWordsOfLength(int len)
    {
        int counter = 0;
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i).length() == len)
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
            if(myList.get(i).length() == len)
            {
                myList.remove(i);
                i-=1;
            }
        }
    }
}
