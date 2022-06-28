package com.qa.divisionwithexceptions;

public class RunnerDivisionWithExceptions {
	public static void main(String[] args) {

		boolean flag = true;

		DivisionWithExceptions ex = new DivisionWithExceptions();

		try {
			ex.DivisionException (47, 5);
		} catch (divisionByFiveException mbfe) {
			mbfe.printStackTrace();
		}

	}
}