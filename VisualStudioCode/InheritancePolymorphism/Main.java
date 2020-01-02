public class Main {
    public static void main(String[] args) {
        demo4();
    }

    public static void demo1(){
        SilverCard s= new SilverCard();
        PlatinumCard p= new PlatinumCard();

        System.out.println(s.discount(2000));
        System.out.println(p.discount(2000));
    }

    public static void demo2() {
        //Can use super class to "point" at subclass -> Polymorphism
        MemberCard s= new SilverCard();
        MemberCard p= new PlatinumCard();

        System.out.println(s.discount(2000));
        System.out.println(p.discount(2000));
        System.out.println(s.accessLounge());
        System.out.println(p.accessLounge());
    }

    public static void demo3() {
        MemberCardV2 c1=new MemberCardV2("1","ff","ffff","S");
        System.out.println(c1.discount(2000));
        System.out.println(c1.accessLounge());

        MemberCardV2 c2=new MemberCardV2("2","ff","ffff","G");
        System.out.println(c2.discount(2000));
        System.out.println(c2.accessLounge());

        MemberCardV2 c3=new MemberCardV2("3","ff","ffff","p");
        System.out.println(c3.discount(2000));
        System.out.println(c3.accessLounge());   
    }

    public static void demo4() {
        MemberCard c1 = new SilverCard();
        receipt(c1, 2000);
        MemberCard c2 = new PlatinumCard();
        receipt(c2, 2000);
    }

    public static void receipt(MemberCard c,float amount){
        System.out.println(c.getClass().getName());
        System.out.printf("amount = %10.2f\nDiscount = %10.2f\nnet = %10.2f\n",amount,c.discount(amount),amount-c.discount(amount));
    }

}