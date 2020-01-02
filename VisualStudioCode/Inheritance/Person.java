import java.time.LocalDate;
import java.time.Period;

// "abstract" means you can't creat instance from this class. Usually use to make parent class.
public /*abstract*/ class Person {
    private String firstName,lastName;
    private char gender;
    private LocalDate bd;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public char getGender() {
        return gender;
    }
    public LocalDate getBd() {
        return bd;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setBd(LocalDate bd) {
        this.bd = bd;
    }

    public int ageYears(){
        Period p=Period.between(bd, LocalDate.now());
        return p.getYears();
    }
}