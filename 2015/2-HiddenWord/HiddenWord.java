
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
            String letter = puzzle.charAt(i);
            String guessed = guess.charAt(i);
            
            if(guess.charAt(i).equals(puzzle.charAt(i)))
            {
                result += guess.charAt(i);
            }
            else if(puzzle.charAt(i).indexOf(guess.charAt(i)) != -1)
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
