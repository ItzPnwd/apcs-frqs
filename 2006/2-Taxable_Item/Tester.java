
/**
 * Tester class is a class that tests the classes and abstract 
 * classes
 *
 * @author Sean Donlin
 * @version 3/23/18
 */
public class Tester
{
    public static void main(String[] arrrrggggssssss)
    {
        Vehicle carTest = new Vehicle(20000.00, 2500.00, 0.10);
        Vehicle carNow = new Vehicle(14500, 1500, 0.80);
        Vehicle carLater = new Vehicle(22000, 2500, 0.80);
        
        System.out.println(carTest.purchasePrice());
        System.out.println(carNow.purchasePrice());
        System.out.println(carLater.purchasePrice());
        
        NonTaxableItem item1 = new NonTaxableItem("Creamy Cookies Cake", 25.99);
        NonTaxableItem item2 = new NonTaxableItem("Buttercream Cupcakes", 10.99);
        
        System.out.println(item1.purchasePrice());
        System.out.println(item2.purchasePrice());
    }
}
