import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public void addClimb(String peakName, int climbTime)
    {
    }
    
    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames()
    {
    }
}
