package switchcase;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the Second number :");
		
		int b = sc.nextInt();
		System.out.println("+ for addition");
		System.out.println("- for substraction");
		System.out.println("* for Multiplication");
		System.out.println("/ for division");
		System.out.println("Enter your choice : ");
		char choice = sc.next().charAt(0);
		char ch = 0;
		do {
			switch(choice)
			{
				case '+' :System.out.println("The addtion of given number is "+(a+b));
				break;
				case '-' :System.out.println("The substraction of given number is "+(a-b));
				break;
				case '*' :System.out.println("The Multiplication of given number is "+(a*b));
				break;
				case '/' :System.out.println("The division of given number is "+(a/b));
				break;
				default : System.out.println("Invalid choice...");
			}
		}while(ch=='Y' || ch=='y');
		System.out.println("Do you want to continue?");
		System.out.println("Press Y or y");
		ch=sc.next().charAt(0);
	}

}
