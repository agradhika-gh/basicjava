
public class Car {
	private String model;
	private String make;
	boolean IsElectric;
	
	Car(String make, String model ) {
		this.model = model;
		this.make = make;
	}
	
	void startCar() {
		System.out.println("Start Car! "+this.model+ " "+ this.make);
	}
	
	boolean displayBoard( ) {
		
		return true;
		
	}

}
