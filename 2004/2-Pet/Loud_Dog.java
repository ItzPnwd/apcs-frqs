
/**
 * Class to represent a loud dog
 *
 * @author Sean Donlin
 * @version 3/28/18
 */
public class Loud_Dog extends Dog
{
   //Method(s)
   /**
    * @param name
    */
   public Loud_Dog(String name)
   {
       super(name);
   }
   
   public String speak()
   {
       return super.speak() + super.speak();
   }
}
