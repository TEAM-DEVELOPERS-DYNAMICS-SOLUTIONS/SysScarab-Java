package controller.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class StatementDbSQL {

    protected ConnectionDbSQL connectionSQl = new ConnectionDbSQL(); 
    protected Connection connect; 
    protected Statement statementSQL = null;
    protected Map<String, String> mapResultUsers = new HashMap<String,String>();
    protected ResultSet RSSQL, RSSQLConnection; 
    protected static boolean  AuthVerify;

        public boolean getAuthVerify() {
            return this.AuthVerify;
        }  

        public void setAuthVerify(boolean AutVerify) {
            this.AuthVerify = AutVerify;
        } 
    
    public boolean GenerateStatement_Authentication(String pass, String Email ) {
        
        /*
         * Connection's Statement Basic Structure 
         */
        
        Statement statementSQL = null;
        connectionSQl.GenerateConnection();
        connect = connectionSQl.getConnection();

        try {
            System.err.println(".....................");
            System.out.println("created Statement...");
            statementSQL = connect.createStatement();
        } catch (SQLException e) {
            System.out.println("err to create StatementSQL: ");
            e.printStackTrace();	
        }

            if(statementSQL != null)
                    System.out.println("Statement created success");

            System.out.println();
        
        /*-----------------------------------------------------------------*/
            
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
    
    public Map<String, String> GenerateStatement_GetUsers () {
    
        Statement statementSQL = null;
        connectionSQl.GenerateConnection();
        connect = connectionSQl.getConnection();

        try {
            System.err.println("........................");
            System.out.println("created Statement...");
            statementSQL = connect.createStatement();
        } catch (SQLException e) {
            System.out.println("err to create StatementSQL: ");
            e.printStackTrace();	
        }

            if(statementSQL != null)
                    System.out.println("Statement created success");

            System.out.println();
            
        //aa
        
         try {			
            statementSQL.execute("Select * from employees;");
            this.RSSQL = statementSQL.getResultSet();	
            int n = 0;
            
            if(RSSQL.next()) {
                System.out.println("**searching Employees**");
                
                while(RSSQL.next()){
                    mapResultUsers.put("IdUser",RSSQL.getString("IdEmployees"));
                    mapResultUsers.put("NameUser",RSSQL.getString("nameEmployees"));
                    mapResultUsers.put("LastNameUser",RSSQL.getString("LastNameEmployees"));			
                    mapResultUsers.put("StatusAdminEmployees",RSSQL.getString("StatusAdminEmployees"));
                    mapResultUsers.put("StatusConnectionEmployees",RSSQL.getString("StatusConnectionEmployees"));
                    System.out.println(n + " Map: " + mapResultUsers);
                
                    n++;
                }
                
            }else{
                System.out.println("**err searching employees**");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

            System.out.println();

            connectionSQl.GenerateDisconnection();
            
        return mapResultUsers;
    }
}