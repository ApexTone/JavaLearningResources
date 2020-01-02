//Without inheritance, updating code will be much harder
public class MemberCardV2 {

    private String id, firstName, lastName;
    private String level;

    public MemberCardV2(String id, String firstName, String lastName, String s) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = s;
    }

    public MemberCardV2() {
    }

    public float discount(float amount) {
        float discountRate;
        if (level.equalsIgnoreCase("s"))
            discountRate = 0.02f;
        else if (level.equalsIgnoreCase("p"))
            discountRate = 0.1f;
        else if (level.equalsIgnoreCase("g"))
            discountRate = 0.05f;
        else
            discountRate = 0.0f;

        return amount * discountRate;
    }

    public boolean accessLounge() {
        if (level.equalsIgnoreCase("s"))
            return false;
        else if (level.equalsIgnoreCase("p"))
            return true;
        else if (level.equalsIgnoreCase("g"))
            return false;
        else
            return false;
    }
}