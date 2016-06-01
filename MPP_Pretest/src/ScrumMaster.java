import java.util.ArrayList;
import java.util.List;

public class ScrumMaster extends Employee {

	private List<Sprint> sprintList;

	public List<Sprint> getSprintList() {
		return sprintList;
	}

	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}

	ScrumMaster(String name, String ssn, String emailAddr, String employeeID) {
		super.name = name;
		super.ssn = ssn;
		super.emialAddr = emailAddr;
		super.employeeID = employeeID;

		Role sm = new Role();
		sm.setRoleType(Role.RoleType.ScrumMaster);
		super.roleList = new ArrayList<Role>();
		super.roleList.add(sm);
	}

	@Override
	protected void showResponsibilities() {
		// TODO Auto-generated method stub
		for(Sprint sprint:sprintList){
			System.out.println("responsible sprint:"+sprint.getSprintName());
		}

	}
}
