import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> list = new LinkedList<Double>(12D);
        Random r = new Random();
        for(int i=0;i<5;i++){
            list.push_front(r.nextDouble());
        }
        list.showData();
        list.insertData(33D,13D);
        list.showData();
    }
}