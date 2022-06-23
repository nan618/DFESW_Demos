package com.qa.person;

public class RunninPerson {

	public static void main(String[] args) {
		Person anoush = new Person("Anoush", 29, "Trainer");
		Person dee = new Person("Dee", 29, "Student");
		Person james = new Person("James", 29, "Student");

		anoush.getName();

		// Testing the toString() method - Which is called when objects are printed.
//		System.out.println(anoush);
//		System.out.println(dee);
//		System.out.println(james);

		ListPerson pm = new ListPerson();

		pm.add(anoush);
		pm.add(dee);
		pm.add(james);

//		pm.printList();

		pm.search("Dee");

		pm.printEachPerson();
	}

}

