import java.util.Random;

public class Main {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1(){
        Sedan s= new Sedan();
        System.out.println(s.cashRate());

        Vehicle v = new Sedan();//Contrary to abstract class, interface can "point" to the implementation of its.
        System.out.println(v.cashRate());
    }

    public static void demo2(){
        Vehicle v=null;//Use interface as type
        for(int i=0;i<20;i++)
        {
            int r=randomBetween(0,1);
            switch(r)
            {
                case 0 : v=new Sedan(); break;
                case 1: v=new Truck(); break;
                default : v=new Sedan();
            }
            int paymentType=randomBetween(0, 2);
            switch(paymentType)
            {
                case 0 : System.out.printf("%30s Pay with   cash: %5d\n" , v.getClass(),v.cashRate()); break;//getClass() return class name
                case 1 : System.out.printf("%30s Pay with E-PASS: %5d\n" , v.getClass(),v.ePassRate()); break;
                default: System.out.printf("%30s Pay with   cash: %5d\n" , v.getClass(),v.cashRate());
            }
        }
    }

    public static int randomBetween(int a,int b){
        Random r = new Random();
        return r.nextInt(b+1-a)+a;
    }
}