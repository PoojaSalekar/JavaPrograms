package controlstructures;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double total,percentage;
		System.out.println("Enter First subject marks :");
		int m1=sc.nextInt();
		System.out.println("Enter Second subject marks :");
		int m2=sc.nextInt();
		System.out.println("Enter Third subject marks :");
		int m3=sc.nextInt();
		
		total=m1+m2+m3;
		percentage=total/3;
		if(percentage>90)
		{
			System.out.println("Grade : A+");
		}
		else if(percentage>80)
		{
			System.out.println("Grade : A");
		}
		else if(percentage>70)
		{
			System.out.println("Grade : B");
		}
		else if(percentage>60)
		{
			System.out.println("Grade : C");
		}
		else if(percentage>50)
		{
			System.out.println("Grade : D");
		}
		else if(percentage>40)
		{
			System.out.println("Grade : E");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
