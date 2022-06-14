package com.qa.flowofcontrol;

public class Scope {

	// Class level scope
	public static String message = "Class Level";
	
	public static void methodOne() {
		// Method level scope
		String methodLevelMsg = "Method Level";
		
		System.out.println(methodLevelMsg);
	}
	
	public static void main(String[] args) {
//		methodOne();
		System.out.println(message);
		
//		System.out.println(methodLevelMsg);
	}
}
