import java.util.ArrayList;
/**
 * Test the pet abstract class and the other classes
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class Tester
{
    public static void main(String[] arrrrrrggggggssssss)
    {
       Dog d1 = new Dog("Bubba");
       Loud_Dog l1 = new Loud_Dog("Bruce");
       Cat c1 = new Cat("Mittens");
       
       ArrayList<Pet> pets = new ArrayList<Pet>();
       pets.add(d1);
       pets.add(l1);
       pets.add(c1);
       
       Kennel astro = new Kennel(pets);
       
       astro.allSpeak();
    }
}
