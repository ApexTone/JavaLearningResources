public class Main {
    public static void main(String[] args) {
        demo4();
    }

    public static void demo1(){
        Person p1= new Person();
        p1.setFirstName("Pete");
        p1.setLastName("Last");
        p1.setNickName("DS");
        p1.setGender("M");
        
    }
    public static void demo2(){
        Person p2=new Person("Max","Mass","FS","F");
    }
    public static void demo3(){
        Patient p1=new Patient();
        Patient p2=new Patient("AS","DF","FFF","M",69,420);
        System.out.println(p2);
        System.out.println(p1);
    }

    public static void demo4(){
        System.out.println(Word.search("Hello"));
    }
}