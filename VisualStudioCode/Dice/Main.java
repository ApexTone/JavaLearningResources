/**
 * Main
 */
public class Main {
    public static void demoDiceV1()
    {
        //V1
        long start =System.currentTimeMillis();
        Dice dice=new Dice();
        for (int i = 0; i < 100; i++) {
            System.out.println(dice.roll());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Frequency of "+ i+1 +" is " + dice.getFrequency()[i]);//Returning freqs[i] value easier
        }
        long stop= System.currentTimeMillis();

        System.out.printf("Elapsed time=%d\n" ,stop-start);
    }

    public static void demoDiceV2()
    {
        //V2
        long start =System.currentTimeMillis();
        DiceV2 dice=new DiceV2();
        for (int i = 0; i < 100; i++) {
            System.out.println(dice.roll());
        }
        dice.showFrequency();
        
        long stop= System.currentTimeMillis();

        System.out.printf("Elapsed time=%d\n" ,stop-start);
    }

    public static void demoDiceV3()
    {
        //V3
        long start =System.currentTimeMillis();
        DiceV3 dice=new DiceV3();
        for (int i = 0; i < 100; i++) {
           /* System.out.println(dice.roll());
            dice.getDiceFace();*/
            System.out.println(DiceV3.numberToFace(dice.roll()));
        }
        dice.showFrequency();
        
        long stop= System.currentTimeMillis();

        System.out.printf("Elapsed time=%d\n" ,stop-start);
    }
    public static void main(String[] args) {
        demoDiceV3();
    }
}