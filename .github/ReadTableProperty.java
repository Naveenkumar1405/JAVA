import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ReadTableProperty 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/e4";
			FileInputStream fis=new FileInputStream("mydbinfo.properties");
			
			Properties properties =new Properties();
			properties.load(fis);
			
			Connection connection =DriverManager.getConnection(url, properties);
			System.out.print("Connected");
			
			}
			catch(ClassNotFoundException | IOException | SQLException e) {}
	}

}
