/**
 * Discount
 */
public class Discount {

    public static float discount(float amount){
        return amount*0.05f;
    }
    public static float discount(float amount,float percent){
        return amount*percent;
    }

    public static float discount(float amount,String type){
        float percent=0.0f;
        switch(type.toUpperCase())
        {
            case "VIP": percent=0.15f; break;
            case "GOLD": percent=0.1f; break;
            default: percent=0.05f;
        }
        return amount*percent;
    }
}