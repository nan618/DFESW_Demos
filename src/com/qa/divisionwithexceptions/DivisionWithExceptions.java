package com.qa.divisionwithexceptions;

import java.util.Scanner; // Import the Scanner class

public class DivisionWithExceptions {
	public void DivisionException(int numOne, int numTwo) throws divisionByFiveException {

		if (numOne == 47 || numTwo == 5) {
			throw new divisionByFiveException();
		}

		System.out.println(numOne / numTwo);

	}

	public void questionOne() {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Please enter two integers:");
		int numOne =myObj .nextInt();
		int numTwo =myObj .nextInt();

		try {
			System.out.println(numOne/numTwo);
		} catch (ArithmeticException ae) {
			System.out.println("You can't divide by zero, dummy :)");
//			
	}
	}

}
