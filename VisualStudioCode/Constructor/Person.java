public class Person {
    private String firstName,lastName,nickName,gender;
    //Default constuctor
    public Person()
    {
        System.out.println("Creating person");
        firstName="NONAME";
        lastName="NOLASTNAME";
        nickName="NONICKNAME";
        gender="NOGENDER";
    }
    //Constructor
    public Person(String a,String b,String c,String d)
    {
        System.out.println("Creating person");
        setFirstName(a);
        setLastName(b);
        setNickName(c);
        setGender(d);
    }
    //Override constructor
    public Person(String a,String b)
    {
        System.out.println("Creating person");
        setFirstName(a);
        setLastName(b);

        //or using chain constructor
        //this(a,b,"NONICKNAME","NOGENDER");
    }
    //Chain constructor: Using old constructor with different constuctor
    public Person(String a,String b,String c)
    {
        this(a,b,c,"NOGENDER");//Reference with 4 arguments constuctor
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getNickName()
    {
        return nickName;
    }
    public String getGender()
    {
        return gender;
    }

    public void setFirstName(String s)
    {
        firstName=s.trim().substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public void setLastName(String s)
    {
        lastName=s.trim().substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public void setNickName(String s)
    {
        nickName=s.trim().substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public void setGender(String s)
    {
            gender=s;
    }


    @Override
    public String toString()
    {
        return getFirstName()+" "+getLastName()+" "+getGender()+" "+getNickName()+"\n";
    }
}