
package controller.user.Employees;

import controller.db.ConnectionDbSQL;
import controller.db.StatementDbSQL;
import java.sql.ResultSet;

/**
 *
 * @author RODX
 */
public class EmployeesData {
    protected ConnectionDbSQL connection = new ConnectionDbSQL();
    protected StatementDbSQL newStatement = new StatementDbSQL();
    protected static ResultSet RtSet = null;
    
    /**
     * Methods
     */
    
    public ResultSet GetDataEmployees() {
        System.out.println();
        System.err.println("Start ED");
        EmployeesData.RtSet = newStatement.GenerateStatement_GetEmployees();
        System.out.println();
        System.err.println("Exit ED");
        return EmployeesData.RtSet;
    }
    
    public void setDataUser(int IdEmployees, byte[] ImageEmployees, String NameEmployees, String LastNameEmployees, String EmailEmployees , String AddressEmployees, String PasswordEmployees, String PhoneEmployees, Object StatusAdminEmployees, Object GenderEmployees) {
        System.out.println();
        System.err.println("Start ED");
        newStatement.GenerateStatement_SetEmployees(IdEmployees, ImageEmployees, NameEmployees, LastNameEmployees, EmailEmployees, AddressEmployees, PasswordEmployees, PhoneEmployees, StatusAdminEmployees, GenderEmployees);
        System.out.println();
        System.err.println("Exit ED");
    }
}
