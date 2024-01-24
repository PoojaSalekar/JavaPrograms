package exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		System.out.println("case1 : Exception doesn't occur");
		try {
			int a=25/5;
			System.out.println("Division:"+a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block always executes ");
		}
		System.out.println("Rest of the code.......");
		System.out.println("------------------------------------------------");
		
		System.out.println("\ncase2 : where Exception is occur and handled");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case2 :Finally block always executes ");
		}
		System.out.println("case2 :Rest of the code.......");
		System.out.println("------------------------------------------------");
		
		System.out.println("\ncase3 : where Exception occurs but doesn't handled");
		try {
			int a=25/0;
			System.out.println("Division:"+a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case3 :Finally block always executes ");
		}
		System.out.println("case3 :Rest of the code.......");
		System.out.println("------------------------------------------------");
	}

}
