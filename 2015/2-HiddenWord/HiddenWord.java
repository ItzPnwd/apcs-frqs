
/**k
 * Write a description of class HiddenWord here.
 *
 * @author Sean Donlin
 * @version IP:12/12/17
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
