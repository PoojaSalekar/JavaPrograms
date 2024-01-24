package controlstructures;

import java.util.Scanner;

public class License {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if(age>18)
		{
			System.out.println("Eligible for License....");
		}
		else
		{
			System.out.println("Not Eligible for License....");
		}
	}

}
