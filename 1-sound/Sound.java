
/**
 * Write a description of class Sound here.
 *
 * @author Sean Donlin
 * @version 11/16/17
 */
public class Sound
{
    private int[] samples;
    
    public int limitAmplitude(int limit)
    {
        int nLimit = -1 * limit;
        int len = samples.length;
        
        for(int i = samples[0]; i == samples[len - 1]; i++)
        {
            if(samples[i] >= limit)
            {
                samples[i] = limit;
            }
            if(samples[i] <= nLimit)
            {
                samples[i] = nLimit;
            }
        }
    }
    
    public void trimSilenceFromBeginning()
    {
        for(int i = samples[0]; i <= samples[len]; i++)
        {
            int counter = 0;
            
            if(samples[i] == 0)
            {
                counter += 1;
            }
            else
            {
                return counter;
            }
        }
        
        pirvate int[] finished;
        finished[] = samples[counter];
        return finished;
    }
}
