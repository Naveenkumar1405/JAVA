import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestUpdate {

	public static void main(String[] args) {
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3307/e4?user=root&password=root";
			String user="root";
			String pass="root";
			Connection connection = DriverManager.getConnection(url);
			String sql="UPDATE person SET name=?,age=?,email=?,WHERE id=?";
			
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, 205);
			ps.setString(2, "Pooja");
			ps.setInt(3, 23);
			ps.setString(4, "pooja@gmail.com");
			ps.setInt(5, 763893);
			
		}
		catch(SQLException e){	
			System.out.println("1");
		}
	}

}
