public class Utils {
    //Static method: Method that can be used without instance
    public static String firstCap(String s)
    {
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static String allNumber(String s)
    {
        return s.replaceAll("[\\D]","");
    }

    //Static field: Variable that can be used without instance
    public static float vatRate = 0.07f;
    
}