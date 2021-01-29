package com.css.corejava;

import java.util.Arrays;

public class Batch {
	private int batchCode;
	private String startDate;
	private String endDate;
	private Trainee[] trainees;
	private int i;
	
	
	
	
public Batch(int batchCode, String startDate, String endDate, Trainee[] trainees) {
		super();
		this.batchCode = batchCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainees = trainees;
	}


//	public Batch(int batchCode, String startDate, String endDate, Trainee[] trainee) {
//		super();
//		this.batchCode = batchCode;
//		this.startDate = startDate;
//		this.endDate = endDate;
//		this.trainees = trainee;
//	}
	

	public int getBatchCode() {
		return batchCode;
	}


	public void setBatchCode(int batchCode) {
		this.batchCode = batchCode;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public Trainee[] getTrainees() {
		return trainees;
	}


	public void setTrainees(Trainee[] trainee) {
		this.trainees = trainee;
	}
	

	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
				+ Arrays.toString(trainees) + "]";
	}


	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
		
	
	public Trainee[] getTrainee(String gender) {
		Trainee[] foundTrainees=new Trainee[3];
		for(Trainee trainee:trainees) {
			String gen=trainee.getGender();
			if(gen.equals(gender)) {
				foundTrainees[i]=trainee;
				i++;
			}
		}
		return foundTrainees;
		
		
	}
	
	
	public Trainee[] getTrainee(int age) {
		Trainee[] foundTrainees=new Trainee[3];
		for(Trainee trainee:trainees) {
			int tage=trainee.getAge();
			if(tage==age) {
				foundTrainees[i]=trainee;
				i++;
				
			}
		}
		return foundTrainees;
		
		
	}
	

}
