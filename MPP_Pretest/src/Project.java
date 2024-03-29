import java.util.List;

public class Project {
	private ProjectManager projectManager;
	private List<Sprint> sprintList;
	private List<Feature> featureList;
	private String projectName;

	public Project(String projectName, ProjectManager projectManager, List<Sprint> sprintList,
			List<Feature> featureList) {
		this.projectManager = projectManager;
		this.sprintList = sprintList;
		this.featureList = featureList;
		this.projectName = projectName;
	}

	public ProjectManager getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}

	public List<Sprint> getSprintList() {
		return sprintList;
	}

	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}

	public List<Feature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
