package controller.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatementDbSQL {

    protected ConnectionDbSQL connectionSQl = new ConnectionDbSQL(); 
    protected Connection connect; 
    protected static Statement statementSQL = null;
    protected Map<String, String> mapResultUsers = new HashMap<String,String>();
    protected static ResultSet RSSQL ;
    protected static boolean  AuthVerify;
    
    static List<Map<String,String>> Users  = new ArrayList();

        public boolean getAuthVerify() {
            return this.AuthVerify;
        }  

        public void setAuthVerify (boolean AutVerify) {
            this.AuthVerify = AutVerify;
        } 
    
    public Statement GenerateStatement () {
        /*
         * Connection's Statement Basic Structure 
         */

        connectionSQl.GenerateConnection();
        connect = connectionSQl.getConnection();

        try {
            System.err.println(".....................");
            System.out.println("created Statement...");
            this.statementSQL = connect.createStatement();
        } catch (SQLException e) {
            System.out.println("err to create StatementSQL: ");
            e.printStackTrace();	
        }

            if(statementSQL != null)
                    System.out.println("Statement created success");

            System.out.println();
            
        return statementSQL;
    };
        
    public boolean GenerateStatement_Authentication(String pass, String Email ) {
        
        GenerateStatement ();
            
        try {			
            statementSQL.execute("Select * from employees where PasswordEmployees = '" + pass + "' and EmailEmployees = '" + Email +"';");
            this.RSSQL = statementSQL.getResultSet();	

            if(RSSQL.next()) {
                System.out.println("**usuario loggeado**");
                mapResultUsers.put("IdUser",RSSQL.getString("IdEmployees"));
                mapResultUsers.put("NameUser",RSSQL.getString("nameEmployees"));
                mapResultUsers.put("LastNameUser",RSSQL.getString("LastNameEmployees"));			
                mapResultUsers.put("StatusAdminEmployees",RSSQL.getString("StatusAdminEmployees"));
                mapResultUsers.put("StatusConnectionEmployees",RSSQL.getString("StatusConnectionEmployees"));
                this.setAuthVerify(true);
            }else{
                System.out.println("**error al loggear al usuario**");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

            System.out.println();

            connectionSQl.GenerateDisconnection();
            
            return this.AuthVerify;
    }
    
    public ResultSet GenerateStatement_GetUsers () {
        GenerateStatement();
        
         try {			
            statementSQL.execute("Select IdEmployees, ImageEmployees, NameEmployees, LastNameEmployees, EmailEmployees, PasswordEmployees, AddressEmployees, PhoneEmployees, StatusConnectionEmployees, StatusAdminEmployees, GenderEmployees from employees;");
            
            this.RSSQL = statementSQL.getResultSet();

        } catch (SQLException e) {
            e.printStackTrace();
        }

            System.out.println();
            
        return RSSQL;
    }
}