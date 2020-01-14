/**
 * SmartPhone
 */
//Multiple interfaces
public class SmartPhone implements IPhone,ICamera{//Can implement multiple interface don't like class inheritance

    //Camera interface
    @Override
    public void takePhoto() {
           
    }
    @Override
    public void changeAperture() {
           
    }
    @Override
    public void changeShutterSpeed() {
        
    }
    @Override
    public void deletePhoto() {
        
    }
    
    //Phone interface
    @Override
    public void call(String phoneNumber) {
        
    }
    @Override
    public void sendSms(String phoneNumber, String Message) {
        
    }
    @Override
    public void hangUp() {
        
    }
    
}