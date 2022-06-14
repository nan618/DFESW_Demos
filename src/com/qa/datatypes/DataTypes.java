package com.qa.datatypes;

public class DataTypes {

//	DataType variableName = value;

//  non-primitive (object) datatypes (start with capital letters)
	static String myString = "Text";
	
//	primitive datatypes (lowercase)
	static int age;
	
// 	float and double are used for decimal numbers	
//	float bankBalance = 4999.99f;
	static double bankBalance = 4999.99;
	
//	boolean values are either true or false
	static boolean happy = true;
	

//  characters are single unicode characters
	static char letter = 'a';

//	Methods can return any datatype, including void (meaning returns nothing)
	public static String returnsSomething() {
		return "hello";
	}
	
	public static void main(String[] args) {
		System.out.println(happy);
	}
}
