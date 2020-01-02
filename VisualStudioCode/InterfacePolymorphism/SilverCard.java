public class SilverCard implements IMemberCard{
    @Override
    public float discount(float amount) {
        return amount*0.05f;
    }
    @Override
    public boolean accessLounge() {
        return false;
    }
    
}