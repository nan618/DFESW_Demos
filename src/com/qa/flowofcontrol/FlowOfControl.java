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
	public static void main(String[] args) {
		methodOne();
		methodTwo();
		System.out.println("Line 3");
	}
}
