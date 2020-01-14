public class Country {
    private String nameTh,nameEn;
    public Country() {
    }
    public Country(String nameTh, String nameEn) {
        setNameEn(nameEn);
        setNameTh(nameTh);
    }

    public String getNameTh() {
        return nameTh;
    }
    public void setNameTh(String nameTh) {
        this.nameTh = nameTh.toUpperCase();
    }

    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) { this.nameEn = nameEn.toUpperCase(); }

    @Override
    public String toString() {
        return "Country{" +
                "nameTh='" + nameTh + '\'' +
                ", nameEn='" + nameEn + '\'' +
                '}';
    }
}
