import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.VisitorDataManagement.dto.Visitor;
import com.VisitorDataManagement.util.AppConstants;
import com.VisitorDataManagement.util.ConnectionUtil;

public class VisitorDataManagementImp implements VisitorRepository {

	@Override
	public String saveVisitor(Visitor visitor) {
		Connection connection =ConnectionUtil.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(AppConstants.VISITOR_INSERT_QUERY);
			ps.setString(1,visitor.getName());
			ps.setString(2, visitor.getEmail());
			ps.setDate(3,visitor.getVisitedDate());
			ps.setString(4, visitor.getPhone());
			
			ps.executeUpdate();
			connection.close();
			return AppConstants.SUCESS_MESSAGE;
		}
		catch(SQLException e) {
			
		}
		
	return AppConstants.ERROR_MESSAGE;
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getallVisitors() {
		Connection connection =ConnectionUtil.getConnection();
		List<Visitor> list=null;
		String sql="SELECT * FROM vistor";
		try {
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.isBeforeFirst()) {
				list=new ArrayList<>();
				while(rs.next()) {
					Visitor visitor=new Visitor();
					visitor.setId(rs.getInt("id"));
					visitor.setName(rs.getString("name"));
					visitor.setEmail(rs.getString("email"));
					visitor.setVisitedDate(rs.getDate("Visited_Date"));
					
					list.add(visitor);
				}
			}
			
		}
		catch(SQLException e) {}
		
		return null;
	}

	@Override
	public List<Visitor> getVisitorsByVisitingdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor deleteVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
