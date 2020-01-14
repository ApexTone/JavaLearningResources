public class Main {

    public static void main(String[] args) {
        Contact p1 = new Contact();
        p1.setFirstName("ASDF");//First cap only
        p1.setLastName("NANANA");//First cap only
        p1.setPhoneNumber("08-12600-066");//Only number
        System.out.println(p1.getPhoneNumber());

        Contact p2=new Contact("bruce","wayne","066669420");
        System.out.println(p2);
    }
}