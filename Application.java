
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle vehicle1 =  new vehicle();
		vehicle1.make = "Tesla";
		vehicle1.price = 200000;
		vehicle1.premiumCar(vehicle1.make, vehicle1.price);
		
		vehicle vehicle2 =  new vehicle();
		vehicle2.make = "Tesla";
		vehicle2.model = "Model S";
		vehicle2.year = 2020;
		vehicle2.price = 200000;
		vehicle2.carDetails(vehicle2.make,vehicle2.model,vehicle2.year,vehicle2.price);		
		
		geoMetricShapes shape1 = new geoMetricShapes();
		shape1.length = 10;
		shape1.width = 10;
		shape1.whatShape(shape1.length, shape1.width);
		shape1.area(shape1.length, shape1.width);
		
		geoMetricShapes shape2 = new geoMetricShapes();
		shape2.length = 15;
		shape2.width = 10;
		shape2.whatShape(shape2.length, shape2.width);
		shape2.area(shape2.length, shape2.width);
	}

}
