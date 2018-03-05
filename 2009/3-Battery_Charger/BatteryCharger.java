
/**
 * Write a description of class BatteryCharger here.
 *
 * @author Sean Donlin
 * @version 3/5/18
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
        int lowestCost = 0;
        int cost = 0;
        for(int i = 0; i <= 23; i++)
        {
            cost = getChargingCost(i, chargeTime);
            if(cost > lowestCost)
            {
                lowestCost = cost;
            }
        }
        
        return lowestCost;
    }
}
