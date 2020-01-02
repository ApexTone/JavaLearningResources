import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(12);
        Random r = new Random();
        for(int i=0;i<5;i++){
            list.push_front(r.nextInt(100));
        }
        list.showData();
        list.insertData(33,13);
        list.showData();
    }
}