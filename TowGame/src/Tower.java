
public class Tower {
	//Fields
	String name;
	
	//Methods
	
	public void draw() {
		
		drawPole();
		
		//draw small disk
		Disk small = new Disk(4);
		small.draw();
		
		//draw medium disk
		Disk medium = new Disk(8);
		medium.draw();
		
		//draw big disk
		Disk big = new Disk(12);
		big.draw();
		
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
