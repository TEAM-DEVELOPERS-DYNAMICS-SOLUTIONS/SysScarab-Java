package controller.user.authenticationUser;

import java.util.List;
import java.util.Map;

import controller.db.StatementDbSQL;

public class AuthenticationUser {
    protected String EmailSQL;
    protected String PassSQL;
    protected String StatusConnection;
    protected boolean AuthVerify;

    public boolean getAuthVerify(){
        return this.AuthVerify;
    };

    public String getEmailSQL() {
            return EmailSQL;
    }

    public void setEmailSQL(String Email) {
            this.EmailSQL = Email;
    }

    public String getPassSQL() {
            return PassSQL;
    }

    public void setPassSQL(String Pass) {
            this.PassSQL = Pass;
    }

    public String getStatusConnection() {
            return StatusConnection;
    }

    public void setStatusConnection(String statusConnection) {
            this.StatusConnection = statusConnection;
    }

    public void connectAuthenticator () {
            System.out.println("···Authentication User···");
            System.out.println();
            System.out.println("in process Authentication...");

            StatementDbSQL NewStatement = new StatementDbSQL(); 		
            NewStatement.GenerateStatement_Authentication(PassSQL , EmailSQL);
            AuthVerify = NewStatement.getAuthVerify();
    }		
}
	

