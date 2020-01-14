public class Main {
    public static void main(String[] args) {
        Camera c = new Camera();
        c.takePhoto();
        c.changeAperture();
        c.takeHdrPhoto();
        System.out.println(ICamera.currentLocalDateTime());
    }
}