public class Contact {
    private String firstName,lastName;
    private String phoneNumber;

    public Contact(String f,String l,String p)
    {
        setFirstName(f);
        setLastName(l);
        setPhoneNumber(p);
    }
    public Contact()
    {
        setFirstName("NONAME");
        setLastName("NOLASTNAME");
        setPhoneNumber("000000000");
    }



    public void setFirstName(String s)
    {
        this.firstName=Utilities.firstCap(s);
    }
    public void setLastName(String s)
    {
        this.lastName=Utilities.firstCap(s);
    }
    public void setPhoneNumber(String s)
    {
        //Replace all non numeric character with ""
        String temp=s.replaceAll("[\\D]","");// \D->non numeric character
        
        if(temp.length()<=10 && temp.length()>=9)
            this.phoneNumber=temp;
        else
            throw new IllegalArgumentException("Phone number length must be between 9-10 characters");
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getPhoneNumber()
    {
        return formattedPhoneNumber();
    }


    private String formattedPhoneNumber()
    {
        if(phoneNumber.length()==9)//Household phone
        {
            //Split data to 3 groups accord to their length ($m means group n). Each group assign by using (...)
            return phoneNumber.replaceAll("(\\d{2})(\\d{3})(\\d{4})", "($1) $2 $3");
        }
        else if(phoneNumber.length()==10)//Mobile phone
        {
            //Split data to 3 groups accord to their length ($m means group n). Each group assign by using (...)
            return phoneNumber.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1) $2 $3");
        }
        else
        {
            return phoneNumber;
        }
    }
    

    @Override
    public String toString()
    {
        return firstName + "  " + lastName + "  "+phoneNumber+"\n";
    }
}