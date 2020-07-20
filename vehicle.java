
public class vehicle {
	
    String make;
    String model;
    int year;
    int price;
    
	
	void premiumCar(String make, int price) {
		if ((make == "Tesla") && (price > 100000))
			System.out.println("The car is a premium model");
	}
	
	void carDetails(String make, String model, int year, int price) {
		boolean newPreOwned;
		
		System.out.println("This is the make: "+make);
		System.out.println("This is the model: "+model);
		System.out.println("This is the year: "+year);
		System.out.println("This is the price: "+price);
		if (year > 2001)
			newPreOwned = false;
		else 
			newPreOwned = true;
		if (newPreOwned) 
			System.out.println("This is the Preowned car.");
		else 
			System.out.println("This is the brand NEW!!");
			
	}

}
