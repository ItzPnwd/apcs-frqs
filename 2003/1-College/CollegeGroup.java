
/**
 * Write a description of class CollegeGroup here.
 *
 * @author Sean Donlin
 * @version 11/27/2017
 */
public class CollegeGroup
{
    private College[] myColleges;
    
    //Constructors
    public CollegeGroup(College[] myColleges)
    {
        this.myColleges = myColleges;
    }
    
    public void updateTuition(String collegeName, int newTuition)
    {
        for(int i = 0; i < myColleges.length; i++)
        {
            College c = myColleges[i];
            String n = c.getName();
            
            if(n.equals(collegeName))
            {
                c.setTuition(newTuition);
            }
        }
    }
    
    public College[] getCollegeList(String region, int low, int high)
    {
        int counter = 0;
        
        for(int i = 0; i < myColleges.length; i++)
        {
            College c = myColleges[i];
            String r = c.getRegion();
            int t = c.getTuition();
            
            if(r.equals(region) && t > low && t < high)
            {
                counter += 1;
            }
        }
        
        College[] standards = new College[counter];
        
        for(int i = 0; i < myColleges.length; i++)
        {
            College c = myColleges[i];
            String r = c.getRegion();
            int t = c.getTuition();
            
            if(r.equals(region))
            {
                if(t > low && t < high)
                {
                    standards[i] = myColleges[i];
                }
            }
        }
        return standards;
    }
}
