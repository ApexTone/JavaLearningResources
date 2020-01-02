public class Main {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        IMemberCard c1 = new SilverCard();//Interface-base polymorphism property
        System.out.println(c1.getClass().getName());
        System.out.println(c1.discount(2000));
        System.out.println(c1.accessLounge());

        SilverCard c2= new SilverCard();
        System.out.println(c2.getClass().getName());
        System.out.println(c2.discount(2000));
        System.out.println(c2.accessLounge());
    }
    public static void demo2() {
        SilverCard c1= new SilverCard();
        receipt(c1, 2000);
    }

    public static void receipt(IMemberCard c, float amount){//Interface-base polymorphism property
        System.out.print("Card type: ");
        System.out.println(c.getClass().getName());
        System.out.print("Total price: ");
        System.out.println(amount);
        System.out.print("Discount: ");
        System.out.println(c.discount(2000));
        System.out.print("Net: ");
        System.out.println(amount-c.discount(2000));
    }
}