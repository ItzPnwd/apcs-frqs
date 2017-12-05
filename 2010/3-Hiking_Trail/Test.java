
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] arrrggggggs)
    {
        int[] a1 = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        
        Trail t1 = new Trail(a1);
        
        System.out.println(t1.isLevelTrailSegment(1,2));
        System.out.println(t1.isLevelTrailSegment(8,9));
        System.out.println(t1.isDifficult());
    }
}
