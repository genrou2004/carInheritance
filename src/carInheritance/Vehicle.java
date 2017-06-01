package carInheritance;

public class Vehicle {

	  private int numberOfSeats;
	  private int numberOfWheels;
	  private String vechileType;
	  
	  public Vehicle(){
		  
	  }
	public Vehicle(int numberOfSeats, int numberOfWheels, String vechileType) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.numberOfWheels = numberOfWheels;
		this.vechileType = vechileType;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getVechileType() {
		return vechileType;
	}

	public void setVechileType(String vechileType) {
		this.vechileType = vechileType;
	}
	  
	  
}


