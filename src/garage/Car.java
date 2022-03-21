package garage;

public class Car extends Vehicle { 

	//data to be initialised
	
	private float price;
	private int noOfDoors;
	private int noOfWheels;
	private int yearOfManufacturing;
	
	//data to be pulled from vehicle + added data
		
	//this.dataInitialiser --- initialises the data
	
	public void vroom() {
		System.out.println("vroom vroom");
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", noOfDoors=" + noOfDoors + ", noOfWheels=" + noOfWheels
				+ ", yearOfManufacturing=" + yearOfManufacturing + ", isCustom=" + isCustom + "]";
	}

	public Car(int id, String model, String brand, boolean isCustom, float price, int noOfDoors, int noOfWheels,
			int yearOfManufacturing) {
		super(id, model, brand, isCustom);
		this.price = price;
		this.noOfDoors = noOfDoors;
		this.noOfWheels = noOfWheels;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	
	
	}
