package com.qa.vehicle;

public class Vehicle1 {
	@Override
	public String toString() {
		return "Vehicle [" + (make != null ? "make=" + make + ", " : "")
				+ (colour != null ? "colour=" + colour + ", " : "") + "numOfWheels=" + numOfWheels + "]";
	}

	private String make;
	private String colour;
	private int numOfWheels;

	public Vehicle1(String make, String colour, int numOfWheels) {
		super();
		this.make = make;
		this.colour = colour;
		this.numOfWheels = numOfWheels;
	}
	public void Vehicle(String make2, String colour2, int numOfWheels2) {
		// TODO Auto-generated constructor stub
	}
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public void calculateBill() {
			System.out.println("");
	}

	
	
	
	

}
