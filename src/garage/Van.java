package garage;

public class Van extends Vehicle {

	
	//instances variables
	
	boolean usedForConstruction;
	float vanWeight;
	float vanHeight;

	//Essentially an inventory
	public void showContainer() {
		System.out.println("A sausage roll and a pack of fags");
	
		}

	@Override
	public String toString() {
		return "Van [usedForConstruction=" + usedForConstruction + ", vanWeight=" + vanWeight + ", vanHeight="
				+ vanHeight + ", isCustom=" + isCustom + "]";
	}

	public Van(int id, String model, String brand, boolean isCustom, boolean usedForConstruction, float vanWeight, float vanHeight) {
		super(id, model, brand, isCustom);
		this.usedForConstruction = usedForConstruction;
		this.vanHeight = vanHeight;
		this.vanWeight = vanWeight;

	}
	
}