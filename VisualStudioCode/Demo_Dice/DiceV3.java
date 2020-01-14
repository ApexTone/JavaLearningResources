import java.util.Random;
public class DiceV3 {
    private int[] freqs=new int[6];//Declaring array
    private static Random r=new Random();//Random number obj (No seed needed)
    private int count=0;
    private char diceFace=' ';
    public int roll(){
        count++;
        int face = r.nextInt(6)+1;
        freqs[face-1]++;
        diceFace=(char)(face-1+'\u2680');
        return face;//Random from (0-5)  +1 
    }
    
    public void getDiceFace()
    {
        System.out.println(diceFace);
    }
    public static char numberToFace(int face)
    {
        if(face>6 || face<1)
            throw new IllegalArgumentException("Dice face stay between 1-6");
        return (char)('\u2680'+face-1);
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