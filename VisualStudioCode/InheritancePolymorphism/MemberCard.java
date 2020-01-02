/**
 * MemberCard
 */
public abstract class MemberCard {

    private String id,firstName,lastName;
    public MemberCard(String id,String firstName,String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public MemberCard(){
    }

    public abstract boolean accessLounge();


    public String getFirstName() {
        return firstName;
    }
    public String getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public float discount(float amount){
        return amount*0.02f;
    }
}