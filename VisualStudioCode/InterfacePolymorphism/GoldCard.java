/**
 * GoldCard
 */
public class GoldCard implements IMemberCard{
    @Override
    public float discount(float amount) {
        return amount*0.1f;
    }
    @Override
    public boolean accessLounge() {
        return false;
    }
    
}