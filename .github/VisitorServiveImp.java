
import com.VisitorDataManagement.dto.Visitor;
import com.VisitorDataManagement.repository.VisitorDataManagementImp;
import com.VisitorDataManagement.repository.VisitorRepository;

public class VisitorServiveImp implements VisitorService{
	
	private VisitorRepository repository;
	{
		repository=new VisitorDataManagementImp();
	}

	@Override
	public String saveVisitor(Visitor visitor) {
		return repository.saveVisitor(visitor);
		
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
		// TODO Auto-generated method stub
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
