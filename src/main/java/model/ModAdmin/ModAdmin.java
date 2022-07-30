package model.ModAdmin;

import controller.db.StatementDbSQL;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModAdmin {
    
    protected StatementDbSQL NewStatement = new StatementDbSQL();
    protected boolean  AuthVerify = NewStatement.getAuthVerify();
    static ArrayList UserList;
    
    public ArrayList ModAdmin_GetUsers() {
        if(AuthVerify)
           ModAdmin.UserList = NewStatement.GenerateStatement_GetUsers();
        return ModAdmin.UserList;
    }
}
