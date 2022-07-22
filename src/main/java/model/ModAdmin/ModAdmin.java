package model.ModAdmin;

import controller.db.StatementDbSQL;

public class ModAdmin {

    protected StatementDbSQL NewStatement = new StatementDbSQL();
    protected boolean  AuthVerify = NewStatement.getAuthVerify();
    
    public void ModAdmin_GetUsers() {
        
        if(AuthVerify)
            NewStatement.GenerateStatement_GetUsers();
        else
            System.out.println("err run ModAdmin");
    }
}
