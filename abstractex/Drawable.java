package abstractex;

public abstract class Drawable {
	public Drawable() {
			System.out.println("Constructer inside abstract class");
	}
	public abstract void area();
	public void print() {
		System.out.println("inside non abstract method of abstract class");
			
		
	}
}
