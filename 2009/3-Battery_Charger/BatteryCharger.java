
/**
 * Write a description of class BatteryCharger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryCharger
{
    private int[] rateTable;
    
    public BatteryCharger(int[] table)
    {
        this.rateTable = table;
    }
    
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
                       
        for(int i = 0; i <= chargeTime; i++)
        {
            cost += rateTable[((startHour + i) % 24)];
        }
        
        return cost;
    }
    
    public int getChargeStartTime(int chargeTime)
    {
        
    }
}
