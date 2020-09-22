
public class Application {

	public static void main(String[] args) {
		
		System.out.println("*******************Constructor1 *******************");
		
		Television tv1 = new Television("Black&White!");
		System.out.println("Constructor1 - Is the TV Black/White or Color? " + tv1.getTVColor());
		
		System.out.println("*******************Constructor2 *******************");
		
		Television tv2 = new Television("Color!","64 Inch");
		System.out.println("Constructor2 - Is the TV Black/White or Color? " + tv2.getTVColor());
		System.out.println("Constructor2 - TV Size? " + tv2.getTVSize());
		
		System.out.println("*******************Constructor3 *******************");
		
		Television tv3 = new Television("64 Inch","Samsung",999.99);
		System.out.println("Constructor3 - TV Size? " + tv3.getTVSize());
		System.out.println("Constructor3 - TV Model? " + tv3.getTVModel()); 
		System.out.println("Constructor3 - Price of the TV? " + tv3.getTVPrice()); 
	}

}
