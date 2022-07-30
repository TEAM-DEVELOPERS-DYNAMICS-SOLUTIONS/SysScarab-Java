package controller.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDbSQL {
    
    protected String urlConnectionSQL = "jdbc:mysql://localhost/sysdatabase_scarab?userTimeZone=true&serverTimeZone=true" ;
    protected String userConnectionSQL = "root";
    protected String passwordConnectionSQL = "root";
    protected Connection connectionSQl = null;
    
    protected void setConnectionSQl(Connection connectionSQl) {
        this.connectionSQl = connectionSQl;
    }
    
    protected Connection getConnection() {
        return this.connectionSQl;
    }

    public void GenerateConnection () {
        try {
            System.err.println("");
            System.out.println("stablishing connection...");
            connectionSQl = DriverManager.getConnection(urlConnectionSQL , userConnectionSQL , passwordConnectionSQL);
            
        if(this.connectionSQl != null)
                this.setConnectionSQl(connectionSQl);
        
        } catch (SQLException e) {
            System.out.println("err to stablish connection SQL: ");
            e.printStackTrace();
        }

        if(this.connectionSQl != null)
            System.out.println("stablishing connection success");        
    }
	
    public void GenerateDisconnection () {
        try {
            System.out.println("Closing connection...");
            connectionSQl.close();
            setConnectionSQl(null);
        } catch (SQLException e) {
            System.out.println("err to close connection SQL: ");
            e.printStackTrace();
        }
        
        if(this.connectionSQl == null)
            System.out.println("Close connection success");
    }
 }
