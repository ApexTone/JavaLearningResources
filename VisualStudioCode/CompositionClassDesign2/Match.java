import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Match
 */
public class Match {

    private Team teamA,teamB;
    private String city;
    private LocalDateTime schedule;

    public Match(){
    }
    public Match(Team a,Team b,String c,LocalDateTime d){
        this.teamA=a;
        this.city=c;
        this.teamB=b;
        this.schedule=d;
    }

    public String getCity() {
        return city;
    }
    public LocalDateTime getSchedule() {
        return schedule;
    }
    public Team getTeamA() {
        return teamA;
    }
    public Team getTeamB() {
        return teamB;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }
    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }
    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }


    @Override
    public String toString() {
        return city+" "+schedule+" "+teamA+" "+teamB;
    }

}