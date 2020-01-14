/**
 * PersonName
 */
public class PersonName {
    private String title,firstName,lastName;

    public PersonName(String a,String b,String c){
        this.title=a;
        this.firstName=b;
        this.lastName=c;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString(){
        return title+" "+firstName+" "+lastName+"\n";
    }
    
}