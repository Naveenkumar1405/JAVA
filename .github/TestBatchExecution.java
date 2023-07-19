import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestBatchExecution {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/e4";
			String user="root";
			String password="root";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");
			
			java.sql.Statement statement = connection.createStatement();
			String sql="UPDATE person SET name='NAVI' WHERE id=101";
			
			String update="UPDATE person SET name='ABD' WHERE name='Naveen'";
			statement.addBatch(sql);
			statement.addBatch(update);
			int[] batch=statement.executeBatch();
			for(Integer a:batch) System.out.println(a);
			connection.close();
			}  
			catch (SQLException | ClassNotFoundException e) { }
	}

}
