package model.ModAdmin;

import controller.db.StatementDbSQL;
import java.sql.ResultSet;

public class ModAdmin {

    protected StatementDbSQL NewStatement = new StatementDbSQL();
    protected boolean  AuthVerify = NewStatement.getAuthVerify();
    static ResultSet RSSQL;
    
    public ResultSet ModAdmin_GetUsers() {
        
        if(AuthVerify)
           this.RSSQL = NewStatement.GenerateStatement_GetUsers();
        
        return this.RSSQL;
    }
}
