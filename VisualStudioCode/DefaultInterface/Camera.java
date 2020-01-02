public class Camera implements ICamera{
    @Override
    public void takePhoto() {
        System.out.println("Say cheese!");
    }

    @Override
    public void changeAperture() {
        
    }

    //Can still run without implementation of default method
}