/**
 * Person
 */
import java.time.LocalDate;
public class Person {

    private String title,firstName,lastName;
    private String firstNameTh,lastNameTh;//Harder to implement
    private LocalDate bd;

    public Person(String a,String b,String c,LocalDate d){
        this.title=a;
        this.firstName=b;
        this.lastName=c;
        this.bd=d;
    }
    public Person(String a,String b,String c,LocalDate d,String e,String f){
        this.title=a;
        this.firstName=b;
        this.lastName=c;
        this.bd=d;
        this.firstNameTh=e;
        this.lastNameTh=f;
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
    public void setTitle(String title) {
        this.title = title;
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
    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return title+" "+firstName+" "+lastName+" "+bd+"\n"+firstNameTh+" "+lastNameTh;
    }
}