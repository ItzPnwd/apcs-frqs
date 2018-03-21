
/**
 * Write a description of class Loud_Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loud_Dog extends Dog
{
   public Loud_Dog(String name)
   {
       super(name);
   }
   
   public String speak()
   {
       return speak() + speak();
   }
}
