package com.qa.constructors;

public class SuperPerson extends Person {
 
	private static SuperPerson superPerson = null;
	
	private SuperPerson(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static SuperPerson getInstance() {
		if (superPerson == null) {
			superPerson = new SuperPerson( "private person", 4);
		}
		return superPerson;
	}
	
	int colarSize = 14;
}
