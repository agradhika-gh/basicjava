import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		Car honda = new Car("Honda","Accord");
		Car kia = new Car("Kia","Sportage");
		Car miniCooper = new Car("Mini","Cooper");
		
		cars.add(honda);
		cars.add(kia);
		cars.add(miniCooper);
		
		for(Car car: cars) {
			car.startCar();
			car.displayBoard();
		}
		
	}

}
