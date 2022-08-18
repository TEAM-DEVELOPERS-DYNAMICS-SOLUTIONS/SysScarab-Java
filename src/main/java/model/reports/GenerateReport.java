package model.reports;

import controller.db.ConnectionDbSQL;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RODX
 */
public class GenerateReport {
   
    public void GenerateReport_EmployeesLogs () {
        ConnectionDbSQL CDbSQL = new ConnectionDbSQL();
        CDbSQL.GenerateConnection();
        Connection con = CDbSQL.getConnection();
        try {
            JasperReport JR = JasperCompileManager.compileReport("src/test/java/model/reports/reportsEmployees/Report_OldEmployees.jrxml");
            JasperPrint JP = JasperFillManager.fillReport(JR, null, con);
            JasperViewer.viewReport(JP, true);
        } catch (JRException ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al Visualizar el Reporte: " + ex);
        }
        CDbSQL.GenerateDisconnection();
    };    
}
