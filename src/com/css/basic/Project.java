package com.css.basic;

public class Project {
	private int projectId;
	private String projectName;
	private String projectHead;
	private int noOfResources;

	
	public Project(int projectId, String projectName, String projectHead, int noOfResources) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectHead = projectHead;
		this.noOfResources = noOfResources;
	}
	
	

	public int getProjectId() {
		return projectId;
	}



	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getProjectHead() {
		return projectHead;
	}



	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}



	public int getNoOfResources() {
		return noOfResources;
	}



	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}



	public static void main(String[] args) {
		Project myProject = new Project(11,"Java","Gopi",10);
		System.out.println("Project id is " + myProject.getProjectId());
		System.out.println("Project name is " + myProject.getProjectName());
		System.out.println("Project head is " + myProject.getProjectHead());
		System.out.println("Number of Resources " + myProject.getNoOfResources());
		

	}

}
