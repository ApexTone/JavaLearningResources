import java.time.LocalDate;

/**
 * Player
 */
public class Player {

    private String firstName, lastName, position;
    private LocalDate bd;

    public Player(String a, String b, String c, LocalDate d) {
        this.firstName = a;
        this.lastName = b;
        this.position = c;
        this.bd = d;
    }

    public LocalDate getBd() {
        return bd;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+position;
    }
}