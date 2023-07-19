import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class AlternateConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/e4";
			
			Properties properties =new Properties();
			properties.setProperty("user","root");
			properties.setProperty("password", "root");
			
			Connection connection =DriverManager.getConnection(url, properties);
			System.out.print("Connected");
			
			String sql="SELECT * FROM person";
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			boolean next=rs.isBeforeFirst();
			
			java.sql.ResultSetMetaData metaData=rs.getMetaData();
			int count =metaData.getColumnCount();
			System.out.println(next);
			while(rs.next()) 
			{
			for(int i=1;i<=count;i++) System.out.println(metaData.getColumnName(i)+"is"+rs.getObject(i));
			}
			rs.close();
			ps.close();
			connection.close();
			}
			catch(ClassNotFoundException | SQLException e) {}
	}
}
