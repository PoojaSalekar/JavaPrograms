package java8features;

import java.util.Scanner;

// Created by Pooja Salekar

interface SimpleInterest{
	
	double simpleInterest(float p,float n,float r);
}
public class LmbdaSimpleInterest {

	public static void main(String[] args) {
		SimpleInterest s1 = (p,n,r) ->{
			return (p*r*n)/100;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price :");
		float a = sc.nextFloat();
		System.out.println("Enter Number :");
		float b = sc.nextFloat();
		System.out.println("Enter rate :");
		float c = sc.nextFloat();
		System.out.println("Simple Interest :" +s1.simpleInterest(a,b,c));
	}

}
