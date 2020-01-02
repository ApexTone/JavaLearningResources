import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        demo2();
    }
    public static void demo1(){
        //TreeMap will only use Object as argument
        TreeMap<Integer, String> m = new TreeMap<Integer,String>();
        //TreeMap will sort item according to key value
        m.put(1133,"Asking tel number");
        m.put(183,"Asking regional tel number");
        m.put(189,"Complain");
        m.put(1177,"Tel problem");

        //Iterating object
        for(Map.Entry<Integer,String> item : m.entrySet()){
            System.out.printf("%d %s\n", item.getKey(),item.getValue());
        }
    }
    public static String gradingTreeMap(int score){
        //Utilizing TreeMap to simulate VLookup in Excel
        //Using this idea will be easier to edit than nested if...else
        //Adding more grading level can be add without changing other condition
        TreeMap<Integer,String> m = new TreeMap<Integer,String>();
        m.put(0,"F");//0-49
        m.put(50,"D");//50-59
        //m.put(55,"D+");//Like this
        m.put(60,"C");//60-69
        m.put(70,"B");//70-79
        m.put(80,"A");//80-100
        return m.floorEntry(score).getValue();//Floor the score value to nearest lower key and get the value
    }
    public static void demo2(){
        int score = 85;
        System.out.println(gradingTreeMap(score));
    }
}
