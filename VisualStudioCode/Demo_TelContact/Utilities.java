public class Utilities {

    //static method -> class method; CLASS_NAME.method(); เรียกใช้ได้ง่ายกว่า ไม่ต้องมี instance
    public static String firstCap(String s)//Change first letter to CAP and else to lower case
    {
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
}