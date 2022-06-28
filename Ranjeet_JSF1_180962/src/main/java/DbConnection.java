import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	 protected static Connection initializeDatabase()
		        throws SQLException, ClassNotFoundException
		    {
		        // Initialize all the information regarding
		        // Database Connection
		       String dbDriver = "com.mysql.jdbc.Driver";
		        String dbURL = "jdbc:mysql://localhost:3306/test";
		        // Database name to access
		        //String dbName = "test";
		        String dbUsername = "root";
		        String dbPassword = "rana1421";
		  
		        Class.forName(dbDriver);
		        Connection con = (Connection) DriverManager.getConnection(dbURL , dbUsername, dbPassword);
		        return con;
		    }
}
