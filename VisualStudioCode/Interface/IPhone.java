/**
 * ISmartPhone
 */
public interface IPhone {

    void call(String phoneNumber);
    void hangUp();
    void sendSms(String phoneNumber,String Message);
}