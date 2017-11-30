
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
    
    public String getName()
    {
        return name;
    }
    
    public String getRegion()
    {
        return region;
    }
    
    public int getTuition()
    {
        return tuition;
    }
    
    public void setTuition(int newTuition)
    {
        tuition = newTuition;
    }
    
}
