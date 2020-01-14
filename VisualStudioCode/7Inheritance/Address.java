/**
 * Address
 */
public class Address {

    private String street,building,amphur,province;

    public String getAmphur() {
        return amphur;
    }
    public String getBuilding() {
        return building;
    }
    public String getProvince() {
        return province;
    }
    public String getStreet() {
        return street;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setProvince(String province) {
        this.province = province;
    }
}