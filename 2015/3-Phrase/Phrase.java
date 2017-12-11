
/**
 * Write a description of class Phrase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phrase
{
    //fields
    private String currentPhrase;
    
    //Constructor(s)
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    
    /**Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n)
    {
        
    }
    
    /**Modifies the current phrase by replacing the nth occurrence of str with repl.
     * If the nth occurrence does not exist, the current phrase is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int location = currentPhrase.findNthOccurrence(str,n);
        if(location != -1)
        {
            String start = currentPhrase.substring(0,location);
            String mid = repl;
            String end = currentPhrase.substring(location + str.length());
            
            String currentPhrase = start + mid + end;
        }
    }
    
    /**Returns the index of the last occurrence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        int n = 1;
        int occurs = findNthOccurrence(str,n);
        
        while(occurs != -1)
        {
            n++;
        }
        if(n > 1)
        {
            n -=1;
        }
        
        return currentPhrase.findNthOccurrence(str,n);
    }
    
    /** Returns a string containing the current phrase. */
    public String toString()
    {
        return currentPhrase;
    }
}
