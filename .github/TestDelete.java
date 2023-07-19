import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/e4";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			
			java.sql.Statement statement = connection.createStatement();
			String sql="DELETE FROM e4 WHERE id=102";
			int res=statement.executeUpdate(sql);
			System.out.println(res);
			connection.close();
			}  
			catch (SQLException | ClassNotFoundException e) { }
	}

}
