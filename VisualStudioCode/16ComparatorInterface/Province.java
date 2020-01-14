public class Province {
    private String nameTh,nameEn,abbr;
    private float area;
    private int nameThLength;
    
    public Province(){
    }
    public Province(String nameTh,String nameEn,String abbr,float area){
        this.nameEn=nameEn;
        this.nameTh=nameTh;
        this.abbr=abbr;
        this.area=area;
        this.nameThLength=this.nameTh.length();
    }

    public String getNameTh() {
        return nameTh;
    }
    public String getNameEn() {
        return nameEn;
    }
    public String getAbbr() {
        return abbr;
    }
    public float getArea(){
        return area;
    }
    public int getNameThLength() {
        return nameThLength;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }
    public void setNameTh(String nameTh) {
        this.nameTh = nameTh;
        this.nameThLength=this.nameTh.length();
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }
    public void setArea(float area) {
        this.area=area;
    }
}