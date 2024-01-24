package abstractex;
abstract class Animals{
	public abstract void cats();
	public abstract void dogs();
}
class Cats extends Animals{

	@Override
	public void cats() {
		System.out.println("Cats Meow.");
		
	}
	@Override
	public void dogs() {
		
		
	}
 }
class Dogs extends Animals{
	@Override
	public void cats() {
		
		
	}
	@Override
	public void dogs() {
		System.out.println("Dogs Bark.");
		
	}
	 
 }
public class Animal1 {

	public static void main(String[] args) {
		Cats cat = new Cats();
		cat.cats();
		cat.dogs();
		Dogs dog = new Dogs();
		dog.cats();
		dog.dogs();

	}

}
