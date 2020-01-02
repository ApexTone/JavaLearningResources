public class Main {
    public static void main(String[] args) {
        //Example of overloading
        String s="Dark Templar";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,7));

        System.out.println(SimpleAdd.add(3.0, 5));
        System.out.println(SimpleAdd.add(3.0f, 5.0f));
        System.out.println(SimpleAdd.add(3.0f, 5.0));
        System.out.println(SimpleAdd.add(3.0f, 5.0f,95));

        float price = 1000.0f;
        System.out.println(Discount.discount(price));
        System.out.println(Discount.discount(price,0.07f));
        System.out.println(Discount.discount(price,"ViP"));
    }
}