import java.util.List;

import com.VisitorDataManagement.dto.Visitor;

public interface VisitorRepository 
{
	public String saveVisitor(Visitor visitor);
	public String updateVisitor(Visitor visitor);
	public Visitor getVisitorById(int id);
	public Visitor getVisitorByPhone(String phone);
	public Visitor getVisitorByEmail(String email);
	public List<Visitor> getallVisitors();
	public List<Visitor> getVisitorsByVisitingdate();
	public Visitor deleteVisitorById(int id);

}
