import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        noTryCatch3();
    }
    public static void noTryCatch1() {
        int[] a = {4,5,1};
        System.out.println(a[3]);
        //Produce java.lang.ArrayIndexOutOfBoundsException exception
    }
    public static void withTryCatch1() {
        int[] a = {4,5,1};
        try{//Try to do this
            System.out.println(a[3]);
        }
        catch(Exception e){//If failed, do this instead (Exception e is a generic exception)
            System.out.println("An exception here.");
        }
    }

    public static void noTryCatch2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Fav number?");
        int n = s.nextInt();
        //If the input is not a number, this will failed
        System.out.println(n);
    }
    public static void withTryCatch2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Fav number?");
        try {
            int n = s.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Tell the number!");
        } 
    }

    public static void noTryCatch3() {
        int[] a = null;
        System.out.println(a[1]);
    }
    public static void withTryCatch3() {
        try{
            int[] a = {4};
            System.out.println(a[1]);
        }
        catch(NullPointerException e){
            System.out.println("Array is null");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        catch(Exception e){
            System.out.println("Something went wrong! I don't know");
        }
    }
}