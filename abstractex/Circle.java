package abstractex;

public class Circle extends Drawable {

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("inside ovverride method");
		
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.area();
		c.print();
	}
}
