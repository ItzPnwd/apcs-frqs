
/**
 * Tests the BatteryCharger Class
 *
 * @author Sean Donlin
 * @version 3/9/18
 */
public class Tester
{
    public static void main(String[] ARGGGGGSSSSS)
    {
        int[] rateTable = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};
        BatteryCharger r1 = new BatteryCharger(rateTable);
        
        System.out.println(r1.getChargeStartTime(6));
        System.out.println(r1.getChargeStartTime(5));
        System.out.println(r1.getChargeStartTime(4));
        System.out.println(r1.getChargeStartTime(1));
    }
}
