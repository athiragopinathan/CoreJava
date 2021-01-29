package com.css.basic;

public class Car {
	private String color;
	private String model;
	private int year;
	
	public Car(String color, String model, int year) {
		super();
		this.color = color;
		this.model = model;
		this.year = year;
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public static void main(String[] args) {
		Car car1 =new Car ("Red","Alto",1998);
		Car car2 =new Car ("Black","Swift",2004);
		
		
		System.out.println(car1.getModel());
		System.out.println(car2.getColor());
		System.out.println(car1.getYear());
		

	}

}
