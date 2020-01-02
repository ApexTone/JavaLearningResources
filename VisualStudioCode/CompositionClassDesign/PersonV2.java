import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

//Using conposition idea to implement this class
public class PersonV2 {
    private PersonName nameEn,nameTh;//Using conposition idea
    private LocalDate bd;
    
    //private String mobileNum,homeNum,officeNum,mobileNum2,mobileNum3;//Mem this in Map<> instead
    private Map<String,String> phone = new HashMap<String,String>();
    
    public Map<String, String> getPhone() {
        return phone;
    }
    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }



    public PersonV2(PersonName a,PersonName b, LocalDate bd){
        this.nameEn=a;
        this.nameTh=b;
        this.bd=bd;
    }
    public PersonV2(){
    }

    public LocalDate getBd() {
        return bd;
    }
    public PersonName getNameEn() {
        return nameEn;
    }

    public PersonName getNameTh() {
        return nameTh;
    }

    public void setBd(LocalDate bd) {
        this.bd = bd;
    }
    public void setNameEn(PersonName nameEn) {
        this.nameEn = nameEn;
    }
    public void setNameTh(PersonName nameTh) {
        this.nameTh = nameTh;
    }


    @Override
    public String toString(){
        return nameEn+"\n"+nameTh+"\n"+bd;
    }
}