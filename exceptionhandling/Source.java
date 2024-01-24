package exceptionhandling;

public class Source {
	public static void checkAge(int age) throws MyException{
		if(age>15) {
			System.out.println("Valid");
		}else
			throw new MyException("Invalid");
	}
	public static void main(String[] args) {
		try {
			checkAge(22);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
