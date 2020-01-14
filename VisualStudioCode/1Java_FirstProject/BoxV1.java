/**
 * BoxV1
 */
public class BoxV1 {

    public double w,h,d;

    public double volumn(){
        return w*h*d;
    }
    public double surface(){
        return (w*h*2)+(w*d*2)+(h*d*2);
    }
}