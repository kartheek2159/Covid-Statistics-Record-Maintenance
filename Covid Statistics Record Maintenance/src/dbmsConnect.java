import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class dbmsConnect 
{
    static String username = "root";
    static String password = "Kartheek@02";
    static String url = "jdbc:mysql://localhost:3306/oops";

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties connectionProperties = new Properties();//Stores username and password as properties
            connectionProperties.put("user",username);
            connectionProperties.put("password",password);
            con = DriverManager.getConnection(url,connectionProperties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}