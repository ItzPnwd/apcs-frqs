
/**
 * Tests the DiverseArray Class
 *
 * @author Sean Donlin
 * @version 3/27/2018
 */
public class Tester
{
    public static void main(String[] arrrrggggssssss)
    {
        int[] arr1 = {1,3,2,7,3};
        System.out.println(DiverseArray.arraySum(arr1));
        
        int[][] mat1 = new int[][]{
        {},
        {},
        {},
        {}};
        
        System.out.println(DiveseArray.rowsSum(mat1));
        int[][] mat2 = new int[][]{
        {},
        {},
        {},
        {}};
        
        System.out.println(DiverseArray.isDiverse(mat1));
        System.out.println(DiverseArray.isDiverse(mat2));
    }
}
