/**
 * PlatinumCard
 */
public class PlatinumCard extends MemberCard {
    @Override
    public float discount(float amount) {
        return amount * 0.2f;
    }

    @Override
    public float rewardPoint(){
        return 2f;
    }

}