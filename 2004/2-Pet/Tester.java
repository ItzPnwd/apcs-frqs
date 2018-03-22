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
       
       ArrayList<Kennel> r1 = new ArrayList<Kennel>();
       r1.add(d1);
       r1.add(l1);
       r1.add(c1);
       
       r1.allSpeak();
    }
}
