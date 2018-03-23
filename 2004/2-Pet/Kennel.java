import java.util.ArrayList;
/**
 * Allows to print all pets names and noises at once
 *
 * @author Sean Donlin
 * @version 3/28/18
 */
public class Kennel
{
    //Field(s)
    private ArrayList<Pet> petList;
    
    //Contructor(s)
    /**
     * @param petList  List of all pets in the kennel
     */
    public Kennel(ArrayList<Pet> petList) 
    {
        this.petList = petList;
    }
    
    //Method(s)
    /**
     * prints all the names and noises of the pets in the kennel
     */
    public void allSpeak()
    {
        for (Pet p: petList) {
            System.out.print(p.getName() + "  ");
            System.out.println(p.speak());
        }
    }   
}
