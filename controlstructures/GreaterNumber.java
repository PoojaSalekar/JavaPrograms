package controlstructures;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number :");
		int a = sc.nextInt();
		System.out.println("Enter a second number :");
		int b = sc.nextInt();
		System.out.println("Enter a third number :");
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("First number is greater....");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second number is greater....");
		}
		else if(c>a && c>b)
		{
			System.out.println("Third number is greater....");
		}
		else if(a==b && a>c) 
		{
			System.out.println("First and Second number is greater....");
		}
		else if(b==c && b>a) 
		{
			System.out.println("Second and Third number is greater....");
		}
		else if(c==a && c>b) 
		{
			System.out.println("First and Third number is greater....");
		}
		else
		{
			System.out.println("All three numbers are equals......");
		}
	}

}
