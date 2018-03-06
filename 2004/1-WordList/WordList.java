import java.util.ArrayList;
/**
 * Uses ArrayLists to create a list of words that will now in turn count
 * the ammount of words with a set length or remove words with a certain
 * length
 * 
 * @author Sean Donlin
 * @version JavaDoc Added 3/5/18
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
    //@param len the length of letters in the word it is searching for in the WordList
    //@return number of words in this WordList that are exactly the set number(len) letters long
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
    //@param len the length of letters in the word it is searching to remove.
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
    
    //@return the WordList
    public String toString()
    {
        return myList.toString();
    }
}
