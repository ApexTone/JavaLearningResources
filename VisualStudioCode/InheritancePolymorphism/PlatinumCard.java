public class PlatinumCard extends MemberCard{
    @Override
    public float discount(float amount){
        return amount*0.05f;
    }

    @Override
    public boolean accessLounge() {
        // TODO Auto-generated method stub
        return true;
    }
    
}