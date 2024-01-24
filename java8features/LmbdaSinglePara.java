package java8features;

import java.util.Scanner;

/// Created by Pooja Salekar 

interface Sayable1{
	String sayHello(String name);
}
public class LmbdaSinglePara {
	public static void main(String[] args) {
		/*Sayable1 s1 = (name) -> {
			return "Hello" +name;
		};
		System.out.println(s1.sayHello(" Raj"));*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name :");
	String n = sc.nextLine();
	Sayable1 s2 = (name) -> {
		return "Hello" +name;
	};
	System.out.println(s2.sayHello(n));
 }
}
