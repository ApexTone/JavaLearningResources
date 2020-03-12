public class Main {

    public static void main(String[] args) {
        add(25, 30f);
        add(60.3,99.25f);
    }

    public static <T> void add(T a, T b) {
        System.out.println(a.getClass() + " Value: " + a);
        System.out.println(b.getClass() + " Value: " + b);
    }

}
