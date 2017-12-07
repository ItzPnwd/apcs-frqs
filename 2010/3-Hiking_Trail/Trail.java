
/**
 * Write a description of class Trail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trail
{
    //fields
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;
    
    //Constructor(s)
   public Trail(int[] Elevation)
   {
       this.markers = Elevation;
   }
    
    //Methods
    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an  ending marker, and all markers between those two markers.
     * A trial segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to ten meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     *          Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the maximum and minimum
     *         elevation on this segmen of the trail is less than or equal to 10 meters;
     *         false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    {
     int minimum = markers[0];
     int maximum = markers[0];
     if(0 <= start && start < end && end < markers.length - 1)
     {
        for(int i = start; i < markers.length; i++)
        {
            if(markers[i] > maximum)
            {
             maximum = markers[i];
            }
            
            if(markers[i] < minimum)
            {
                minimum = markers[i];
            }
        }
     }
     
     if(maximum - minimum <= 10)
     {
         return true;
     }
     return false;
   }
   
   /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
    *  elevation that are at least 30 meters(up or down) between two consecutive markers. A trail
    *  with 3 or more such changes is rated difficult.
    *  @return true if the trail is rated difficult; false otherwise.
    * 
    */
   public boolean isDifficult()
   {
       int  difficult = 0;
       
       for(int i = 0; i < markers.length - 1; i++)
       {
           if(Math.abs(markers[i] - markers[i+1]) >= 30)
           {
               difficult +=1;
           }
       }
       
       if(difficult >= 3)
       {
           return true;
       }
       else{
           return false;
       }
   }
}
