package controller.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.DataStored;

public class StatementDbSQL {
    
    protected ConnectionDbSQL connectionSQl = new ConnectionDbSQL(); 
    protected Connection connect; 
    protected static Statement statementSQL = null;
    protected static PreparedStatement preStatementSQL = null;
    protected static Map<String, String> mapResultUsers = new HashMap<>();
    protected static ArrayList ListUsers = null;
    protected static ResultSet RSSQL = null;
    protected static boolean AuthVerify = false;
    
    private final String getUserSQL = "Select IdEmployees, ImageEmployees, NameEmployees, LastNameEmployees, EmailEmployees, PasswordEmployees, AddressEmployees, PhoneEmployees, StatusConnectionEmployees, StatusAdminEmployees, GenderEmployees from employees;";
    private final String setUserSQl = "insert into employees (IdEmployees, ImageEmployees, NameEmployees, LastNameEmployees, EmailEmployees, PasswordEmployees, AddressEmployees, PhoneEmployees, StatusConnectionEmployees, StatusAdminEmployees, GenderEmployees) values ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?);"; 
    
    
    // - getters
    public boolean getAuthVerify() {
        return StatementDbSQL.AuthVerify;
    }  

    public Map<String,String> getMapRSSQL() {
        return StatementDbSQL.mapResultUsers;
    }
    
    // - Setters 
    public void setAuthVerify (boolean AutVerify) {
        StatementDbSQL.AuthVerify = AutVerify;
    }

    // - Methods 
    public Statement GenerateStatement () {

        connectionSQl.GenerateConnection();
        connect = connectionSQl.getConnection();

        try {
            System.err.println(".....................");
            System.out.println("created Statement....");
            StatementDbSQL.statementSQL = connect.createStatement();
        } catch (SQLException e) {
            System.out.println("err to create StatementSQL");
        }
        if(statementSQL != null)
            System.out.println("Statement created success");
        
        System.out.println();   
        return statementSQL;
    };
        
    public boolean GenerateStatement_Authentication(String pass, String Email) {
        GenerateStatement ();  
        try {			
            statementSQL.execute("Select * from employees where PasswordEmployees = '" + pass + "' and EmailEmployees = '" + Email +"';");
            StatementDbSQL.RSSQL = statementSQL.getResultSet();
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
            System.out.println("err to create StatementSQL");
        }

        System.out.println();
        connectionSQl.GenerateDisconnection();  
        return StatementDbSQL.AuthVerify;
    }

    public void GenerateStatement_SetUser (DataStored DS) {
        try {
            preStatementSQL = connect.prepareStatement(setUserSQl);
            preStatementSQL.setInt(1, DS.getIdEmployees());
            preStatementSQL.setBytes(2, DS.getImageEmployees());
            preStatementSQL.setString(3, DS.getNameEmployees());
            preStatementSQL.setString(4, DS.getLastNameEmployees());
            preStatementSQL.setString(5, DS.getAddressEmployees());
            preStatementSQL.setString(6, DS.getPhoneEmployees());
            preStatementSQL.setString(7, DS.getStatusConnectionEmployees());
            preStatementSQL.setString(7, DS.getStatusAdminEmployees());
            preStatementSQL.setString(7, DS.getGenderEmployees());
            preStatementSQL.executeUpdate();    
        } catch (SQLException ex) {
        } finally {
            try {
                preStatementSQL.close();
            } catch (SQLException ex) {
            }
        }
    }

    public ArrayList GenerateStatement_GetUsers () {
                
        try {
            RSSQL = GenerateStatement().executeQuery(setUserSQl);
            while (RSSQL.next()) {
               DataStored DSUser = new DataStored();
               DSUser.setIdEmployees(RSSQL.getInt("IdEmployees"));
               DSUser.setImageEmployees(RSSQL.getBytes("ImageEmployees"));
               DSUser.setNameEmployees(RSSQL.getString("NameEmployees"));
               DSUser.setLastNameEmployees(RSSQL.getString("LastNameEmployees"));
               DSUser.setAddressEmployees(RSSQL.getString("AddressEmployees"));
               DSUser.setPhoneEmployees(RSSQL.getString("PhoneEmployees"));
               DSUser.setStatusConnectionEmployees(RSSQL.getString("StatusConnectionEmployees"));
               DSUser.setStatusAdminEmployees(RSSQL.getString("StatusAdminEmployees"));
               DSUser.setGenderEmployees(RSSQL.getString("GenderEmployees"));
            }    
        } catch (Exception e) {
            System.out.println("err to create StatementSQL");
            return null;
        }
        
        System.out.println();    
        return ListUsers ;
    }
}
