
public class geoMetricShapes {
	int length;
	int width;
	
	void whatShape(int length, int width) {
		
		if (length == width) {
			System.out.println("This is a Square");
			System.out.println("Length and Width are Equal for a Square. Length and Width is :"+length);
		} 
		else if ( length > width){
			System.out.println("This is a Rectangle");
			System.out.println("Length is greater than the Width for a Rectangle. Length is :"+length+" Width is :"+width);
		} else if ((length <= 0) && (width <= 0)) {
			System.out.println("Length and/or Width is not valid!!");
		}
	}//End of whatshape
	
	void area(int length, int width) {
	
		int areaIs = length * width;
		System.out.println("Area is : "+areaIs);
		
	} //End of Area
	
} //End of geoMetricShapes
