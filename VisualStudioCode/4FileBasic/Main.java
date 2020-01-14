import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        //demo1();
        //demo2();
        demo3();
    }
    public static void demo1() {
        try{//Throw exception about invalid file location
            FileWriter w = new FileWriter("output.txt");
            w.write("Hello");
            w.close();
        }
        catch(IOException e){//FileWriter IOException
            e.printStackTrace();
        }
    }
    public static void demo2() {
        try {
            FileReader r = new FileReader("output.txt");
            int data;
            while((data = r.read()) != -1){
                System.out.printf("%c",data);
            }
            r.close();
        } 
        catch (FileNotFoundException e) {//Filereader filenotfound exception
            e.printStackTrace();
        }
        catch(IOException e){//r.read() IOException
            e.printStackTrace();
        } 
    }

    public static String unicodeTable(int fromCode,int toCode) {//show unicode table
        StringBuilder sb = new StringBuilder();

        //Get correct line separator for corresponding system
        String ls = System.getProperty("line.separator");
        for(int i=fromCode;i<=toCode;i++){
            //For window, use \r\n to create newline. For unix+osx, use just \n!
            //sb.append(String.format("X%04X: %-4d: %c\r\n", i,i,i));//hex,dec,char format

            sb.append(String.format("X%04X: %-4d: %c", i,i,i));//hex,dec,char format
            sb.append(ls);
        }
        return sb.toString();
    }
    public static void demo3() {//write unicodeTable to file
        try{//Throw exception about invalid file location
            FileWriter w = new FileWriter("unicodeTable.txt");
            w.write(unicodeTable('a', 'z'));
            w.close();
        }
        catch(IOException e){//FileWriter IOException
            e.printStackTrace();
        }
    }
}