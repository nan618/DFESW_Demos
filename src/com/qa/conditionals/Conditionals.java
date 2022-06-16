package com.qa.conditionals;

public class Conditionals {
	
	public Integer divide(int numOne, int numTwo) { 
		if (numOne > numTwo) { 
			return numOne / numTwo;
        } 
		else {
        	return null;
        }
	}

	public Integer sum(int numOne, int numTwo) { 
		if (numOne < numTwo) { 
			return numOne + numTwo;
        } 
		else {
        	return null;
        }
	}

}
