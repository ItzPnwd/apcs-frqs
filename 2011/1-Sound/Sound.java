
/**
 * Write a description of class Sound here.
 *
 * @author Sean Donlin
 * @version 11/16/17
 */
public class Sound
{
    //Fields
    /**the array of values in this sound; guarenteed not to be null */
    private int[] samples;
    
    //Constructor(s)
    public Sound(int[] samples)
    {
        this.samples = samples;
    }
    
    //Methods
    /**Changes those values in this sound that have an aplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than nlimit are changerd to nlimit.
     * @param limit the aplitude limit
     *        Precondition: limit >= 0
     * @return the number of values in this sound that this method changed
     */
    public int limitAmplitude(int limit)
    {
        int nLimit = -1 * limit;
        int changed = 0;
        for(int i = 0; i < samples.length; i++)
        {
            if(limit >= 0)
            {
                if(samples[i] > limit)
                {
                    samples[i] = limit;
                    changed++;
                }
                if(samples[i] < nLimit)
                {
                    samples[i] = nLimit;
                    changed++;
                }
            }
        }
        return changed;
    }
    
    /**Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     * Precondition: samples contains at leaste one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning()
    {
        int counter = 0;
        while(samples[counter] == 0)
        {   
           counter++;
        }
        
        int newLength = samples.length - counter;
        int[] finished = new int [newLength];
        
        for(int i = counter; i < samples.length; i++)
        {
            finished[i - counter] = samples[i];
        }
        
        samples=finished;
    }
    
    public int[] getSamples() {
        return samples;
    }    
}
