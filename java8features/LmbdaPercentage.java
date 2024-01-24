package java8features;

import java.util.Scanner;

//Created by Pooja Salekar 

interface Percentage{
	double percentage(double m1,double m2,double m3);
}
public class LmbdaPercentage {

	public static void main(String[] args) {
		Percentage p = (m1,m2,m3) ->{
			return (m1+m2+m3)/3;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject Marks :");
		double a = sc.nextDouble();
		System.out.println("Enter second subject Marks :");
		double b = sc.nextDouble();
		System.out.println("Enter third subject Marks :");
		double c = sc.nextDouble();
		System.out.println("Percentage :"+p.percentage(a, b, c));
	}

}
