package controlstructures;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary :");
		double salary = sc.nextInt();
		double tax;
		if(salary<25000)
		{
			tax=salary*0.1;
		}
		else
		{
			tax=salary*0.15;
		}
		System.out.println("Tax is :"+tax);
	}

}
