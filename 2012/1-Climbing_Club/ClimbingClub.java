import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ClimbingClub here.
 *
 * @author Sean Donlin
 * @version 1.0
 */
public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     *  Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;
    
    /** Creates a new ClimbingClub object */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }
    
    /** Adds a new climb with name  peakName  and time  climbTime  to the list of climbs.
     *  @param peakName  the name of the mountain peak climbed
     *  @param climbTime  the number of minutes taken to complete the climb
     */
    public void addClimbA(String peakName, int climbTime)
    {
        ClimbInfo climb = new ClimbInfo(peakName,climbTime);
        climbList.add(climb);
    }
    
    /** Adds a new climb with name  peakName  and time  climbTime  to the list of climbs.
     *  Alphabetical order is determined by the  compareTo method of the String class.
     *  @param peakName  the name of the mountain peak climbed
     *  @param climbTime  the number of minutes taken to complete the climb
     *  Precondition: entries in climbList are in alphabetical order by name.
     *  Postcondition: entries in climbList are in alphabetical order by name.
     */
    public void addClimbB(String peakName,int climbTime)
    {
        ClimbInfo climb = new ClimbInfo(peakName,climbTime);
        
        for(int i = 0; i<= climbList.size(); i++)
        {
            if(peakName.compareTo(climbList.get(i).getName()) <= 0)
            {
                climbList.add(i,climb);
            }
            
        }
        climbList.add(climb);
    }
    
    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames()
    {
        if(climbList.size() == 0)
        {
            return 0;
        }
        
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        
        for(int k = 1; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0)
            {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
}
