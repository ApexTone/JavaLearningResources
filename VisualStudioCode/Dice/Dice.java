import java.util.Random;

/**
 * Dice
 */
public class Dice {
    private int[] freqs=new int[6];//Declaring array

    public int roll(){
        Random r=new Random();//Must call every time when roll() is called. EXPENSIVE PROCESS
        int face = r.nextInt(6)+1;
        freqs[face-1]++;
        return face;//Random from (0-5)  +1 
    }
    
    public int[] getFrequency()// Can return [i] index easier
    {
            return freqs;
    }
}