
/**
 * Write a description of class Tester here.
 *
 * @author Sean Donlin
 * @version 11/29/17
 */
public class Tester
{
    public static void main(String[] arrrggggggs)
    {
        //Colleges
        College c1 = new College("Colgate University", "Northeast", 27025);
        College c2 = new College("Duke University", "Southeast", 26000);
        College c3 = new College("Kalamazoo", "Midwest", 19764);
        College c4 = new College("Stanford University", "West", 25917);
        College c5 = new College("Florida International University", "Southeast", 10800);
        College c6 = new College("Dartmouth College", "Northeast", 27764);
        College c7 = new College("Spelman College", "Southeast", 11455);
        
        College[] allColleges = {c1, c2, c3, c4, c5, c6, c7};
        
        CollegeGroup group = new CollegeGroup(allColleges);
        
    }
    
}
