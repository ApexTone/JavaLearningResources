/**
 * SilverCard
 */
public class SilverCard extends MemberCard{

    @Override
    public float discount(float amount){
        if(amount > 2000)
        {
            return amount*0.1f;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public float rewardPoint() {
        return 1.0f;
    }
}