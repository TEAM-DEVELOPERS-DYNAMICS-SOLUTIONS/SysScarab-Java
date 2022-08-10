package controller.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RODX
 */
public class StatementDbSQL {
    
    //<editor-fold defaultstate="colapsed" desc="* Variables">
    protected ConnectionDbSQL newConnection = new ConnectionDbSQL();
    protected Connection connect;
    protected static ResultSet RtSet = null;
    protected static Statement newStatement = null;
    protected static PreparedStatement newPreStatement = null;
    protected static boolean AuthVerify = false;
    //</editor-fold>
    
    //<editor-fold defaultstate="colapsed" desc="** Getters & Setters">
    public boolean getAuthVerify() {
        return StatementDbSQL.AuthVerify;
    }

    public void setAuthVerify(boolean AutVerify) {
        StatementDbSQL.AuthVerify = AutVerify;
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="*** Methods">
    
    /**
     * el sistema aun no esta optimizado!
     * Faltan uno cuantos ajustes para mejorar y generalizar mas los metodos.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generators">  
    public Statement GenerateStatement() {
        System.err.println("");
        System.err.println("Start SDS_GSt");
        newConnection.GenerateConnection();
        connect = newConnection.getConnection();

        try {

            System.out.println("Flag SDS: created Statement....");
            StatementDbSQL.newStatement = connect.createStatement();
        } catch (SQLException e) {
            System.out.println("Flag SDS: err to create Prepared Statement: ");
            e.printStackTrace();
        }

        if (newStatement != null) {
            System.out.println("Flag SDS: Prepared Statement created success");
        }

        System.err.println("Exit SDS_GSt");
        System.out.println();
        return StatementDbSQL.newStatement;
    }

    public PreparedStatement GeneratePreparedStament(String SenteceSQL) {
        System.err.println("");
        System.err.println("Start SDS_GPSt");
        newConnection.GenerateConnection();
        connect = newConnection.getConnection();

        try {

            System.out.println("Flag SDS: created Prepare Statement....");
            StatementDbSQL.newPreStatement = connect.prepareStatement(SenteceSQL);
        } catch (SQLException e) {
            System.out.println("Flag SDS: err to create Prepare Statement: ");
            e.printStackTrace();
        }

        if (newStatement != null) {
            System.out.println("Flag SDS: Prepare Statement created success");
        }

        System.err.println("Exit SDS_GPSt");
        System.out.println();
        return StatementDbSQL.newPreStatement;
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Employees Methods">
    public ResultSet GenerateStatement_Authentication(String Pass, String Email) {
        System.err.println("");
        System.err.println("Start SDS_A");
        GenerateStatement();

        try {
            newStatement.execute("Select * from employees where PasswordEmployees = '" + Pass + "' and EmailEmployees = '" + Email + "';");
            StatementDbSQL.RtSet = newStatement.getResultSet();
            if (RtSet.next()) {
                System.out.println("Flag SDS: **usuario loggeado**");
                setAuthVerify(true);
            } else {
                System.out.println("Flag SDS: **err to loggin user**");
            }
        } catch (SQLException e) {
            System.out.println("Flag SDS: err to create StatementSQL: ");
            e.printStackTrace();
        }

        System.out.println();
        //newConnection.GenerateDisconnection();
        System.err.println("Exit SDS_A");
        System.out.println();
        return StatementDbSQL.RtSet;
    }

    public ResultSet GenerateStatement_GetEmployees() {
        System.out.println();
        System.err.println("Start SDS_GE");
        GenerateStatement();

        try {
            newStatement.execute("SELECT * FROM EMPLOYEES;");
            RtSet = newStatement.getResultSet();
        } catch (SQLException e) {
            System.out.println("Flag SDS: err to execute query *getEmployees*");
            e.printStackTrace();
        }

        System.err.println("Exit SDS_GE");
        System.out.println();
        return StatementDbSQL.RtSet;
    }

    public void GenerateStatement_SetEmployees(int IdEmployees, byte[] ImageEmployees, String NameEmployees, String LastNameEmployees, String EmailEmployees, String AddressEmployees, String PasswordEmployees, String PhoneEmployees, Object StatusAdminEmployees, Object GenderEmployees) {
        System.out.println();
        System.err.println("Start SDS_SE");

        try {
            newPreStatement = GeneratePreparedStament("INSERT INTO employees (IdEmployees, ImageEmployees, NameEmployees, LastNameEmployees, EmailEmployees, PasswordEmployees, AddressEmployees, PhoneEmployees, StatusAdminEmployees, GenderEmployees) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ?);");
            newPreStatement.setInt(1, IdEmployees);
            newPreStatement.setBytes(2, ImageEmployees);
            newPreStatement.setString(3, NameEmployees);
            newPreStatement.setString(4, LastNameEmployees);
            newPreStatement.setString(5, EmailEmployees);
            newPreStatement.setString(6, PasswordEmployees);
            newPreStatement.setString(7, AddressEmployees);
            newPreStatement.setString(8, PhoneEmployees);
            newPreStatement.setObject(9, StatusAdminEmployees);
            newPreStatement.setObject(10, GenderEmployees);
            newPreStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Flag SDS: err to execute query *setEmployees*");
            e.printStackTrace();
        }

        System.err.println("Exit SDS_SE");
        System.out.println();
    }

    public void GenerateStatement_UpdateEmployees(byte[] ImageEmployees, String NameEmployees, String LastNameEmployees, String EmailEmployees, String PasswordEmployees, String AddressEmployees, String PhoneEmployees, Object GenderEmployees, int IdEmployees) {
        System.out.println();
        System.err.println("Start SDS_UE");

        try {
            newPreStatement = GeneratePreparedStament("UPDATE employees SET ImageEmployees = ?, NameEmployees = ?, LastNameEmployees = ?, EmailEmployees = ?, PasswordEmployees = ?, AddressEmployees = ?, PhoneEmployees = ?, GenderEmployees = ?  WHERE IdEmployees = ?;");
            newPreStatement.setBytes(1, ImageEmployees);
            newPreStatement.setString(2, NameEmployees);
            newPreStatement.setString(3, LastNameEmployees);
            newPreStatement.setString(4, EmailEmployees);
            newPreStatement.setString(5, PasswordEmployees);
            newPreStatement.setString(6, AddressEmployees);
            newPreStatement.setString(7, PhoneEmployees);
            newPreStatement.setString(8,(String) GenderEmployees);
            newPreStatement.setInt(9, IdEmployees);
            newPreStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Flag SDS: err to execute query *UpdateEmployees*");
            e.printStackTrace();
        }

        System.err.println("Exit SDS_UE");
        System.out.println();
    }
    
    public void GenerateStatement_DeleteEmployees(Object ConditionWhere){
        System.out.println();
        System.err.println("Start SDS_DE");
        
        try {
            newPreStatement = GeneratePreparedStament("delete from employees where IdEmployees = ?;");
            newPreStatement.setObject(1, ConditionWhere);
            newPreStatement.executeUpdate();
        } catch  (Exception e) {
            e.printStackTrace();
        }
        
        System.err.println("Exit SDS_DE");
        System.out.println();
    }
    // </editor-fold> 
    // </editor-fold>
}
