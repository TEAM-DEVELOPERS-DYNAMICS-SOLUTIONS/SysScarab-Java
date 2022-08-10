package model;

/**
 *
 * @author RODX
 */
public class DataStored {
    
    //<editor-fold defaultstate="colapsed" desc="* Variables">
    protected Integer IdEmployees;
    protected byte[] ImageEmployees;
    protected String NameEmployees;
    protected String LastNameEmployees;
    protected String EmailEmployees;
    protected String AddressEmployees;
    protected String PasswordEmployees;
    protected String PhoneEmployees;
    protected String StatusConnectionEmployees;
    protected Object StatusAdminEmployees;
    protected Object GenderEmployees;
    //</editor-fold>
    
    //<editor-fold defaultstate="colapsed" desc="** Getters & Setters">
    //<editor-fold defaultstate="colapsed" desc="get">
    public Integer getIdEmployees() {
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

    public String getPasswordEmployees() {
        return PasswordEmployees;
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

    public Object getStatusAdminEmployees() {
        return StatusAdminEmployees;
    }

    public Object getGenderEmployees() {
        return GenderEmployees;
    }
    //</editor-fold>
    //<editor-fold defaultstate="colapsed" desc="Set">
    public void setIdEmployees(Integer IdEmployees) {
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

    public void setPasswordEmployees(String PasswordEmployees) {
        this.PasswordEmployees = PasswordEmployees;
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

    public void setStatusAdminEmployees(Object StatusAdminEmployees) {
        this.StatusAdminEmployees = StatusAdminEmployees;
    }

    public void setGenderEmployees(Object GenderEmployees) {
        this.GenderEmployees = GenderEmployees;
    }
    //</editor-fold>
    //</editor-fold>
}
