package com.css.corejava;

public class Trainee {
	private String traineeId;
	private String traineeName;
	private int contactNum;
	private String emailId;
	private String gender;
	private int age;
	public Trainee() {
		super();
	}

	public Trainee(String traineeId, String traineeName, int contactNum, String emailId, String gender, int age) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.contactNum = contactNum;
		this.emailId = emailId;
		this.gender = gender;
		this.age = age;
	}
	

	


	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNum=" + contactNum
				+ ", emailId=" + emailId + ", gender=" + gender + ", age=" + age + "]";
	}





	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public int getContactNum() {
		return contactNum;
	}

	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
