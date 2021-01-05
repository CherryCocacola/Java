package Car;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();  //6254
		
		

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();  //0
			if (problemLocation != 0) {
				System.out.println(car.tires[problemLocation - 1].location + " HankookTire");
				car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
			}
			System.out.println("----------------------------------------");
		}
	}
}
