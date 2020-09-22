
import package1.Displaytext;


public class Application {

	public static void main(String[] args) {
		
		//Instantiate method in package1
		Displaytext display1 = new Displaytext();
		display1.pkgMethod();
		
		//Instantiate method in package2
		package2.Displaytext display2 = new package2.Displaytext();
		display2.pkgMethod();
		
	
	}

}
