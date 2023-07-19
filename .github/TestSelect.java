import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {

	public static void main(String[] args) {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/e4";
		String user="root";
		String password="root";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		Statement statement=connection.createStatement();
		String sql="SELECT * FROM person";
		boolean res=statement.execute(sql);
		System.out.println(res);
		ResultSet rs=statement.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
			System.out.println(rs.getObject(3));
		}
		System.out.println(rs);
		connection.close();
		
	}

}
