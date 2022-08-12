package controller.user.authenticationUser;

import controller.db.ConnectionDbSQL;
import controller.db.StatementDbSQL;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RODX
 */
public class AuthenticationUser {

    //<editor-fold defaultstate="colapsed" desc="* Variables">
    protected ConnectionDbSQL connection = new ConnectionDbSQL();
    protected Map<String, Object> mapRtSet_Auth = new HashMap<>();
    protected StatementDbSQL newStatement = new StatementDbSQL();
    protected static ResultSet RtSet = null;
    private String Pass, Email;
    private boolean AuthVerify;
    //</editor-fold>

    //<editor-fold defaultstate="colapsed" desc="** Getters & Setters">
    public boolean GetAuthVerify() {
        AuthVerify = newStatement.getAuthVerify();
        return AuthVerify;
    }

    public Map<String, Object> getMapRtSet_Auth() {
        return mapRtSet_Auth;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPass(String Pass) {
        String sha1 = "";
        
	try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
	    digest.reset();
	    digest.update(Pass.getBytes("utf8"));
	    sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
	} catch (Exception e){
	    e.printStackTrace();
	}
        
        this.Pass = sha1;
    }

    public void setMapRtSet_Auth(Map<String, Object> mapRtSet_Auth) {
        this.mapRtSet_Auth = mapRtSet_Auth;
    }
    //</editor-fold>

    //<editor-fold defaultstate="colapsed" desc="*** Methods">
    public Map<String, Object> GetDataUser() {
        System.out.println();
        System.err.println("Start AU");
        RtSet = newStatement.GenerateStatement_Authentication(Pass, Email);

        try {
            if (RtSet.next()) {
                mapRtSet_Auth.put("IdUser", RtSet.getInt("IdEmployees"));
                mapRtSet_Auth.put("NameUser", RtSet.getString("nameEmployees"));
                mapRtSet_Auth.put("LastNameUser", RtSet.getString("LastNameEmployees"));
                mapRtSet_Auth.put("StatusAdminEmployees", RtSet.getString("StatusAdminEmployees"));
                mapRtSet_Auth.put("StatusConnectionEmployees", RtSet.getString("StatusConnectionEmployees"));
            }
        } catch (SQLException e) {
            System.err.println("Flag AU: err to get data User: ");
            e.printStackTrace();
        }

        System.out.println();
        System.err.println("Exit AU");
        System.out.println("-------");
        return mapRtSet_Auth;
    }
    //</editor-fold>
}
