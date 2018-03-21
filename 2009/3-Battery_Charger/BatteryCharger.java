
/**
 * Uses a table and determines the charging cost and the cheapest 
 * amount for the ammount of time needing to be charged
 * @author Sean Donlin
 * @version 3/5/18
 */
public class BatteryCharger
{
    /** rateTable has 24 enteries representing the charging cost for 0 through 23. */
    private int[] rateTable;
    
    //Constructor(s)
    public BatteryCharger(int[] table)
    {
        this.rateTable = table;
    }
    
    //Method(s)
    /**Determines the total cost to charge the battery starting at the beginning of startHour.
     * @param start hour the hour at which the charge period begins
     *        Precondition: 0 <=startHour <= 23
     * @param chargeTime the number of hours the battery needs to be charged
     *        Precondition: chargeTime > 0
     * @return the total cost to charge the battery
     */
    private int getChargingCost(int startHour, int chargeTime)
    {
        int cost = 0;
                       
        for(int i = 0; i < chargeTime; i++)
        {
            cost += rateTable[((startHour + i) % 24)];
        }
        
        return cost;
    }
    
    /** Determines start time to charge the battery at the lowes cost for the hour given charge time.
     *  @param chargeTime the number of hours the battery needs to be charged
     *         Precondition: chargeTime > 0
     *  @return an optimal start time, with 0 <= returned value <= 23
     */
    public int getChargeStartTime(int chargeTime)
    {
        int lowestCost = getChargingCost(0, chargeTime);
        int cost = 0;
        for(int i = 1; i < 23; i++)
        {
            cost = getChargingCost(i, chargeTime);
            if(cost < lowestCost)
            {
                lowestCost = cost;
            }
        }
        
        return lowestCost;
    }
}
