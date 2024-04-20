/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Azure;
///import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Robert Donnan
 */
public class Connections {
    public static Connection con;
    public static String dbFile = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbUrl = "jdbc:sqlserver://foodbankdb.database.windows.net:1433;database=foodbankapp";

public static java.sql.Connection getConnection(){
    try{
        con = (java.sql.Connection) DriverManager.getConnection(dbUrl,"CloudSA3d7d8311","MerQ7?zKHp87");
        }catch(SQLException Ex){
            System.out.println("An error has occurred "+Ex);
            
        }
        
        return con;
    }
    
}
