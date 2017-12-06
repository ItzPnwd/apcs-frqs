
/**
 * Write a description of class College here.
 *
 * @author Sean Donlin
 * @version 11/27/2017
 */
public class College
{
    //the fields
    private String name;
    private String region;
    private int tuition;
    
    //constructor(s)
    public College(String name, String region,int tuition)
    {
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }
    
    //returns college name
    public String getName()
    {
        return name;
    }
    
    //returns college region
    public String getRegion()
    {
        return region;
    }
    
    //returns college tuition
    public int getTuition()
    {
        return tuition;
    }
    
    //sets college's tuition to newTuition
    public void setTuition(int newTuition)
    {
        tuition = newTuition;
    }
    
    public String toString() {
        return "College [" + name + ", " + region + ", " + tuition + "]";
    }
}
