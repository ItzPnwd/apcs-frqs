import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 *
 * @author Sean Donlin
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrggggssssss)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip",1));
        goodies.addOrder(new CookieOrder("Shortbread",5));
        goodies.addOrder(new CookieOrder("Macaroon",2));
        goodies.addOrder(new CookieOrder("Chocolate Chip",3));
        
        System.out.println("Total Boxes: " + goodies.getTotalBoxes());
        goodies.removeVariety("Chocolate Chip");
        System.out.println("Total Boxes: " + goodies.getTotalBoxes());
    }
}
