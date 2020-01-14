public class Main {
    public static void main(String[] args) {
        //Static method: Call method without using instance
        double p= Math.pow(2, 10);//pow() is a method in Math class
        System.out.println(p);

        //Custom static method/field from Utils.java
        System.out.println(Utils.firstCap("MoCKErY"));
        System.out.println(Utils.allNumber("156--5asdfJK63"));
        System.out.println(Utils.vatRate);
        Utils u= new Utils();
        System.out.println(u.firstCap("MoCKErY"));
        System.out.println(u.allNumber("156--5asdfJK63"));
        System.out.println(u.vatRate);
    }
}