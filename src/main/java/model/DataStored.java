package model;

/**
 *
 * @author RODX
 */
public class DataStored {
    protected int IdEmployees;
    protected byte[] ImageEmployees;
    protected String NameEmployees;
    protected String LastNameEmployees;
    protected String EmailEmployees;
    protected String AddressEmployees;
    protected String PhoneEmployees;
    protected String StatusConnectionEmployees;
    protected String StatusAdminEmployees;
    protected String GenderEmployees;
    
    // - Getters 
    public int getIdEmployees() {
        return IdEmployees;
    }

    public byte[] getImageEmployees() {
        return ImageEmployees;
    }

    public String getNameEmployees() {
        return NameEmployees;
    }

    public String getLastNameEmployees() {
        return LastNameEmployees;
    }

    public String getEmailEmployees() {
        return EmailEmployees;
    }

    public String getAddressEmployees() {
        return AddressEmployees;
    }

    public String getPhoneEmployees() {
        return PhoneEmployees;
    }

    public String getStatusConnectionEmployees() {
        return StatusConnectionEmployees;
    }

    public String getStatusAdminEmployees() {
        return StatusAdminEmployees;
    }

    public String getGenderEmployees() {
        return GenderEmployees;
    }

    
    // - Setters 
    public void setIdEmployees(int IdEmployees) {
        this.IdEmployees = IdEmployees;
    }

    public void setImageEmployees(byte[] ImageEmployees) {
        this.ImageEmployees = ImageEmployees;
    }

    public void setNameEmployees(String NameEmployees) {
        this.NameEmployees = NameEmployees;
    }

    public void setLastNameEmployees(String LastNameEmployees) {
        this.LastNameEmployees = LastNameEmployees;
    }

    public void setEmailEmployees(String EmailEmployees) {
        this.EmailEmployees = EmailEmployees;
    }

    public void setAddressEmployees(String AddressEmployees) {
        this.AddressEmployees = AddressEmployees;
    }

    public void setPhoneEmployees(String PhoneEmployees) {
        this.PhoneEmployees = PhoneEmployees;
    }

    public void setStatusConnectionEmployees(String StatusConnectionEmployees) {
        this.StatusConnectionEmployees = StatusConnectionEmployees;
    }

    public void setStatusAdminEmployees(String StatusAdminEmployees) {
        this.StatusAdminEmployees = StatusAdminEmployees;
    }

    public void setGenderEmployees(String GenderEmployees) {
        this.GenderEmployees = GenderEmployees;
    }
}
