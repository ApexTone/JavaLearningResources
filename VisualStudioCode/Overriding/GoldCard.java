/**
 * GoldCard
 */
public class GoldCard extends MemberCard{

    @Override
    public float discount(float amount){
        return super.discount(amount);//Call super class method (useless)
    }

    @Override
    public float rewardPoint() {
        return 1.5f;
    }
}