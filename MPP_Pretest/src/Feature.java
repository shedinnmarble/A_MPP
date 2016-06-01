import java.util.Date;

public class Feature {
	private Date dueDate;
	private int effort;
	private int testEffort;
	private String featureName;
	private Project project;
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public Feature(String featureName, Project project, Sprint sprint) {
		super();
		this.featureName = featureName;
		this.project = project;
		this.sprint = sprint;
	}
	private Sprint sprint;
	private Developer developer;
	private Tester tester;

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public Tester getTester() {
		return tester;
	}
	public void setTester(Tester tester) {
		this.tester = tester;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public int getEffort() {
		return effort;
	}
	public void setEffort(int effort) {
		this.effort = effort;
	}
	public int getTestEffort() {
		return testEffort;
	}
	public void setTestEffort(int testEffort) {
		this.testEffort = testEffort;
	}
}
