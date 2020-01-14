import java.util.Random;
public class DiceV2 {
    private int[] freqs=new int[6];//Declaring array
    private static Random r=new Random();//Random number obj (No seed needed)
    private int count=0;
    public int roll(){
        count++;
        int face = r.nextInt(6)+1;
        freqs[face-1]++;
        return face;//Random from (0-5)  +1 
    }
    
    public int[] getFrequency()// Can return [i] index easier
    {
        return freqs;
    }

    public void showFrequency(){
        for(int i=0;i<6;i++)
        {
            System.out.printf("Frequency of %d face is %d (%.2f%%)\n",i+1,freqs[i],(float)freqs[i]/(float)count*100);
        }

    }
}