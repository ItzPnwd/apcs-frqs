
/**
 * Write a description of class Sound here.
 *
 * @author Sean Donlin
 * @version 11/16/17
 */
public class Sound
{
    //Fields
    private int[] samples;
    
    //Constructor(s)
    public Sound(int[] samples)
    {
        this.samples = samples;
    }
    
    //Methods
    public int limitAmplitude(int limit)
    {
        int nLimit = -1 * limit;
        int changed =0;
        for(int i = samples[0]; i <= samples.length; i++)
        {
            if(limit >= 0)
            {
                if(samples[i] >= limit)
                {
                    samples[i] = limit;
                    changed++;
                }
                if(samples[i] <= nLimit)
                {
                    samples[i] = nLimit;
                    changed++;
                }
            }
        }
        return changed;
    }
    
    public void trimSilenceFromBeginning()
    {
        int counter = 0;
        int q = 0;
        while(samples[q] == 0)
        {   
           counter++;
           q++;
        }
        
        int newLength = samples.length - counter;
        int[] finished = new int [newLength];
        
        for(int i = counter; i < newLength; i++)
        {
            finished[i] = samples[i];
        }
        
        samples=finished;
    }
    
    public int[] getSamples() {
        return samples;
    }    
}
