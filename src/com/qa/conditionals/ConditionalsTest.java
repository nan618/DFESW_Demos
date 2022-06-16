package com.qa.conditionals;

public class ConditionalsTest {

	public static void main(String[] args) {
		Conditionals conditionals = new Conditionals();
		Integer ans = conditionals.divide(1, 3);
		if (ans == null) {
        	System.out.println("that the division cannot be performed.");		
		}
		else {
			System.out.println(ans);
		}
		
		Integer ansSum = conditionals.sum(1, 3);
		if (ansSum == null) {
        	System.out.println("that the sum cannot be performed.");		
		}
		else {
			System.out.println(ansSum);
		}

	}

}
