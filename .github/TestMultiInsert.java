import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TestMultiInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/e4";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			
			java.sql.Statement statement = connection.createStatement();
			String query="INSERT INTO person VALUES(?,?,?,?,?)";
			
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, 80);
			ps.setString(2, "Lily");
			ps.setInt(3, 28);
			ps.setString(4, "lily@gmail.com");
			ps.setInt(5, 9900088);
			ps.addBatch();
			
			ps.setInt(1, 90);
			ps.setString(2, "Welvina");
			ps.setInt(3, 23);
			ps.setString(4, "welvina@gmail.com");
			ps.setInt(5, 4903820);
			ps.addBatch();
			
			ps.setInt(1, 180);
			ps.setString(2, "Lovely");
			ps.setInt(3, 48);
			ps.setString(4, "lovely@gmail.com");
			ps.setInt(5, 99345088);
			ps.addBatch();
			
			
			connection.close();
			}  
			catch (SQLException | ClassNotFoundException e) { }
	}

}
