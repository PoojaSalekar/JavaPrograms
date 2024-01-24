package exceptionhandling;

public class BadFood {

	
		public static void checkFruit(String fruitName) throws BadFoodException{
			if(fruitName.equalsIgnoreCase("mango")) {
				System.out.println("I like "+fruitName);
			}
			else
				throw new BadFoodException("I dont like"+fruitName);
		}
		public static void main(String[] args) {
			try {
				checkFruit("mango");
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Rest of the code.....");
	}

}
