import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();         
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());

        LocalDate day199=LocalDate.ofYearDay(2020, 199);
        System.out.println("วันที่ 199 คือ " + day199);

        LocalDate worldCup2014=LocalDate.of(2004,Month.JUNE,12);
        System.out.println("Day until world cup 2014"+today.until(worldCup2014, ChronoUnit.DAYS));
    
        LocalDate birthDate=LocalDate.of(2000,Month.NOVEMBER,27);
        System.out.println("Life long day count"+birthDate.until(today, ChronoUnit.DAYS));
    
        System.out.printf("อายุ %d ปี %d เดือน %d วัน",birthDate.until(today).getYears(),birthDate.until(today).getMonths(),birthDate.until(today).getDays());
    }
}