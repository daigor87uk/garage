package main;

import garage.Car;
import garage.Motorbike;
import garage.Van;
import storage.Garage;

public class Runner {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Car car = new Car(0, null, null, false, 0, 0, 0, 0);
		Motorbike motorbike = new Motorbike(0, null, null, false, 0, false, false);
		Van van = new Van(0, null, null, false, false, 0, 0);
		
	}

}
