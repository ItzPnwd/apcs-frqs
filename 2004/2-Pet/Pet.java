
/**
 * Abstract class Pet - A genre that is used to describe all the class nouns as
 * well as provide abstract methods to those classes
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public abstract class Pet
{
    //Field(s)
    private String myName;//Name of the pet
    
    //Constructor(s)
    /**
     * @param name  name of the pet pulled from a subclass
     */
    public Pet(String name)
    {
        myName = name;
    }
    
    /**
     * @return  returns the name of the pet
     */
    public String getName()
    {
        return myName;
    }
    
    /** Abstract method that every class is required
     *  The sound/noise each animal makes
     */
    public abstract String speak();
}
