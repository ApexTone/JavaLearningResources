import java.util.LinkedHashMap;
import java.util.Map;

public class Word {

    private static Map<String,String> words = new LinkedHashMap<>();
    
    //Static initializer is useful to make process "cheaper" because it only called once when the classed was loaded
    static{
        System.out.println("Load dictionary words");
        words.put("Hello", "Sawasdee");
        words.put("3", "Saam");
        words.put("5", "Ha");
        words.put("No","Mai");
    }

    public static String search(String key){
        return words.getOrDefault(key, "Not found");
    }
}