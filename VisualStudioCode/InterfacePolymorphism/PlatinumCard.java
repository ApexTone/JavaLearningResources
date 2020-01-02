/**
 * PlatinumCard
 */
public class PlatinumCard implements IMemberCard{

    @Override
    public float discount(float amount) {
        return amount*0.15f;
    }
    @Override
    public boolean accessLounge() {
        return true;
    }
}