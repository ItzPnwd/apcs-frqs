
/**
 * The animal dog is represented in this class.
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class Dog extends Pet
{
    //Method(s)
    /**
     * Takes a name and sends it to the pet abstract class
     * @param name  name of the dog
     */
    public Dog(String name)
    {
        super(name);
    }
    
    /**
     * @return  returns the noise of a dog
     */
    public String speak()
    {
        return "BARK";
    }
}
