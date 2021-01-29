package com.css.corejava;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee[] trainees=new Trainee[3];
		trainees[0]= new Trainee("123a","athi",790785628,"athira@gmail.com","male",22);
		trainees[1]= new Trainee("124a","athu",790785627,"aathira@gmail.com","female",22);
		trainees[2]= new Trainee("125a","athia",790785626,"aathira@gmail.com","male",21);
		
		Batch batch=new Batch();
		  
		  
		System.out.println(batch.getTrainee(21));
		System.out.println(batch.getTrainee("male"));
		
		
	}
	

}
