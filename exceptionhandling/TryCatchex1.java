package exceptionhandling;

public class TryCatchex1 {

	public static void main(String[] args) {
		try {
			int a=25/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Rest of code.....");
	}

}
