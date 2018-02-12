import java.util.ArrayList;
/**
 * Write a description of class WordList here.
 *
 * @author Sean Donlin
 * @version 2/12/18
 */
public class WordList
{
    private ArrayList<String> myList; //contains Strings made up of letters
    
    public WordList(ArrayList pullList)
    {
        this.myList = pullList;
    }
    
    //postcondition: returns the number of words in this WordList that
    //               are exactly len letters long
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
    
    //postcondition: all words that are exactly len letters long
    //               have been removed from this WordList, with the
    //               order of the remaining words unchanged
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
