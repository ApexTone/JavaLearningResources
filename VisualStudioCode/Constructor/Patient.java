public class Patient extends Person{//Inherited from Person class
    private double weight,height;
    
    //Creating object from subclass will use Superclass constructor as well
    public Patient()
    {
        System.out.println("New patient");
    }
    public Patient(String firstName,String lastName,String nickName, String gender,double weight,double height)
    {
        super(firstName,lastName,nickName,gender);//Use super class constructor
        System.out.println("New patient");
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString()
    {
        return super.toString()+ " " + height + " " + weight;
    }
}