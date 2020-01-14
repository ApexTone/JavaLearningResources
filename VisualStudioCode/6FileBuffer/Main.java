import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        demoBufferedReader2();
    }
    
    //Writing
    public static void demoFileWriter() {
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try{
            FileWriter w = new FileWriter("output.txt");
            w.write(s);
            w.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Use time: %d ms\n",endTime-startTime);
    }
    public static void demoBufferedWriter() {
        long startTime = System.currentTimeMillis();
        String s = unicodeTable('A', 'z');
        try{
            //Use BufferedWriter
            BufferedWriter w = new BufferedWriter(new FileWriter("output.txt"));
            w.write(s);
            w.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Use time: %d ms\n",endTime-startTime);
    }
    public static String unicodeTable(int fromCode,int toCode) {//show unicode table
        StringBuilder sb = new StringBuilder();
        String ls = System.getProperty("line.separator");
        for(int i=fromCode;i<=toCode;i++){

            sb.append(String.format("X%04X: %-4d: %c", i,i,i));//hex,dec,char format
            sb.append(ls);
        }
        return sb.toString();
    }

    //Reading
    public static void demoFileReader() {
        try {
            FileReader r = new FileReader("country.txt");
            int data;
            while((data = r.read()) != -1){
                System.out.printf("%c",data);
            }
            r.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    //All are the same
    public static void demoBufferedReader1() {
        try {
            BufferedReader r = new BufferedReader(new FileReader("country.txt"));
            String s;
            while((s = r.readLine()) != null){
                System.out.println(s);
            }
            r.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void demoBufferedReader2() {
        //try with resource (JAVA7+)
        try(BufferedReader r = new BufferedReader(new FileReader("country.txt"))) { 
            String s;
            while((s = r.readLine()) != null){
                System.out.println(s);
            }
            //Auto close
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void demoBufferedReader3() {
        //try with resource (JAVA7+)
        try(BufferedReader r = Files.newBufferedReader(Paths.get("country.txt"))) { 
            String s;
            while((s = r.readLine()) != null){
                System.out.println(s);
            }
            //Auto close
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}