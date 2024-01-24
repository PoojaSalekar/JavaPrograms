

package codingchallenges;

/* created by Pooja Salekar */

class MyException extends Exception{
	public MyException(String msg) {
		super();
	}
}
public class Question3 {
	public void checkAge(int age) throws MyException{
		if(age<15)
		{
			throw new MyException("not valid");
		}
		else
		{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) throws MyException{
		Question3 question = new Question3();
		question.checkAge(22);
	}
}
