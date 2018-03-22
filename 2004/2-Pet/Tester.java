import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
