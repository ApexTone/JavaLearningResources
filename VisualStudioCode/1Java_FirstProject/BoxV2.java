/**
 * BoxV2
 */
public class BoxV2 {

    private double w,h,d;//Adding private access modifier

    //Constructor
    public BoxV2(double w,double h,double d){   
        setDimension(w, h, d);
    }
    //Default constructor
    public BoxV2(){
        this.w=0;
        this.h=0;
        this.d=0;
    }


    public double volumn(){
        return w*h*d;
    }
    public double surface(){
        return (w*h*2)+(w*d*2)+(h*d*2);
    }

    //Setter
    public void setDimension(double w,double h,double d){
        if(w>0 && h>0 && d>0){
            this.w=w;
            this.h=h;
            this.d=d;
        }
        else{
            throw new IllegalArgumentException("มิติต้องมากกว่า 0");//Exception telling command (Can even show THAI!)
        }
    }
    //Getter
    public double getDimension(int x){
        if(x==0){
            return w;
        }
        else if(x==1){
            return h;
        }
        else if(x==2){
            return d;
        }
        else {
            throw new IllegalArgumentException("x มีค่าได้ระหว่าง 0-2 [w,h,d]");
        }
    }

    //Overiding toString to show custom info
    @Override//Order to override toString method: toString() is from superclass for all java class
    public String toString(){
        return String.format("nanana width=%.2f  height=%.2f  depth=%.2f",w,h,d);
    }
}