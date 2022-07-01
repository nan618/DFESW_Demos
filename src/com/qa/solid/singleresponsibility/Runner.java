package com.qa.solid.singleresponsibility;

public class Runner {
	public static void main(String[] args) {

		Car myCar = new Car("black", "A5", 5000);

		Car myCar1 = new Car("black", "A5", 5000, false);

		Car MyOtherCar = new Car("Blue", "M5", 7000, true);

		System.out.println(myCar1.getMileage());
Driver driver = new Driver();
		
		driver.drive(myCar1, 500);

//@@ -14,5 +17,15 @@ public static void main(String[] args) {

		System.out.println(myCar1.getMileage());

		Mechanic mech = new Mechanic();
		mech.setCar(myCar1);
		mech.paintCar("Red");
		mech.changeSpoiler(true);

		mech.setCar(MyOtherCar);
		mech.paintCar("Black");
		mech.changeSpoiler(false);


	}	
}


