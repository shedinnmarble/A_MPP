import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
	private List<Feature> featureList;

	public List<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	public Tester(String name, String ssn, String emailAddr, String employeeID) {
		super.name = name;
		super.ssn = ssn;
		super.emialAddr = emialAddr;
		super.employeeID = employeeID;
		Role tester = new Role();
		tester.setRoleType(Role.RoleType.Tester);
		super.roleList = new ArrayList<Role>();
		super.roleList.add(tester);
	}

	@Override
	protected void showResponsibilities() {
		// TODO Auto-generated method stub
		for (Feature feature : featureList) {
			System.out.println("feature name:" + feature.getFeatureName());
		}
	}
}