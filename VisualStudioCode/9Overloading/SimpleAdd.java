/**
 * SimpleAdd
 */
public class SimpleAdd {

    //Function overloading: Parameter passing difference can create overloading function (Return type difference don't count as difference function)
    public static double add(double a,double b){
        System.out.println("2 Double add");
        return a+b;
    }
    public static float add(float a,float b){
        System.out.println("2 Float add");
        return a+b;
    }
    public static double add(double a,double b,double c){
        System.out.println("3 Double add");
        return a+b+c;
    }
}