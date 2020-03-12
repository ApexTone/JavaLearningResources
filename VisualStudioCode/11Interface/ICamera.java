/**
 * ICamera
 */
public interface ICamera {
    final int camera=0;

    void takePhoto();
    void changeAperture();
    void changeShutterSpeed();
    void deletePhoto();
}