package com.qa.helloworld;

public class HelloWorld {
	
	public static void main(String[] args) {
//		printMessage("This is my message!");
//		printMessage("A different message");
		
		String result = returnString("Original Value");
		System.out.println(result);
	}

	
	public static void printMessage(String myMessage) {
//		DataType variableName = value;
//		String myMessage = "Hello world";
		
//		println is used to print text to new lines
		System.out.println(myMessage);
		
//		print is used to print text to the same line
//		System.out.print("Hello World");
	}
	
	public static String returnString(String myMessage) {
		return myMessage + " I've added something to this!!!";
	}
}
