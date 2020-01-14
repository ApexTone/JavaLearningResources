public class Main {
    public static void main(String[] args) {
        compareString("apple", "coconut");
        compareString("apple", "apple");
        compareString("coconut", "apple");

        compareInteger(5, 7);
        compareInteger(5, 5);
        compareInteger(7, 5);

        compareInt(5, 7);
        compareInt(5, 5);
        compareInt(7, 5);

        compareFloat(5.2f, 7.9f);
        compareFloat(5.2f, 5.2f);
        compareFloat(7.9f, 5.2f);
    }
    public static void compareString(String a,String b) {
        System.out.printf("a=%s b=%s a.compareTo(b)=%d\n",a,b,a.compareTo(b));
        /*
        a>b; +
        a<b; -
        a=b; 0
        */
    }

    public static void compareInteger(Integer a,Integer b) {//Object int
        System.out.printf("a=%d b=%d a.compareTo(b)=%d\n",a,b,a.compareTo(b));
        /*
        a>b; +
        a<b; -
        a=b; 0
        */
    }

    public static void compareInt(int a,int b) {//Primitive int
        System.out.printf("a=%d b=%d a.compareTo(b)=%d\n",a,b,Integer.valueOf(a).compareTo(Integer.valueOf(b)));
        /*
        a>b; +
        a<b; -
        a=b; 0
        */
        System.out.printf("a=%d b=%d a-b=%d\n",a,b,a-b);
    }

    public static void compareFloat(float a,float b) {//Primitive int
        System.out.printf("a=%d b=%d a.compareTo(b)=%d\n",a,b,Float.valueOf(a).compareTo(Float.valueOf(b)));
        /*
        a>b; +
        a<b; -
        a=b; 0
        */
    }
}