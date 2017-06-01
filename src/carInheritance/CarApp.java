package carInheritance;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car(123456, "x8", "2017", 140, 4,4,"BMW");
		Car car2 = new Car(987456, "x9", "2018", 230, 2, 4, "BMW");
		
		System.out.println(car.getVechileType());
		System.out.println(car.getModel());
		System.out.println(car.getMake());
		System.out.println(car2.getVechileType());
		System.out.println(car2.getVechileType());
		System.out.println(car2.getModel());
		System.out.println(car2.getMake());
		System.out.println(car2.getSpeed());
		
		car.setMake("2013");
		car.setModel("x5");
		car2.setSpeed(120);
		
		System.out.println(car.getVechileType());
		System.out.println(car.getModel());
		System.out.println(car.getMake());
		System.out.println(car2.getVechileType());
		System.out.println(car2.getVechileType());
		System.out.println(car2.getModel());
		System.out.println(car2.getMake());
		System.out.println(car2.getSpeed());
		
	}

}
