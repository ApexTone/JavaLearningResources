import java.time.Month;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student s=new Student();
        s.setFirstName("MeFirst");
        s.setLastName("MeLast");
        s.setFaculty("Computer Engineering");
        s.setMajor("Computer Security");
        s.setBd(LocalDate.of(2000,Month.NOVEMBER,27));
        System.out.println("Age = " + s.ageYears());


        ExchangeStudent ex1= new ExchangeStudent();
        ex1.setFirstName("Dave");
        ex1.setLastName("Droz");
        ex1.setPartnerUniversity("ABC Uni");
    }
    
}