
/**
 * The animal cat is represented in this class
 *
 * @author Sean Donlin
 * @version 3/28/18
 */
public class Cat extends Pet
{
    //Method(s)
    /**
     * @param name  sends the name to the pet class
     */
    public Cat(String name)
    {
        super(name);
    }
    
    /**
     * @return returns the sound of a cat
     */
    public String speak()
    {
        return "MEWO";
    }
}
