package first;

public class ExtendsTest {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(4, 1500.0);
		System.out.println(vehicle);

		Car car = new Car(4, 1200.0, 5);
		System.out.println(car);

		Truck truck = new Truck(6, 8000.0, 3, 10000.0);
		System.out.println(truck);
	}
}
