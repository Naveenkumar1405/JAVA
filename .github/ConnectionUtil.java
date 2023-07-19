import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		try 
		{
			Class.forName(AppConstants.DRIVER_NAME);
			return DriverManager.getConnection(AppConstants.URL, AppConstants.USER_NAME, AppConstants.PASSWORD );
		}
		catch(ClassNotFoundException | SQLException e)	{}
		return null;
	}
}
