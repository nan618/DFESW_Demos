package com.qa.flowofcontrol;

public class FlowOfControl {

	public static void methodOne() {
		System.out.println("Line 1");
	}
	
	public static void methodTwo() {
		System.out.println("Line 2");
	}
	
	// Code execution STARTS in the main method
	// Then it runs line by line
	// The order is: Line 16, 17, 5, 6, 7, 18, 9, 10, 11, 19
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		System.out.println("Line 3");
	}
}
