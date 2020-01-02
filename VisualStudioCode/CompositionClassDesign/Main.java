import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        Person p1= new Person("Mr", "D", "dd", LocalDate.of(2000,Month.NOVEMBER,27));
        System.out.println(p1);

        Person p2=new Person("Mrs", "x", "XX", LocalDate.of(2000,Month.NOVEMBER,27),"่าสว","ฟหกด");
        System.out.println(p2);
    }

    public static void demo2() {
        PersonV2 p1= new PersonV2(new PersonName("นาย","เอ","บี"),new PersonName("Mr","A","B"), LocalDate.of(2000,Month.NOVEMBER,27));
        System.out.println(p1);

        Map<String,String> phone = new HashMap<>();
        phone.put("mobile","0885290888");
        phone.put("office","042246611");
        phone.put("office2","042246622");
        phone.put("home","0857578787");
        p1.setPhone(phone);


        PersonV2 p2= new PersonV2(new PersonName("นางสาว","เดดดด","ฟหกด"),new PersonName("Mrs","Teeeee","asdf"), LocalDate.of(2000,Month.NOVEMBER,27));
    }
}