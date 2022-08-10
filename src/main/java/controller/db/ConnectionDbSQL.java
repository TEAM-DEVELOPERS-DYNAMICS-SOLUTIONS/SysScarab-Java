package controller.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDbSQL {

    //<editor-fold defaultstate="colapsed" desc="* Variables">
    protected String urlConnectionSQL = "jdbc:mysql://localhost/sysdatabase_scarab?userTimeZone=true&serverTimeZone=true";
    protected String userConnectionSQL = "root";
    protected String passwordConnectionSQL = "root";
    protected Connection connectionSQl = null;
    //</editor-fold>
    
    //<editor-fold defaultstate="colapsed" desc="** Getters & Setters">
    protected void setConnectionSQl(Connection connectionSQl) {
        this.connectionSQl = connectionSQl;
    }

    protected Connection getConnection() {
        return this.connectionSQl;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="colapsed" desc="*** Methods">
    public void GenerateConnection() {
        System.out.println("Start CDS_GC");
        try {
            System.out.println("Flag CDS: stablishing connection...");
            connectionSQl = DriverManager.getConnection(urlConnectionSQL, userConnectionSQL, passwordConnectionSQL);
            if (this.connectionSQl != null) {
                this.setConnectionSQl(connectionSQl);
            }
        } catch (SQLException e) {
            System.out.println("Flag CDS: err to stablish connection SQL: ");
            e.printStackTrace();
        }

        if (this.connectionSQl != null) {
            System.out.println("Flag CDS: stablishing connection success");
        }
        System.out.println("Exit CDS GC");
    }

    public void GenerateDisconnection() {
        System.out.println("Start CDS_GD");
        try {
            System.out.println("Flag CDS: Closing connection...");
            connectionSQl.close();
            setConnectionSQl(null);
        } catch (SQLException e) {
            System.out.println("Flag CDS: err to close connection SQL: ");
            e.printStackTrace();
        }

        if (this.connectionSQl == null) {
            System.out.println("Flag CDS: Close connection success");
        }
        System.out.println("Exit CDS_GD");
    }
    //</editor-fold>
}
