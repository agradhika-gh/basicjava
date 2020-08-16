
public class Tower {
	//Fields
	String name;
	
	//Methods
	
	public void draw() {
		
		drawPole();
		drawBase();
		drawTitle();
		
	}
	
	public void drawPole() {
		
		for (int i = 0;i<=5;i++) {
			System.out.println("   "+"|");
		}
		
	}
	
	public void drawBase() {
		for (int i = 0;i<=8;i++) {
			System.out.print("_");
		}
		System.out.println();
	}
	
	public void drawTitle() {
		System.out.println(" "+name);
		
	}
	
	
}
