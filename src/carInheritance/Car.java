package carInheritance;

public class Car extends Vehicle{
	
	private int registrationNumber;
	private String model;
	private String make;
	private int speed;
	
	
	public Car(int registrationNumber, String model, String make, int speed,int numberOfSeats, int numberOfWheels, String vechileType) {
		super(numberOfSeats,numberOfWheels, vechileType);
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.make = make;
		this.speed = speed;
	}
	
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	

}
