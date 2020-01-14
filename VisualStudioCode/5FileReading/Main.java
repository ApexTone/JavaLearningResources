import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        demoReadAll();
    }

    public static void demoFileReader() {
        try{
            FileReader r = new FileReader("country.txt");
            int data;
            while((data = r.read()) != -1){//Read each character 1 by 1
                System.out.printf("%c",data);
            }
            r.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    //This method will work for small file. Else must use buffer for better speed
    public static void demoReadAll(){
        try{
            //Read entire file bytes. Return in byte format. Don't need to close() after use. 
            byte[] b = Files.readAllBytes(Paths.get("country.txt"));
            String s = new String(b);
            System.out.println(s);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void demoReadLines() {
        try {
            //Read line by line. Return in list format. Don't need to close() after use. 
            List<String> lines = Files.readAllLines(Paths.get("country.txt"));
            for(String l : lines){
                System.out.println(l.toUpperCase());
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}