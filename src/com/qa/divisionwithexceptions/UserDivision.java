package com.qa.divisionwithexceptions;

public class UserDivision {

	
    public void divisionException(int numOne, int numTwo) throws divisionByFiveException {

			if (numOne == 47 || numTwo == 5) {
				throw new divisionByFiveException();
			}

			System.out.println(numOne / numTwo);

		}


	}


