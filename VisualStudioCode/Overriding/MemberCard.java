public abstract class MemberCard {
    private String firstName, lastName;

    public MemberCard() {
    }

    public MemberCard(String f, String l) {
        setFirstName(f);
        setLastName(l);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float discount(float amount) {
        if (amount > 1000) {
            return amount * 0.2f;
        } else {
            return 0;
        }
    }

    //abstract methods have no cmd and can only be inside abstract class
    public abstract float rewardPoint();//Must be implement in each subclass manually
    //final method can't be override
    public final int calcPoint(float amount){
        return (int)((amount/20)*rewardPoint());//Will choose rewardPoint() accord to each class
    }

    // Overriding method: Change method cmds from superclass
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}