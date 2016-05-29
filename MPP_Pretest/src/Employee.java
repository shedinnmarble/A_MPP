import java.util.List;

public abstract class Employee {
	protected List<Role> roleList;
	protected String name;
	protected String ssn;
	protected String emialAddr;
	protected String employeeID;
	protected abstract  void showResponsibilities();
	public void changeRole(List<Role> listRole){
		this.roleList=listRole;
	}
		
}
