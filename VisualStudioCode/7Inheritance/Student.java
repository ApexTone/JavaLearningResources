public class Student extends Person{//Inherit from Person super class
    private String major,faculty;
    private Address addr;//Can't inherit multiple class in Java

    public String getMajor() {
        return major;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
}