import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//Reding from terminal
        String name = scan.nextLine();//Read string
        /*
        scan.nextInt();//Read int
        scan.nextBoolean();//Read boolean
        //etc
        */
        System.out.println(name);
    }
}