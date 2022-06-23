package com.qa.vehicle;

public class Running {

	
		public static void main(String[] args) {

			// 3 Vehicles - one Car, one Van, one Motorcycle
			// ALL THREE ARE ALSO VEHICLES
			Car car = new Car("BMW", "Black", 4, true, 5);
			Van van = new Van("Mercedes", "Grey", 4, 500);
			Motorcycle mc = new Motorcycle("Ducati", "Blue", 2, 35);

			Garage garage = new Garage();

			// Add all three vehicles to the garage!
			garage.add(car);
			garage.add(van);
			garage.add(mc);

			// Printing my vehicles
			garage.printList();

			// 'Calculate bills'
//			garage.calculateBills();

			// Remove Cars
			garage.removeByType("Car");
			garage.printList();
		}

	}
		

	}

}
