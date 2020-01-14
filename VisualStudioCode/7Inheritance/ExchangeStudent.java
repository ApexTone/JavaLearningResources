// "final" means other class can't inherit from this class
public /*final*/ class ExchangeStudent extends Student{
    private String partnerUniversity;

    public String getPartnerUniversity() {
        return partnerUniversity;
    }

    public void setPartnerUniversity(String partnerUniversity) {
        this.partnerUniversity = partnerUniversity;
    }
}