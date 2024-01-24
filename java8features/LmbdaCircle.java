package java8features;

import java.util.Scanner;

//Created by Pooja Salekar 

interface Circle{
	
	double area(float r);
}
public class LmbdaCircle {

	public static void main(String[] args) {
		Circle c = (r) -> {
			return 3.14*r*r;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		float n = sc.nextFloat();
		System.out.println("Area of Circle :"+c.area(n));
	}

}
