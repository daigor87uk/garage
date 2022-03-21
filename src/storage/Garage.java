package storage;

import java.util.ArrayList;
import java.util.List;

import garage.Vehicle;

public class Garage {
	
	//Using a List<> implementation, store all your vehicles in a Garage class.
	
	public List<Vehicle> storage;
	
	
	//This is a constructor
	
	public Garage () {
		this.storage = new ArrayList<>();
	}
		
		public List<Vehicle> getStorage() {
			return storage;
	}
		
		public void setStorage(List<Vehicle> storage) {
			this.storage = storage;
	}

}
