
/**k
 * Write a description of class HiddenWord here.
 *
 * @author Sean Donlin
 * @version Finished:1/2/2018
 */
public class HiddenWord
{
    //fields
    private String puzzle;
    
    //constructor(s)
    public HiddenWord (String puzzle)
    {
        this.puzzle = puzzle;
    }
    
    //method(s)
    /** @param guess  the word or phrased guessed
     *  @return a String containing the characters * to represent a letter that is not in the string,
     *  a + to represent the wrong placement of the letter and the letter itself if guessed position is correct.
     */
    public String getHint(String guess)
    {
        String result = "";
        for(int i = 0; i < guess.length(); i++)
        {
            String letter = puzzle.substring(i, i+1);
            String guessed = guess.substring(i, i+1);
            
            if(guessed.equals(letter))
            {
                result += letter;
            }
            else if(puzzle.indexOf(guessed) != -1)
            {
                result += "+";
            }
            else{
                result += "*";
            }
        }
        return result;
    }
}
