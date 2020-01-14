public class Main {
    public static void main(String[] args) {
        demo2();
    }

   /*//MemberCard changed to abstract class
    public static void demo1(){
        MemberCard m1 = new MemberCard("FF","DD");
        System.out.println(m1.toString());
    }*/

    public static void demo2(){
        float price=2000.0f;
        PlatinumCard p1=new PlatinumCard();
        System.out.println("Platinum discount: "+p1.discount(price));
        System.out.println("Platinum point: "+p1.calcPoint(price));

        GoldCard g1=new GoldCard();
        System.out.println("Gold discount: "+g1.discount(price));
        System.out.println("Gold point: "+g1.calcPoint(price));

        SilverCard s1=new SilverCard();
        System.out.println("Silver discount: "+s1.discount(price));
        System.out.println("Silver point: "+s1.calcPoint(price));
    }
}