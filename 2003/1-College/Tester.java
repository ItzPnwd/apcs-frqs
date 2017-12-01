
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
        
        //Will be testing the functions through loops :D
            
        //Current testing method
        
        System.out.println(c1.getName() + ", " + c1.getRegion() + ", " + c1.getTuition());
        System.out.println(c2.getName() + ", " + c2.getRegion() + ", " + c2.getTuition());
        System.out.println(c3.getName() + ", " + c3.getRegion() + ", " + c3.getTuition());
        System.out.println(c4.getName() + ", " + c4.getRegion() + ", " + c4.getTuition());
        System.out.println(c5.getName() + ", " + c5.getRegion() + ", " + c5.getTuition());
        System.out.println(c6.getName() + ", " + c6.getRegion() + ", " + c6.getTuition());
        System.out.println(c7.getName() + ", " + c7.getRegion() + ", " + c7.getTuition());
        
        //Testing the setTuition and then redoing the get tuition to prove
        c1.setTuition(1000);
        c2.setTuition(2000);
        c3.setTuition(3000);
        c4.setTuition(4000);
        c5.setTuition(5000);
        c6.setTuition(6000);
        c7.setTuition(7000);
        
        System.out.println(c1.getTuition());
        System.out.println(c2.getTuition());
        System.out.println(c3.getTuition());
        System.out.println(c4.getTuition());
        System.out.println(c5.getTuition());
        System.out.println(c6.getTuition());
        System.out.println(c7.getTuition());
        
    }
}
