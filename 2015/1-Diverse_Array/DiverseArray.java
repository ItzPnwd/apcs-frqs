
/**
 * Class containing the methods to calculate the sum of an Array, 2D array
 * and determine if they are diverse or not.
 *
 * @author Sean Donlin
 * @version 3/27/18
 */
public class DiverseArray
{
    
    /** Calculates the sum of an array and is used in rowSums
     *  @param arr  an array is needed to calculate the sum
     *  @return  returns the sum of the array
     */
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for( int i : arr)
        {
            sum += i;
        }
        return sum;
    }
    
    /** Calculates the sum of all the rows and puts them into an Array
     *  @param arr2D  a 2D array is needed for this to run
     *  @return  returns an array with all the sums of the rows
     */
    public static int[] rowSums(int [][] arr2D)
    {
        int[] sumArray = new int[arr2D.length];
        int place = 0;
        for(int[] i: arr2D)
        {
            sumArray[place] = arraySum(i);
            place++;
        }
        return sumArray;
    }
    
    /** Determines if the 2D array is diverse
     *  A 2D array is diverse if all the rows sums are not equal to each other
     *  @param arr2D a 2D array is required to run
     *  @return  true, if all sums are not equal to each other
     *           false otherwise
     */
    public static boolean isDiverse (int [][] arr2D)
    {
        boolean duplicates = false;
        int[] sumArray = rowSums(arr2D);
        
        for(int j = 0; j < sumArray.length; j++){
            for(int k = 0; k < sumArray.length; k++){
                if (sumArray[k] == sumArray[j]){
                    duplicates = true;
                }
            }   
        }
        return duplicates;
    }
}
