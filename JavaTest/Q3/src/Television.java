import java.util.ArrayList;

public class Television {
	
	String color;
	String size;
	String model;
	String make;
	double price;
	
	Television(String color){
		this.color = color;
	}
	
	Television(String color, String size){
		this.color = color;
		this.size = size;
	}

	Television( String size, String model, double price){
		this.color = color;
		this.size = size;
		this.model = model;
		this.price = price;
	}
	
	String getTVColor(){
		return this.color;
	}
	
	String getTVSize(){
		return this.size;
	}
	
	String getTVModel(){
		return this.model;
	}
	
	double getTVPrice(){
		return this.price;
	}

}
