package garage;

public class Motorbike extends Vehicle {

	//instance variables
	
	float frontWheelThickness;
	boolean hasPassengerSpace;
	boolean hasLuggageSpace;

	//methods
	public void wheelie() {
		System.out.println("Im doing a wheelie, watch me");
	}
	
	public void stoppie() {
		System.out.println("Mum I'm Scared");
	}

	@Override
	public String toString() {
		return "Motorbike [frontWheelThickness=" + frontWheelThickness + ", hasPassengerSpace=" + hasPassengerSpace
				+ ", hasLuggageSpace=" + hasLuggageSpace + ", isCustom=" + isCustom + "]";
	}

	public Motorbike(int id, String model, String brand, boolean isCustom, float frontWheelThickness,
			boolean hasPassengerSpace, boolean hasLuggageSpace) {
		super(id, model, brand, isCustom);
		this.frontWheelThickness = frontWheelThickness;
		this.hasPassengerSpace = hasPassengerSpace;
		this.hasLuggageSpace = hasLuggageSpace;
	}
	
	
	
}
