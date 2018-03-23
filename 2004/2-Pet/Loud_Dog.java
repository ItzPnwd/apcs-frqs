
/**
 * This Class to represent a loud dog that is an adjective of a dog
 *
 * @author Sean Donlin
 * @version 3/28/18
 */
public class Loud_Dog extends Dog
{
   //Method(s)
   /**
    * @param name  name of the loud dog
    */
   public Loud_Dog(String name)
   {
       super(name);
   }
   
   /**
    * @return returns the sound twice because it is a loud dog
    */
   public String speak()
   {
       return super.speak() + super.speak();
   }
}
