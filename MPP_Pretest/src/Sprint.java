import java.util.List;

public class Sprint {
	private Project project;
	private List<Feature> featureList;
	private ScrumMaster scrumMaster;
	private String sprintName;

	public Sprint(String sprintName, Project project, List<Feature> featureList, ScrumMaster scrumMaster) {
		super();
		this.project = project;
		this.featureList = featureList;
		this.scrumMaster = scrumMaster;
		this.sprintName = sprintName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	public ScrumMaster getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(ScrumMaster scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public String getSprintName() {
		return sprintName;
	}

	public void setSprintName(String sprintName) {
		this.sprintName = sprintName;
	}
}
