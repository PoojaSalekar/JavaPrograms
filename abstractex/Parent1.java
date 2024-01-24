package abstractex;

abstract class Parent {
	public abstract void message();
}
 class Subclass1 extends Parent{

	@Override
	public void message() {
		System.out.println("This is First Method");		
	}
	
}
 class Subclass2 extends Parent{

		@Override
		public void message() {
			System.out.println("This is Second Method");		
		}
		
	}
public class Parent1{
	public static void main(String[] args) {
		Subclass1 s1= new Subclass1();
		s1.message();
		Subclass2 s2 = new Subclass2();
		s2.message();

	}

}
