import java.util.ArrayList;
import java.util.List;

/**
 * Team
 */
public class Team {

    private String name,city;
    private List<Player> players = new ArrayList<>();

    public Team(){
    }
    public Team(String a,String b,List<Player> c){
        this.name=a;
        this.city=b;
        this.players=c;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
    public List<Player> getPlayers() {
        return players;
    }


    @Override
    public String toString() {
        return name+" "+city+" "+players;
    }
}