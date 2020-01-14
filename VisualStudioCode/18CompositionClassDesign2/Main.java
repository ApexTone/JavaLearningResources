import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        Team teamA= new Team();
        teamA.setName("aaa");
        teamA.setCity("NYC");
        List<Player> players= new ArrayList<Player>();
        players.add(new Player("F","ff", "Center", LocalDate.of(2000,Month.NOVEMBER,20)));
        players.add(new Player("Ffa","fsssssf", "Cenfdsater", LocalDate.of(2010,Month.NOVEMBER,20)));
        players.add(new Player("Fasdf","fddf", "Censadfter", LocalDate.of(2020,Month.NOVEMBER,20)));
    
        teamA.setPlayers(players);
        System.out.println(teamA);


        Team teamB=new Team();
        teamB.setName("bbb");
        teamB.setCity("AZ");
        List<Player> players2=new ArrayList<>();
        players2.add(new Player("foo","ham", "Center", LocalDate.of(200,Month.NOVEMBER,11)));
        players2.add(new Player("ff","jam", "Frontline", LocalDate.of(1010,Month.NOVEMBER,10)));
        players2.add(new Player("nanan","code", "lol", LocalDate.of(320,Month.NOVEMBER,30)));
        teamB.setPlayers(players2);

        Match m= new Match(teamA,teamB,"Cleveland",LocalDateTime.of(2014,Month.NOVEMBER,18,0,0));
        System.out.println(m);
    }
}