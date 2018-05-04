
/**
 * Tests the constructors and the trio class
 *
 * @author Sean Donlin
 * @version 5/4/18
 */
public class Tester
{
    public static void main(String[] arrrrrgggggs)
    {
        Trio trio1 = new Trio(new Sandwich("Cheeseburger",2.75),new Salad("Spinach Salad",1.25),new Drink("Orange Soda",1.25));
        Trio trio2 = new Trio(new Sandwich("Club Sandwhich",2.75),new Salad("Coleslaw",1.25),new Drink("Cappuccino",3.50));
        
        System.out.println(trio1.getName());
        System.out.println(trio1.getPrice());
        System.out.println(trio2.getName());
        System.out.println(trio2.getPrice());
    }
}
