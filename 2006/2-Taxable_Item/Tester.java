
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        
    }
}
