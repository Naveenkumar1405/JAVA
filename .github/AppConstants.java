public interface AppConstants {
	String DRIVER_NAME="com.mysql.cj.jdbc.driver";
	String URL="jdbc:mysql://localhost:3306/VisitorDataManagement";
	String USER_NAME="root";
	String PASSWORD="root";
	String SUCESS_MESSAGE="Operation Sucessful";
	String ERROR_MESSAGE="Something Went Wrong";
	String VISITOR_INSERT_QUERY="INSERT INTO visitor(name,email,visited_date,phone) VALUES (?,?,?,?)";
	
}
