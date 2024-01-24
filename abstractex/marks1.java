package abstractex;
abstract class Marks{
	 public abstract int getPercentage();
}
class StudentA extends Marks{

	@Override
	public int getPercentage() {
		
		return 3;
		
	}
	
}
class StudentB extends Marks{

	@Override
	public int getPercentage() {
		return 4;
		
	}
	
}
public class marks1 {

	public static void main(String[] args) {
		

	}

}
