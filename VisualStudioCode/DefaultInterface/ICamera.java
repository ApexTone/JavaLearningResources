import java.time.LocalDateTime;
import java.time.ZoneId;

public interface ICamera {
    void takePhoto();
    void changeAperture();

    //COMPATIBLE WITH JAVA8+ ONLY
    //Adding more method to interface without implementation to class
    //Useful when multiple classes use same interface
    default void takeHdrPhoto(){
        System.out.println("HDR Cheese");
    }

    //public static method in interface
    //This method CAN'T be used by class that implement this interface
    static LocalDateTime currentLocalDateTime(){
        return LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    }
}