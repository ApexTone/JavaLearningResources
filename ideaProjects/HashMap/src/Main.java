import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        demoHashMapCustom();
    }

    public static void demoHashMap(){
        //Map is a kind of interface which HashMap implemented it
        Map<String,String> m = new HashMap<String, String>();
        //(key,value);
        m.put("cn","China");
        m.put("th","Thai");
        m.put("jp","Japan");
        //HashMap's values don't store in order

        System.out.println(m.get("jp"));//Printing out value of the key

        for(Map.Entry<String,String> item:m.entrySet()){//Create iterator for this map (m)
            String key=item.getKey();
            String value=item.getValue();
            System.out.printf("%s => %s\n",key,value);
        }
        m.put("th","Siam");//Overwriting value of the same key

        if(m.containsKey("cn")){//Does the map contain this key?
            System.out.println("Found china");
        }
        if(m.containsValue("Siam")){//Dose the map contain this value
            System.out.println("Found siam");
        }
    }

    public static void demoHashMapCustom(){
        Map<String,Country> m = new HashMap<String,Country>();
        m.put("th", new Country("ไทย","Thai"));
        m.put("jp", new Country("ญี่ปุ่น","Japan"));

        System.out.println(m.get("jp"));
    }
}
